import java.util.Scanner;

public class Task8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a word:"); 
		String word1 = sc.next();
		boolean palindrome=true;
		for(int i=0; i<word1.length(); i++){
			if(word1.charAt(i)!=word1.charAt(word1.length()-1-i)){
				palindrome=false;
			}
		}
		System.out.println(palindrome?"Palindrome.":"NOT Palindrome.");
	
	}

}
