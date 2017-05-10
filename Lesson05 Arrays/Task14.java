import java.util.Scanner;

public class Task14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Array length:");
		double[] masiv1 = new double[sc.nextInt()];
		System.out.println("Enter "+masiv1.length+" numbers in the Array.");
		double[] masiv2 = new double[masiv1.length];
		for(int num=0; num<masiv1.length; num++){
			masiv1[num]=sc.nextDouble();
		}
		for(int i=0; i<masiv1.length; i++){
			if(masiv1[i]>-2.99 && masiv1[i]<2.99){
				masiv2[i]=masiv1[i];
			}
		}
		for(int i=0; i<masiv1.length; i++){
			if(masiv2[i]==0.0){
				continue;
			}
			System.out.print(masiv2[i]+"; ");
		}
		
	}

}
