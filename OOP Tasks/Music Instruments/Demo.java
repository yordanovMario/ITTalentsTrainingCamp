
public class Demo {

	public static void main(String[] args) {
		
		Shop musicShop = new Shop(1500);
		
		Duhov trumpet = new Duhov(Duhov.Vid.TROMPET, "Тромпет", 1199, 6);
		Udaren baraban = new Udaren(Udaren.Vid.BARABAN, "Барабани", 899, 3);
		Elektronen klavir = new Elektronen(Elektronen.Vid.SINTEZATOR, "Синтезатор", 4500, 5);
		Klavishen piano = new Klavishen(Klavishen.Vid.PIANO, "Пиано", 10000, 2);
		Strunen kitara = new Strunen(Strunen.Vid.KITARA, "Китара", 850, 10);
		Duhov trumpet1 = new Duhov(Duhov.Vid.TROMPET, "Тромпет-1", 1500, 2);
		Udaren baraban1 = new Udaren(Udaren.Vid.BARABAN, "Барабани2", 2000, 4);
		Elektronen klavir1 = new Elektronen(Elektronen.Vid.SINTEZATOR, "Синтезатор3", 1800, 2);
		Klavishen piano1 = new Klavishen(Klavishen.Vid.PIANO, "Пиано4", 5000, 4);
		Strunen kitara1 = new Strunen(Strunen.Vid.KITARA, "Китара5", 1050, 3);

		musicShop.addInstrument(trumpet);
		musicShop.addInstrument(baraban);
		musicShop.addInstrument(klavir);
		musicShop.addInstrument(piano);
		musicShop.addInstrument(kitara);
		musicShop.addInstrument(trumpet1);
		musicShop.addInstrument(baraban1);
		musicShop.addInstrument(klavir1);
		musicShop.addInstrument(piano1);
		musicShop.addInstrument(kitara1);

		musicShop.showCatalogueByStock();
		System.out.println("==========================");
		musicShop.sellInstrument(trumpet, 2);
		musicShop.sellInstrument(baraban, 4);
		musicShop.sellInstrument(klavir, 2);
		musicShop.sellInstrument(piano, 1);
		musicShop.sellInstrument(kitara, 6);
		musicShop.sellInstrument(trumpet1, 2);
		musicShop.sellInstrument(baraban1, 3);
		musicShop.sellInstrument(klavir1, 1);
		musicShop.sellInstrument(piano1, 3);
		musicShop.sellInstrument(kitara1, 4);
		System.out.println("==========================");
		musicShop.showCatalogueByType();
		System.out.println("==========================");
		musicShop.showCatalogueByName();
		System.out.println("==========================");
		musicShop.showCatalogueByPrice();
		System.out.println("==========================");
		musicShop.showCatalogueByStock();
		System.out.println("==========================");
		musicShop.generateSelled();
		System.out.println("==========================");
		musicShop.maximumRevenue();
		System.out.println("==========================");
		musicShop.generateRevenue();
		System.out.println("==========================");
		musicShop.getBestSeller();
		System.out.println("==========================");
		musicShop.bestSellingGroup();
		
		
	}
	
	
	
}
