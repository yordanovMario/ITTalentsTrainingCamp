package vinetki;

import java.time.DayOfWeek;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
import java.util.TreeMap;

import vinetki.Vinetka.AutoType;
import vinetki.Vinetka.DurationType;

public class Demo {
	
	//type -> (srok -> list of vinetki)
	static TreeMap<AutoType, TreeMap<DurationType, ArrayList<Vinetka>>> kartoteka = new TreeMap<>();

	public static void main(String[] args) {
		
		ArrayList<Vinetka> vinetki = new ArrayList<>();
		Vinetka special = new Vinetka(AutoType.CAR, DurationType.MONTHLY);
		System.out.println(special.getPrice());
				
		
		for (int i = 0; i < 10000; i++) {
			vinetki.add(new Vinetka( AutoType.values()[new Random().nextInt(AutoType.values().length)],
								DurationType.values()[new Random().nextInt(DurationType.values().length)]));
			//System.out.println(vinetki.get(i));
		}
		
		for(Vinetka v : vinetki){
			AutoType type = v.getType();
			DurationType srok = v.getSrok();
			if(!kartoteka.containsKey(type)){
				kartoteka.put(type, new TreeMap());
			}
			if(!kartoteka.get(type).containsKey(srok)){
				kartoteka.get(type).put(srok, new ArrayList<>());
			}
			kartoteka.get(type).get(srok).add(v);
		}
				
	}
	
	public static void sell(String type, String srok){
		kartoteka.get(type).get(srok).remove(0);
	}
}
