import java.util.Scanner;

public class Task13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Insert a number: ");
		int num = sc.nextInt();
		int numCopy = num;
		int size=0;
		while(numCopy!=0){
			numCopy/=2;
			size++;
		}
		int[] masiv = new int[size];
		for(int i=masiv.length-1; i>=0; i--){
			int transf = num%2;
			masiv[i]=transf;
			num/=2;
		}
		for(int i=0; i<masiv.length; i++){
			System.out.print(masiv[i]);
		}
		
	}

}
