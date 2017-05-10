package lists;

import java.util.LinkedList;

public class LinkedListExample {
	
	public static void main(String[] args) {
		
		LinkedList<String> link = new LinkedList<String>();
		link.add("krasi");
		link.add("krasi");
		link.add("krasi");
		link.add("krasi");
		link.add("krasi");
		link.add("sasho");
		link.removeFirst();
		System.out.println(link.get(4)); // shte raboti s lineina slojnost
		
		
	}
}
