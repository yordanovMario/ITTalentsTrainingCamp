import java.util.Scanner;

public class Task16 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Insert values for N and M between 10 and 5555.");
		System.out.print("N: ");
		int N = sc.nextInt();
		System.out.print("M: ");
		int M = sc.nextInt();
		int min=N;
		int max=M;
		if(M<N){
			min=M;
			max=N;
		}
		for(int x=max; x>=50; x--){
			if(x%50==0){
				System.out.print(x);
				if(x==50){
					System.out.print(".");
					break;
				}
				System.out.print(",");
			}
		}

	}

}
