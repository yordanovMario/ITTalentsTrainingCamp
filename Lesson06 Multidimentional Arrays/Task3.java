import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of rows and columns of the array: ");
		int[][] masiv = new int[sc.nextInt()][sc.nextInt()];
		for(int i=0; i<masiv.length; i++){
			for(int j=0; j<masiv[i].length; j++){
				System.out.println("Enter value for ["+i+"]["+j+"]");
				masiv[i][j]=sc.nextInt();
			}
		}
		int sum=0;
		for(int i=0; i<masiv.length; i++){
			for(int j=0; j<masiv[i].length; j++){
				sum = masiv[i][j]+sum;
			}
		}
		System.out.println("The sum of all elements in the array is "+sum+".");
		int average = sum/(masiv.length*masiv[0].length) ;
		System.out.println("The average is "+average+".");
		
	}

}
