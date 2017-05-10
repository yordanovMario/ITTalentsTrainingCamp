package hash;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class LinkedHashMapExample {

	public static void main(String[] args) {
		
		//name -> egn
		LinkedHashMap<String, String> map = new LinkedHashMap<>();//string for key and string for value
		map.put("Krisi", "5544778899");
		map.put("Zori", "5544112233");
		map.put("Krisi", "4444444444");
		map.put("Krasi", "4444444444");
		
		System.out.println(map);
		//izkarva gi v reda v koito sa vkarani
			//value-to na 2roto Krisi overwrite-va 1voto
		
	}
}
