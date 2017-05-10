import java.util.Scanner;

public class Task5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Insert number a:");
		int a=sc.nextInt();
		System.out.println("Insert number b:");
		int b=sc.nextInt();
		if(a==b){
			System.out.println("You have entered two identical numbers!");
		}
		else{
			if(a<b){
				for(int x=a; x<=b; x++){
					System.out.print(x+" ");
				}
			}
			else{
				for(int x=b; x<=a; x++){
				System.out.print(x+" ");
				}
			}	
		}

	}

}
