import java.util.Scanner;

public class Task5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of rows:");
		int a=sc.nextInt();
		System.out.print("Enter number of columns:");
		int b=sc.nextInt();
		int[][] masiv = new int[a][b];
		for(int i=0; i<masiv.length; i++){
			for(int j=0; j<masiv[i].length; j++){
				System.out.println("Enter value for ["+i+"]["+j+"]");
				masiv[i][j]=sc.nextInt();
			}
		}
		int[] masiv2 = new int [masiv[0].length];
		int sumRow=0;
		int maxSum=masiv2[0];
		for(int i=0; i<1; i++){
			for(int j=0; j<masiv[0].length; j++){
				sumRow=masiv[i][j]+sumRow;
				masiv2[j]=sumRow;
				sumRow=0;
			}
		}
		for(int i=0; i<masiv2.length; i++){
			if(maxSum<masiv2[i]){
				maxSum=i;
			}
		}
		System.out.println("The row with the biggest sum of the numbers is "+maxSum+".");
	}

}
