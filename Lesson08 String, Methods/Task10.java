import java.util.Scanner;

public class Task10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String:");
		String word = sc.next();
		for(int i=0; i<word.length(); i++){
			char newSymbol = (char)(word.charAt(i)+5);
			System.out.print(newSymbol);
		}

	}

}
