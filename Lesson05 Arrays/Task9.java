import java.util.Scanner;

public class Task9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Array length:");
		int[] masiv = new int[sc.nextInt()];
		System.out.println("Enter "+masiv.length+" numbers in the Array.");
		for(int num=0; num<masiv.length; num++){
			masiv[num]=sc.nextInt();
		}
		int nov0=0;
		for(int i=0, j=masiv.length-1; i<masiv.length/2 && j>=0; i++, j--){
			masiv[i] = masiv[i]+masiv[j];
			masiv[j] = masiv[i]-masiv[j];
			masiv[i] = masiv[i]-masiv[j];
		}
		for(int i=0; i<masiv.length; i++){
			if(i==masiv.length-1){
				System.out.print(masiv[i]);
			}
			else{
				System.out.print(masiv[i]+", ");
			}
		}
	}

}
