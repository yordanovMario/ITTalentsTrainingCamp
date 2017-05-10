import java.util.Scanner;

public class Task15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Insert a number:");
		int N = sc.nextInt();
		int sum = 0;
		int i=1;
		if(N<=0){
			do{
				sum+=i;
				i--;
			} while(i>=N);
		}
		else{
			do{
				sum+=i;
				i++;
			} while(i<=N);
		}
		System.out.println("The sum of all numbers between 1 and "+N+" is: "+sum);

	}

}
