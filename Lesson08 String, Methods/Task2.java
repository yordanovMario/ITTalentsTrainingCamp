import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String word1, word2;
		do{
			System.out.println("Enter a word with 10-20 letters length:");
			word1 = sc.nextLine();
			if(word1.length()<10 || word1.length()>20){
				System.out.println("You have entered a word that doesn't match the requirements!");
			}
		} while(word1.length()<10 || word1.length()>20);
		do{
			System.out.println("Enter a word with 10-20 letters length:");
			word2 = sc.nextLine();
			if(word2.length()<10 || word2.length()>20){
				System.out.println("You have entered a word that doesn't match the requirements!");
			}
		} while(word2.length()<10 || word2.length()>20);
		String longer=null; 
		String shorter=null;
		if(word2.length()>word1.length()){
			longer=word2;
			shorter=word1;
		}
		else{
			longer=word1;
			shorter=word2;
		}
		System.out.print(longer.length()+" "+shorter.substring(0,5)+longer.substring(5));
		
		
		
	}

}
