import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		int[] original = new int[6];
		int[] copy = new int[original.length];
		Scanner sc = new Scanner(System.in);
		System.out.println("Insert 6 values in the array:");
		for(int scan=0; scan<original.length; scan++){
			original[scan] = sc.nextInt();
		}
		System.out.print("[");
		for(int i=0; i<3; i++){
			copy[i] = original[i];
			System.out.print(copy[i]+", ");
		}
		for(int j=original.length-1; j>2; j--){
			copy[j] = original[j];
			if(j==3){
				System.out.print(copy[j]);
			}
			else{
				System.out.print(copy[j]+", ");
			}
		}
		System.out.print("]");
		
	}

}
