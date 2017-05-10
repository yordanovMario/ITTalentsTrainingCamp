import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter array length:");
		char[] masiv = new char [sc.nextInt()];
		for(int i=0; i<masiv.length; i++){
			System.out.println("Enter value for position "+i+".");
			masiv[i]=sc.next().charAt(0);
		}
		System.out.print("Enter a letter to check if it is in the array:");
		char ch = sc.next().charAt(0);
		for(int i=0; i<masiv.length; i++){
			if(masiv[i]==ch){
				System.out.print(i+" ");
			}
			else{
				System.out.print("No ");
			}
		
		}
		
		
		
		
	}

}
