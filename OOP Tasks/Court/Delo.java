import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;

public class Delo {
	
	private String tip;
	private Sydiq sydiq;
	private HashSet<Zasedatel> zasedateli;
	private Obvinqem obvinqem;
	private Obvinitel obvinitel;
	private Prokuror prokuror;
	private HashSet<Svidetel> svideteli;
	private ArrayList<String> hronologiq = new ArrayList<String>();
	
	public Delo(Sydiq sydiq, Obvinqem obvinqem, Prokuror prokuror, HashSet<Svidetel> svideteli) {
		this.tip = "Наказателно дело";
		this.sydiq = sydiq;
		this.zasedateli = generateZasedateli(13);
		this.obvinqem = obvinqem;
		this.prokuror = prokuror;
		this.svideteli = new HashSet();
	}

	public Delo(Sydiq sydiq, Obvinqem obvinqem, Obvinitel obvinitel, HashSet<Svidetel> svideteli) {
		this.tip = "Гражданско дело";
		this.sydiq = sydiq;
		this.zasedateli = generateZasedateli(3);
		this.obvinqem = obvinqem;
		this.obvinitel = obvinitel;
		this.svideteli = new HashSet();
	}
	
	private HashSet<Zasedatel> generateZasedateli(int broi){
		HashSet<Zasedatel> zsdtli = new HashSet<Zasedatel>();
		for (int i = 0; i < broi; i++) {
			String name = "Gringo" + broi;
			zsdtli.add(new Zasedatel(name, broi, broi));
		}
		return zsdtli;
	}

	public void provejdane(){
		this.hronologiq.add("Започва дело от тип: " + tip);
		this.hronologiq.add("Съдия: " + sydiq.getName());
		if(this.prokuror != null){
			this.prokuror.uchastieVDelo();
			this.hronologiq.add("Прокурор: " + prokuror.getName());
		}
		else{
			this.hronologiq.add("Обвинител: " + obvinitel.getIme());
		}
		this.sydiq.uchastieVDelo();
		
		this.hronologiq.add("Обвиняем: " + obvinqem.getIme());
		
		for (Iterator<Zasedatel> iterator = zasedateli.iterator(); iterator.hasNext();) {
			iterator.next().uchastieVDelo();
		}
		if(this.tip == "Гражданско дело"){
			HashSet<Advokat> advokati = obvinitel.getAdvokati();
			for (Iterator<Advokat> iterator = advokati.iterator(); iterator.hasNext();) {
				Advokat advokatcheto = iterator.next();
				this.hronologiq.add("Адвокат на обвинител към обвиняем " + advokatcheto.zadaiVypros(obvinqem));
				this.hronologiq.add("Адвокат на обвинител към обвиняем " + advokatcheto.zadaiVypros(obvinqem));
				this.hronologiq.add("Адвокат на обвинител към обвиняем " + advokatcheto.zadaiVypros(obvinqem));
			}
			for (Iterator<Advokat> iterator = advokati.iterator(); iterator.hasNext();) {
				Advokat advokatcheto = iterator.next();
				for (Iterator<Svidetel> iterator2 = svideteli.iterator(); iterator.hasNext();) {
					Svidetel svidetelcheto = iterator2.next();
					this.hronologiq.add("Адвокат на обвинител към свидетел " + advokatcheto.zadaiVypros(svidetelcheto));
					this.hronologiq.add("Адвокат на обвинител към свидетел " + advokatcheto.zadaiVypros(svidetelcheto));
				}
			}
		}
		else{
			this.hronologiq.add("Прокурор към обвиняем " + this.prokuror.zadaiVypros(obvinqem));
			this.hronologiq.add("Прокурор към обвиняем " + this.prokuror.zadaiVypros(obvinqem));
			this.hronologiq.add("Прокурор към обвиняем " + this.prokuror.zadaiVypros(obvinqem));
			this.hronologiq.add("Прокурор към обвиняем " + this.prokuror.zadaiVypros(obvinqem));
			this.hronologiq.add("Прокурор към обвиняем " + this.prokuror.zadaiVypros(obvinqem));
			
			for (Iterator<Svidetel> iterator = svideteli.iterator(); iterator.hasNext();) {
				this.hronologiq.add("Прокурор към свидетел " + prokuror.zadaiVypros(iterator.next()));
				this.hronologiq.add("Прокурор към свидетел " + prokuror.zadaiVypros(iterator.next()));
				this.hronologiq.add("Прокурор към свидетел " + prokuror.zadaiVypros(iterator.next()));
				this.hronologiq.add("Прокурор към свидетел " + prokuror.zadaiVypros(iterator.next()));
				this.hronologiq.add("Прокурор към свидетел " + prokuror.zadaiVypros(iterator.next()));
			}
		}
		
		HashSet<Advokat> advokati = obvinqem.getAdvokati();
		for (Iterator<Advokat> iterator = advokati.iterator(); iterator.hasNext();) {
			Advokat advokatcheto = iterator.next();
			for (Iterator<Svidetel> iterator2 = svideteli.iterator(); iterator.hasNext();) {
				Svidetel svidetelcheto = iterator2.next();
				this.hronologiq.add("Адвокат на обвиняем към свидетел " + advokatcheto.zadaiVypros(svidetelcheto));
				this.hronologiq.add("Адвокат на обвиняем към свидетел " + advokatcheto.zadaiVypros(svidetelcheto));
				this.hronologiq.add("Адвокат на обвиняем към свидетел " + advokatcheto.zadaiVypros(svidetelcheto));
				this.hronologiq.add("Адвокат на обвиняем към свидетел " + advokatcheto.zadaiVypros(svidetelcheto));
				this.hronologiq.add("Адвокат на обвиняем към свидетел " + advokatcheto.zadaiVypros(svidetelcheto));
			}
		}
		int resheniq = 0;
		for (Iterator<Zasedatel> iterator = zasedateli.iterator(); iterator.hasNext();) {
			if(iterator.next().vzemaneNaReshenie() == true){
				resheniq++;
			}
		}
		if(resheniq > zasedateli.size()/2){
			int prisyda = new Random().nextInt(37)+3;
			this.hronologiq.add("Съдебните заседатели взеха решение с " + resheniq + " гласа за, че обвиняемият е виновен.");
			this.hronologiq.add("Съдия " + sydiq.getName() + " взе решение обвиняемият " + obvinqem.getIme() + " да лежи в затвора " + prisyda + " години.");
		}
		else{
			this.hronologiq.add("Съдебните заседатели взеха решение с " + resheniq + " гласа против, че обвиняемият е невинен.");
		}
		
	}
	public void printHrono(){
		for (Iterator<String> iterator = hronologiq.iterator(); iterator.hasNext();) {
			System.out.println(iterator.next());
		}
	}
}
