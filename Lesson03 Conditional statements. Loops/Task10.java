import java.util.Scanner;

public class Task10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Insert a number:");
		int x = sc.nextInt();
		boolean xIsPrime=true;
		for(int i=2; i<x-1; i++){
			if(x%i==0){
				xIsPrime = false;
			}
		}
		if(xIsPrime){
			System.out.println("The number is prime.");
		}
		else{
			System.out.println("The number is not prime.");
		}

	}

}
