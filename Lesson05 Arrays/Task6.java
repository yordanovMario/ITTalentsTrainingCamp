import java.util.Scanner;

public class Task6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter length for Array 1: ");
		int[] masiv1 = new int[sc.nextInt()];
		System.out.print("Enter length for Array 2: ");
		int[] masiv2 = new int[sc.nextInt()];
		boolean equal = true;
		System.out.println("Enter "+masiv1.length+" numbers in Array 1.");
		for(int sc1=0; sc1<masiv1.length; sc1++){
			masiv1[sc1]=sc.nextInt();
		}
		System.out.println("Enter "+masiv2.length+" numbers in Array 2.");
		for(int sc2=0; sc2<masiv2.length; sc2++){
			masiv2[sc2]=sc.nextInt();
		}
		if(masiv1.length!=masiv2.length){
			equal=false;
		}
		else{
			for(int i=0; i<masiv1.length; i++){
				if(masiv1[i]!=masiv2[i]){
					equal=false;
					break;
				}
			}
		}
		System.out.println(equal?"The arrays are equal.":"The arrays are NOT equal.");
		System.out.println(masiv1.length==masiv2.length?"The arrays have the same length.":"The arrays have different lengths.");
	}

}
