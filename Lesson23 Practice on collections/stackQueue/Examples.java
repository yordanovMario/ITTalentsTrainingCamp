package stackQueue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Examples {

	public static void main(String[] args) {
		
		Stack<String> s = new Stack<String>();
		
		s.push("Krasi");
		s.push("Silva");
		System.out.println(s);
		System.out.println(s.peek());
		System.out.println("Remove " + s.pop());
		System.out.println(s);
		
		System.out.println();
		Queue opashka = new LinkedList<>();
		opashka.offer("Krasi");
		opashka.offer("Silva");
		System.out.println(opashka.peek());
		
	}

}
