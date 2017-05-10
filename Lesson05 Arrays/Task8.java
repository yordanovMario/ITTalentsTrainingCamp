import java.util.Scanner;

public class Task8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Array length:");
		int[] masiv = new int[sc.nextInt()];
		System.out.println("Enter "+masiv.length+" numbers in the Array.");
		for(int num=0; num<masiv.length; num++){
			masiv[num]=sc.nextInt();
		}

	}

}
