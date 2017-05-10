import java.util.Scanner;

public class Task22 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Insert a number:");
		int n=sc.nextInt();
		int counter=0;
		int num = n;
		while(counter<=10){
			if(num%2==0 || num%3==0 || num%5==0){
				counter++;
				System.out.print(counter+":"+num);
				if(counter==10){
					break;
				}
				System.out.print(" ,");
			}
			num++;		
		}
	}

}
