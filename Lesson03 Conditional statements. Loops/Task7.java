import java.util.Scanner;

public class Task7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Insert value for n:");
		int n = sc.nextInt();
		if(n>0){
			for(int x=3; x<=n*3; x+=3){
				System.out.print(x);
				if(x==n*3){
					break;
				}
				System.out.print(",");
			}
		}
		else{
			System.out.println("Invalid number.");
		}
	}

}
