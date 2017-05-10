import java.util.Scanner;

public class Task19 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Insert a number between 10 and 99: ");
		int n = sc.nextInt();
		int newNum = 0;
		if(n>=10 && n<=99){
			do{
				if(n%2==0){
					newNum=n/2;
				}
				else{
					newNum=n*3+1;
				}
				System.out.print(newNum+" ");
				n=newNum;
			if(n==1){
				System.out.print(".");
			}
			} while(n!=1);
		}
		else{
			System.out.println("Invalid number.");
		}
	}

}
