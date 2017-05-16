import java.util.Comparator;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeSet;


public class Shop {

	private double kasa;
	private HashMap<String, HashMap<String, HashMap<String, MusicalInstrument>>> instrumenti;
	private MusicalInstrument bestSeller;
	
	public Shop(double kasa) {
		this.kasa = kasa;
		instrumenti = new HashMap<>();
	}


	public void addInstrument (MusicalInstrument instrument){
		if(!this.instrumenti.containsKey(instrument.getType())){
			this.instrumenti.put(instrument.getType(), new HashMap<>());
			if(!this.instrumenti.get(instrument.getType()).containsKey(instrument.getVid())){
				this.instrumenti.get(instrument.getType()).put(instrument.getVid(), new HashMap<>());
			}
		}
		instrumenti.get(instrument.getType()).get(instrument.getVid()).put(instrument.getName(), instrument);
	}
	
	
	public void sellInstrument(MusicalInstrument instrument, int broika){
		if(instrument.getStock() >= broika){
			kasa += (instrument.getPrice()*broika);
			instrument.sellStock(broika);
			System.out.println("Продажба:");
			System.out.println("Артикул: " + instrument.getName() + ", количество: " + broika + ". Обща сума прибрана в касата: " + (instrument.getPrice()*broika));
			//this.instrumenti.get(instrument.getGroup()).get(instrument.getType()).get(instrument.getName()).setStock(instrument.getStock()-broika);
		}
		else{
			System.out.println("Няма достатъчна наличност от исканият продукт.");
		}
	}
	
	public void receiveDelivery(MusicalInstrument instrument, int broika){
		instrumenti.get(instrument.getVid()).get(instrument.getType()).get(instrument.getName()).addStock(broika);
		System.out.println("Приемане на стока:");
		System.out.println("Получени са " + broika + " от продуктът " + instrument.getName() + ". Актуализирана наличност: " + instrument.getStock());
	}
	
	public void showCatalogueByType(){
		System.out.println("Продукти в магазина сортирани по тип:");
		System.out.println();
		for (Entry <String, HashMap<String, HashMap<String, MusicalInstrument>>> entry : instrumenti.entrySet()) {
			System.out.println(entry.getKey() + ":");
			for (Entry <String, HashMap<String, MusicalInstrument>> entry1 : entry.getValue().entrySet()) {
				System.out.println("      " + entry1.getKey() + ":");
				for (Entry<String, MusicalInstrument> entry2 : entry1.getValue().entrySet()) {
					System.out.println("            " + entry2.getValue().getName());
				}
			}
		}
	}
	
	public void showCatalogueByName(){
		System.out.println("Продукти в магазина сортирани по име:");
		printCatalogue(new CompByName());
	}
	public void showCatalogueByPrice(){
		
		System.out.println("Моля изберете начин на сортиране:");
		System.out.println("За възходящ ред натиснете '+'");
		System.out.println("За низходящ ред натиснете '-'");
		Scanner scan = new Scanner(System.in);
		char x = scan.nextLine().charAt(0);
		if(x == '-'){
			System.out.println("Продукти в магазина сортирани по цена(Низходящ ред):");
			printCatalogue(new CompByPriceDesc());	
		}
		else{
			System.out.println("Продукти в магазина сортирани по цена(Възходящ ред):");
			printCatalogue(new CompByPrice());	
		}
	}
	public void showCatalogueByStock(){
		System.out.println("Продукти в магазина сортирани по наличност:");
		printCatalogue(new CompByStock());
	}
	private void printCatalogue(Comparator<MusicalInstrument> comp){
		TreeSet<MusicalInstrument> katalog = new TreeSet<MusicalInstrument>(comp);
		for (Entry <String, HashMap<String, HashMap<String, MusicalInstrument>>> entry : instrumenti.entrySet()) {
			for (Entry <String, HashMap<String, MusicalInstrument>> entry1 : entry.getValue().entrySet()) {
				for (Entry<String, MusicalInstrument> entry2 : entry1.getValue().entrySet()) {
					katalog.add(entry2.getValue());
				}
			}
		}
		for(MusicalInstrument inst : katalog){
			System.out.println(inst);
		}
		
	}
	
	public void generateSelled(){
		TreeSet<MusicalInstrument> katalog = new TreeSet<MusicalInstrument>(new CompBySales());
		for (Entry <String, HashMap<String, HashMap<String, MusicalInstrument>>> entry : instrumenti.entrySet()) {
			for (Entry <String, HashMap<String, MusicalInstrument>> entry1 : entry.getValue().entrySet()) {
				for (Entry<String, MusicalInstrument> entry2 : entry1.getValue().entrySet()) {
					if(entry2.getValue().getSelled() != 0){
						katalog.add(entry2.getValue());
					}
				}
			}
		}
		bestSeller = katalog.last();
		System.out.println("Продукти подредени по брой продажби:");
		for(MusicalInstrument inst : katalog){
			System.out.println(inst);
		}
	}
	
	public void generateRevenue(){
		double total = 0;
		for (Entry <String, HashMap<String, HashMap<String, MusicalInstrument>>> entry : instrumenti.entrySet()) {
			for (Entry <String, HashMap<String, MusicalInstrument>> entry1 : entry.getValue().entrySet()) {
				for (Entry<String, MusicalInstrument> entry2 : entry1.getValue().entrySet()) {
					if(entry2.getValue().getSelled() != 0){
						total += (entry2.getValue().getSelled() * entry2.getValue().getPrice());
					}
				}
			}
		}
		System.out.println("Общ генериран оборот: " + total + " лв.");
	}
	
	public void getBestSeller(){
		System.out.println("Най-продаваният инструмент е " + this.bestSeller.getName() + " с продажби от " + this.bestSeller.getSelled() + " броя.");
	}
	
	public void bestSellingGroup(){
		int count = 0;
		int maxCount = 0;
		String type = new String();
		for (Entry <String, HashMap<String, HashMap<String, MusicalInstrument>>> entry : instrumenti.entrySet()) {
			for (Entry <String, HashMap<String, MusicalInstrument>> entry1 : entry.getValue().entrySet()) {
				for (Entry<String, MusicalInstrument> entry2 : entry1.getValue().entrySet()) {
					count += entry2.getValue().getSelled();
					
				}
			}
			if(count > maxCount){
				maxCount = count;
				type = entry.getKey();
			}
			count = 0;
		}
		System.out.println("Най-продаваният вид инструменти е: " + type);
	}
	
	public void maximumRevenue(){
		double total = 0;
		double maxTotal = 0;
		String name = new String();
		for (Entry <String, HashMap<String, HashMap<String, MusicalInstrument>>> entry : instrumenti.entrySet()) {
			for (Entry <String, HashMap<String, MusicalInstrument>> entry1 : entry.getValue().entrySet()) {
				for (Entry<String, MusicalInstrument> entry2 : entry1.getValue().entrySet()) {
					if(entry2.getValue().getSelled() != 0){
						total += (entry2.getValue().getSelled() * entry2.getValue().getPrice());
					}
				}
			}
			if(total > maxTotal){
				maxTotal = total;
				name = entry.getKey();
			}
			total = 0;
		}
		System.out.println("Видът инструменти с най-голям приход е: " + name);
	}
	
}
