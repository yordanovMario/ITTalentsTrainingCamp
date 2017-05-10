import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Insert 7 values in the array:");
		int[] masiv = new int[7];
		for(int i=0; i<masiv.length; i++){
			masiv[i] = sc.nextInt();
		}
		int min = masiv[0];
		for(int j=0; j<masiv.length; j++){
			if(masiv[j]%3==0){
				min=masiv[j];
				break;
			}	
		}
		for(int smallestj=0; smallestj<masiv.length; smallestj++){
			if(min>masiv[smallestj] && masiv[smallestj]%3==0){
				min=masiv[smallestj];
			}
		}
		System.out.println((min%3==0)?"The smallest number dividable by 3 is: "+min:"No numbers dividable by 3.");
		
	}

}
