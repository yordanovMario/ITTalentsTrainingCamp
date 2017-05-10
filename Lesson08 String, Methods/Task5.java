import java.util.Scanner;

public class Task5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Word 1:");
		String word1 = sc.next();
		System.out.println("Enter Word 2:");
		String word2 = sc.next();
		String shorter = null;
		String longer = null;
		if(word1.length()<word2.length()){
			shorter=word1;
			longer=word2;
		}
		else{
			shorter=word2;
			longer=word1;
		}
		
		
		
	}

}
