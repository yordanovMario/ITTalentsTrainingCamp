import java.util.Scanner;

public class Task6 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Insert a number:");
		int a = sc.nextInt();
		int sum = 0;
		if(a<=0){
			for (int i = 1; i >= a; i--) {
			sum+=i;
			}
		}
		else{
			for(int i = 1; i <=a; i++){
				sum+=i;
			}
		}
		System.out.println("The sum of all numbers between 1 and "+a+" is: "+sum);
	    
	}

}
