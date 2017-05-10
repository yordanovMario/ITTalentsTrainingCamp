import java.util.Scanner;

public class Task6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Text:");
		String text = sc.nextLine();
		String[] words = text.split(" ");
		for(int i=0; i<words.length; i++){
			System.out.print(words[i].substring(0,1).toUpperCase()+words[i].substring(1)+" ");
		}
		
	}

}
