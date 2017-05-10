package iterations;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

import javax.swing.plaf.synth.SynthSpinnerUI;

public class Examples {

	public static void main(String[] args) {
		
		String[] strings = {"Ebasi", "Gadnata", "Lekcia"};
		for (int i = 0; i < strings.length; i++) {
			System.out.print(strings[i]+ " ") ;
		}
		System.out.println();
		
		ArrayList<String> texts = new ArrayList<>();
		texts.add("Ebasi");
		texts.add("Trudniq");
		texts.add("Material");
		for(int i = 0; i < texts.size(); i++){
			System.out.print(texts.get(i) + " ");
		}
		System.out.println();
		
		TreeSet x;
		
		HashSet<String> set = new HashSet();
		set.add("Ebasi");
		set.add("Razburkanoto");
		set.add("Neshto");
		for(Iterator it = set.iterator(); it.hasNext(); ){
			System.out.print(it.next() + " ");
		}
		System.out.println();
		System.out.println("--------");
		
		for(String s : set) {
			System.out.println(s);
		}
		
	}
}
