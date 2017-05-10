import java.util.Scanner;

public class Task7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Array 1 length:");
		int[] masiv1 = new int[sc.nextInt()];
		System.out.println("Enter "+masiv1.length+" numbers in Array 1.");
		for(int num=0; num<masiv1.length; num++){
			masiv1[num]=sc.nextInt();
		}
		int[] masiv2 = new int[masiv1.length];
		masiv2[0]=masiv1[0];
		masiv2[masiv1.length-1]=masiv1[masiv1.length-1];
		System.out.print("["+masiv2[0]+", ");
		for(int j=1; j<masiv1.length-1; j++){
			masiv2[j]=masiv1[j-1]+masiv1[j+1];
			if(j==masiv1.length-2){
			System.out.print(masiv2[j]);
			}
			else{
				System.out.print(masiv2[j]+", ");
			}
		}
		System.out.print(", "+masiv2[masiv1.length-1]+"]");

	}

}
