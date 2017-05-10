package lists;

import java.util.ArrayList;
import java.util.List;

public class ArrayListsExample {

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<String>();
		System.out.println(list.size());
		list.add("Krasi");
		list.add("Niki");
		list.add("Cveti");
		list.add("Ceco");
		list.add(1, "Mario");
		list.set(1, "Zdravko");
		list.remove("Cveti");
		System.out.println(list.size());
		System.out.println(list);
		System.out.println(list.get(2));
		System.out.println(list.contains("Georgi"));
		
		//ArrayList to Array
		String[] arr = new String[list.size()];
		arr = list.toArray(arr);
		System.out.println(arr[1]);
		
		List l = new ArrayList<>();
		
	}
	

}
