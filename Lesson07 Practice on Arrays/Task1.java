import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter length of the array: ");
		int[] masiv = new int[sc.nextInt()];
		for(int i=0; i<masiv.length; i++){
			System.out.println("Enter value for position "+i+":");
			masiv[i]=sc.nextInt();
		}
		boolean allNums = true;
		for(int i=0; i<masiv.length; i++){
			if(masiv[i]<0){
				allNums=false;
				break;
			}
		}
		System.out.println(allNums?"All numbers are neotricatelni.":"NOT all numbers are neotricatelni.");
		
		
	}

}
