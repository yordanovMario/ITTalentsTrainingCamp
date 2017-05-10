import java.util.Scanner;

public class Task16 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double[] masiv1 = new double[10];
		System.out.println("Insert 10 numbers in the array:");
		for(int i=0; i<masiv1.length; i++){
			masiv1[i]=sc.nextDouble();
		}
		for(int i=0; i<masiv1.length; i++){
			if(i==masiv1.length-1){
				System.out.print(masiv1[i]);
			}
			else{
				System.out.print(masiv1[i]+", ");
			}
		}
		double[] masiv2=new double[masiv1.length];
		for(int i=0; i<masiv1.length; i++){
			if(masiv1[i]<-0.231){
				masiv2[i]=41.25+(i+1)*(i+1);
			}
			else{
				masiv2[i]=masiv1[i]*(i+1);
			}
		}
		System.out.println();
		for(int i=0; i<masiv1.length; i++){
			if(i==masiv1.length-1){
				System.out.print(masiv2[i]);
			}
			else{
				System.out.print(masiv2[i]+", ");
			}
		}
		
	}

}
