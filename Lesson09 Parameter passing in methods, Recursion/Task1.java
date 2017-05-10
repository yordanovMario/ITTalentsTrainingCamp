import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		do{
		System.out.println("Enter the position of the Fibonaci number you want to see:");
		n = sc.nextInt();
		if(n<1){
			System.out.println("Invalid number!");
		}
		} while(n<1);
		int num = fib(n);
		System.out.println(num);
		
	}
	static int fib(int n){
		if(n==1){
			return 1;
		}
		if(n==2){
			return 1;
		}
		return fib(n-1) + fib(n-2);
	}
	
}
