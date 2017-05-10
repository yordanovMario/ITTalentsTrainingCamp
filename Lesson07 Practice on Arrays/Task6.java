import java.util.Scanner;

public class Task6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter matrix length:");
		int a = sc.nextInt();
		char[][] masiv = new char[a][a];
		for(int i=0; i<masiv.length; i++){
			for(int j=0; j<masiv.length; j++){
				System.out.println("Enter a letter in ["+i+"]["+j+"]");
				masiv[i][j] = sc.next().charAt(0);
			}
		}
		for(int i=0; i<masiv.length; i++){
			for(int j=0; j<masiv.length; j++){
				if(i==j){
					System.out.print(masiv[i][j]+" ");
				}
			}
		}
		
	}

}
