import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x,y;
		do{
			System.out.println("Enter 2 numbers equal or bigger than 2:");
			System.out.print("Number 1: ");
			x=sc.nextInt();
			System.out.println();
			System.out.print("Number 2: ");
			y=sc.nextInt();
			if(x<2 || y<2){
				System.out.println("Invalid numbers!");
			}
		} while(x<2 || y<2);
		int proizv = sum(x, y);
		System.out.println(proizv);
		
	}
	static int sum(int n, int m){
		if(n==2){
			return m+m;
		}
		return sum(n-1, m)+m;
	}

}
