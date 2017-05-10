import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter array length:");
		int[] masiv = new int [sc.nextInt()];
		for(int i=0; i<masiv.length; i++){
			System.out.println("Enter value for position "+i+".");
			masiv[i]=sc.nextInt();
		}
		boolean nazaben=false;
		for(int i=0; i<masiv.length-2; i++){
			if((masiv[i]>masiv[i+1] && masiv[i+1]<masiv[i+2]) || 
			(masiv[i]<masiv[i+1] && masiv[i+1]>masiv[i+2])){
				nazaben=true;
			}
			else{
				nazaben=false;
				break;
			}
		}
		System.out.println(nazaben?"The array is nazaben.":"The array is NOT nazaben.");
		
	}

}
