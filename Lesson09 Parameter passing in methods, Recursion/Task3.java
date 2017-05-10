import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int x = sc.nextInt();
		int delitel = 2;
		IsItProsto(x, delitel);
		
	}
	static void IsItProsto(int num, int delitel){
		if(num<2 || num % delitel == 0){
			System.out.println("NOT prosto.");
			return;
		}
		if(delitel == num - 1){
			System.out.println("Prosto.");
			return;
		}
		IsItProsto(num, delitel + 1);
	}
	
}
