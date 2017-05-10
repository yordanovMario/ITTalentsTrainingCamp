import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String 1 without using spaces:");
		String word1=sc.next();
		System.out.println("Enter String 2 without using spaces:");
		String word2=sc.next();
		String shorter=null;
		if(word1.length()==word2.length()){
			System.out.println("The string have equal lengths.");
			shorter=word1;
		}
		else{
			if(word1.length()>word2.length()){
				System.out.println("String 1 is longer than String 2.");
				shorter=word2;
			}
			else{
				System.out.println("String 2 is longer than String 1.");
				shorter=word1;
			}
		}
		for(int i=0; i<shorter.length(); i++){
				if(word1.charAt(i)!=word2.charAt(i)){
					System.out.println((i+1)+" "+word1.charAt(i)+"-"+word2.charAt(i));
				}
		}
		
	}

}
