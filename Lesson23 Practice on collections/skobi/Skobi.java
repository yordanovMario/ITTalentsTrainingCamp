package skobi;

import java.util.Stack;

public class Skobi {

	public static void main(String[] args) {
		
		String code = "{{}{}}{}{}{{{}}{}{}{{}}{}}}}}{}";
		Stack<String> stack = new Stack<>();
		boolean missingOpening = false;
		for (int i = 0; i < code.length(); i++) {
			char c = code.charAt(i);
			if(c == '{'){
				stack.push("canko");
			}
			if(c == '}'){
				if(stack.isEmpty()){
					System.out.println("Closing brackets are missing their opening brothers");
					missingOpening = true;
					break;
				}
				stack.pop();
			}
			
		}
		if(!missingOpening){
			if(stack.isEmpty()){
				System.out.println("All good");
			}
			else{
				System.out.println("Opening brackets are missing their enclosing brothers");
			}
		}
	}
}
