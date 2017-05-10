package treesAndComparators;

import java.util.HashMap;
import java.util.TreeMap;
import java.util.TreeSet;

import hash.Man;
import hash.Woman;

public class Demo {

	public static void main(String[] args) {
		
		TreeSet<Board> duskiPoShirina = new TreeSet();
		duskiPoShirina.add(new Board(80,20,1));
		duskiPoShirina.add(new Board(30,30,8));
		duskiPoShirina.add(new Board(40,30,20));
		System.out.println(duskiPoShirina);

		TreeSet<Board> duskiPoDebelina = new TreeSet(new DuskiComparatorPoDebelina());
		duskiPoDebelina.add(new Board(40,30,20));
		duskiPoDebelina.add(new Board(80,20,1));
		duskiPoDebelina.add(new Board(30,30,8));
		System.out.println(duskiPoDebelina);
		

		TreeSet<Board> duskiPoVisochina = new TreeSet(new DuskiComparatorPoVisochina());
		duskiPoVisochina.add(new Board(40,30,20));
		duskiPoVisochina.add(new Board(80,20,1));
		duskiPoVisochina.add(new Board(30,30,8));
		System.out.println(duskiPoVisochina);
		

		TreeMap<Man, Woman> semeistva = new TreeMap();
		
		Man anatoli = new Man("Anatoli");
		Man krasi1 = new Man("Krasi");
		Man kristiqn = new Man("Kristiqn");
		Man krasi2 = new Man("Krasi");
		
		Woman petya = new Woman("Petya");
		Woman viktoria = new Woman("Viktoria");
		Woman mariela = new Woman("Mariela");
		Woman desi = new Woman("Desi");
		
		semeistva.put(anatoli, petya);
		semeistva.put(krasi1, mariela);
		semeistva.put(krasi2, desi);
		semeistva.put(kristiqn, viktoria);
		
		System.out.println(semeistva);
		
	}
}
