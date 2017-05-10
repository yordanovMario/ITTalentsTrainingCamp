import java.util.Scanner;

public class Task14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Insert a number between 10 and 200:");
		int N = sc.nextInt();
		if(N>=10 && N<=200){
			for(int x=196; x>=14; x-=7){
				if(x<N){
				System.out.print(x);
					if(x==14){
						break;
					}
				System.out.print(",");
				}
			}
		}
		else{
			System.out.println("Invalid number.");
		}
		if(N>=10 && N<=14){
			System.out.println("There are no numbers satisfying the conditions.");
		}
	}

}
