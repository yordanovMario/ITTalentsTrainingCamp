package hash;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;

public class Demo {
	
	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<>();
		list.add("krasi");
		list.add("iva");
		list.add("desi");
		list.add(null);
		list.add("gizi");
		
		String[] arr = new String[list.size()];
		arr = list.toArray(arr);
		System.out.println(Arrays.toString(arr));
		
		HashMap<Man, Woman> semeistva = new HashMap<>();
		
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
