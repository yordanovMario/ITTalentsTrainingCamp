import java.util.Scanner;

public class Task5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number to check if it's a palindrome: ");
		int n = sc.nextInt();
		int temp = 0;
		int reversed = reverse(n, temp);
		System.out.println(n==reversed ? reversed+" Yes." : reversed+" No.");
		
	}
	static int reverse(int n, int temp){
		if(n==0){
			return temp;
		}
		temp=10*temp + n%10;
		return reverse(n/10, temp);
	}
	
}
