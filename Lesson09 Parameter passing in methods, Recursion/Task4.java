import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter start number: ");
		int start = sc.nextInt();
		System.out.println();
		System.out.print("Enter end number: ");
		int end=sc.nextInt();
		triangleNumPrint(start, end);
	
	}
	static void triangleNumPrint(int x, int y){
		if(y==0){
			return;
		}
		triangleNumPrint(x, y-1);
		for(int i=x; i<=y; i++){
			System.out.print(i+" ");
		}
		System.out.println();
	}
	
}
