import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Insert a number:");
		int x = sc.nextInt();
		int[] masiv = new int[10];
		masiv[0]=masiv[1]=x;
		for(int i=0; i<=7; i++){
			masiv[i+2]=masiv[i]+masiv[i+1];
		}
		System.out.print("[");
		for(int j=0; j<masiv.length; j++){
			if(j==masiv.length-1){
				System.out.print(masiv[j]);
			}
			else{
				System.out.print(masiv[j]+", ");
			}
		}
		System.out.print("]");
	}

}
