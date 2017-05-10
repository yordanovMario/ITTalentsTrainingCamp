import java.util.Scanner;

public class Task11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] masiv = new int[7];
		System.out.println("Enter 7 numbers in the Array:");
		for(int num=0; num<masiv.length; num++){
			masiv[num]=sc.nextInt();
		}
		int counter=0;
		for(int i=0; i<masiv.length; i++){
			if(masiv[i]>5 && masiv[i]%5==0){
				System.out.print(masiv[i]+", ");
				counter++;
			}
		}
		System.out.print("- "+counter+" numbers.");
		
	}

}
