import java.util.Scanner;

public class Task10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] masiv = new int[7];
		System.out.println("Enter 7 numbers in the Array:");
		for(int num=0; num<masiv.length; num++){
			masiv[num]=sc.nextInt();
		}
		double sum=0;
		for(int i=0; i<masiv.length; i++){
			sum=masiv[i]+sum;
		}
		double sredna=sum/masiv.length;
		double[] masiv2 = new double[masiv.length];
		for(int i = 0; i < masiv.length; i++){
			masiv2[i] = sredna-masiv[i];
			if(masiv2[i]<0){
				masiv2[i]*=-1;
			}
		}
		double min = masiv2[0];
		int closest = 0;
		for(int i = 0; i < masiv.length; i++){
			if(min>masiv2[i]){
				min=masiv2[i];
				closest=i;
			}
		}
		System.out.print("The average value is "+sredna+", the closest number to the average value is "+masiv[closest]+".");

	}

}
