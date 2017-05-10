import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] masiv = new int [6][5];
		for(int i=0; i<masiv.length; i++){
			for(int j=0; j<masiv[i].length; j++){
				System.out.println("Enter value for ["+i+"]["+j+"]");
				masiv[i][j] = sc.nextInt();
			}
		}
		int min = masiv[0][0];
		int max = masiv[0][0];
		for(int i=0; i<masiv.length; i++){
			for(int j=0; j<masiv[0].length; j++){
				if(masiv[i][j]<min){
					min = masiv[i][j];
				}
				if(masiv[i][j]>max){
					max = masiv[i][j];
				}
			}
		}
		System.out.println("Smallest number: "+min);
		System.out.println("Biggest number: "+max);
		System.out.println(masiv[0].length);
	}

}
