import java.util.Scanner;

public class Task18 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Insert two numbers between 1 and 9.");
		System.out.print("Number 1: ");
		int n = sc.nextInt();
		System.out.print("Number 2: ");
		int m = sc.nextInt();
		System.out.println();
		for (int i=1; i<=n; i++){
			for (int j=1; j<=m; j++){
				System.out.println(i+"*"+j+"="+i*j);
			}
		}
	}

}