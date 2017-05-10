import java.util.Scanner;

public class Task18 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Array length: ");
		int[] masiv1 = new int[sc.nextInt()];
		System.out.println("Insert "+masiv1.length+" numbers in Array 1:");
		for(int i=0; i<masiv1.length; i++){
			masiv1[i]=sc.nextInt();
		}
		int[] masiv2 = new int[masiv1.length];
		System.out.println("Insert "+masiv1.length+" numbers in Array 2:");
		for(int i=0; i<masiv1.length; i++){
			masiv2[i]=sc.nextInt();
		}
		for(int i=0; i<masiv1.length; i++){
			if(i==masiv1.length-1){
				System.out.print(masiv1[i]);
			}
			else{
				System.out.print(masiv1[i]+", ");
			}
		}
		System.out.println();
		for(int i=0; i<masiv1.length; i++){
			if(i==masiv1.length-1){
				System.out.print(masiv2[i]);
			}
			else{
				System.out.print(masiv2[i]+", ");
			}
		}
		System.out.println();
		System.out.println();
		int[] masiv3 = new int[masiv1.length];
		for(int i=0; i<masiv1.length; i++){
			if(masiv1[i]>masiv2[i]){
				masiv3[i]=masiv1[i];
			}
			if(masiv2[i]>masiv1[i]){
				masiv3[i]=masiv2[i];
			}
			if(masiv1[i]==masiv2[i]){
				masiv3[i]=masiv1[i];
			}
		}
		for(int i=0; i<masiv1.length; i++){
			if(i==masiv1.length-1){
				System.out.print(masiv3[i]);
			}
			else{
				System.out.print(masiv3[i]+", ");
			}
		}
		
	}

}
