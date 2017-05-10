import java.util.Scanner;

public class Task11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Insert value for n: ");
		int n = sc.nextInt();
		int spaces = n/2;
		for(int i=1; i<=n; i+=2){
			for(int j=0; j<spaces; j++){
				System.out.print(" ");
			}
			for(int j=0; j<i; j++){
				System.out.print("*");
			}
			System.out.println();
			spaces--;
		}
		System.out.println();
		for(int i=1; i<=n; i+=2){
			for(int j=0; j<i; j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
}