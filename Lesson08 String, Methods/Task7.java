import java.util.Scanner;

public class Task7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Text:");
		String text = sc.nextLine();
		String[] words = text.split(" ");
		int maxSymbolsCount=words[0].length();
		for(int i=1; i<words.length; i++){
			if(words[i].length()>maxSymbolsCount){
				maxSymbolsCount=words[i].length();
			}
		}
		System.out.println(words.length+" words, the longest has "+maxSymbolsCount+" symbols.");
		
	}

}
