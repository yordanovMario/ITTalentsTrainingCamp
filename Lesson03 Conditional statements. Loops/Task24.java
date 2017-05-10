import java.util.Scanner;

public class Task24 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n: ");
		int n=sc.nextInt();
		int reverseNum=0;
		int Num=n;
		do{
			reverseNum*=10;
			reverseNum+=Num%10;
			Num/=10;
		} while(Num!=0);
		if(reverseNum==n){
			System.out.println("Palindrome.");
		}
		else{
			System.out.println("Not palindrome.");
		}
	
	}

}
