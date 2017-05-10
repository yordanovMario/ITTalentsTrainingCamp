import java.util.Scanner;

public class Task17 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char symbol;
		System.out.print("Insert a symbol: ");
		symbol = sc.next().charAt(0);
		int a;
		System.out.print("Insert side: ");
		a = sc.nextInt();
		for(int i=0; i<a; i++){
			if(i==0 || i==a-1){
				for(int j=0; j<a; j++){
					System.out.print("*");
				}
			}
			if(i!=0 && i!=a-1){
				System.out.print("*");
				for(int j=2; j<a; j++){
					System.out.print(symbol);
				}
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
