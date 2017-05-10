import java.util.Scanner;

public class Task12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] masiv = new int[7];
		System.out.println("Enter 7 numbers in the Array:");
		for(int num=0; num<masiv.length; num++){
			masiv[num]=sc.nextInt();
		}
		int swap = 0;
		swap = masiv[0];
		masiv[0] = masiv[1];
		masiv[1] = swap;
		
		masiv[2] = masiv[2]+masiv[3];
		masiv[3] = masiv[2]-masiv[3];
		masiv[2] = masiv[2]-masiv[3];
		
		masiv[4] = masiv[4]*masiv[5];
		masiv[5] = masiv[4]/masiv[5];
		masiv[4] = masiv[4]/masiv[5];
		
		System.out.print("[");
		for(int i=0; i<masiv.length; i++){
			if(i==masiv.length-1){
				System.out.print(masiv[i]);
			}
			else{
				System.out.print(masiv[i]+", ");
			}
		}
		System.out.print("]");
	}

}
