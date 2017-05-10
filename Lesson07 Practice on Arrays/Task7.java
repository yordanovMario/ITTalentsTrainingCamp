import java.util.Scanner;

public class Task7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter matrix length:");
		int a = sc.nextInt();
		int[][] masiv = new int[a][a];
		for(int i=0; i<masiv.length; i++){
			for(int j=0; j<masiv.length; j++){
				System.out.println("Enter a letter in ["+i+"]["+j+"]");
				masiv[i][j] = sc.nextInt();
			}
		}
		int result=1;
		for(int i=0; i<masiv.length; i++){
			for(int j=1; j<masiv.length-1; j++){
				result = masiv[i][j]*result;
			}
		}
		System.out.println(result);
		
		
		
	}

}
