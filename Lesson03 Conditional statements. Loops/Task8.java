import java.util.Scanner;

public class Task8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Insert value for n:");
		int n = sc.nextInt();
		int Num = n-1;
		if(n>0){
			for(int Rows=1; Rows<=n; Rows++){
				for(int BroiNum=1; BroiNum<=n; BroiNum++){
					System.out.print(Num);
				}
				System.out.println();
				Num+=2;
			}	
		}	
		else{
			System.out.println("Invalid number.");
		}
	}

}
