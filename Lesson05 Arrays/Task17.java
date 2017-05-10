import java.util.Scanner;

public class Task17 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter array length: ");
		int[] masiv = new int[sc.nextInt()];
		System.out.println("Insert "+masiv.length+" numbers in the array:");
		for(int i=0; i<masiv.length; i++){
			masiv[i]=sc.nextInt();
		}
		boolean zigzag = true;
		for(int i=0; i<masiv.length-1; i++){
			if(i%2==0){
				if(masiv[i]>masiv[i+1]){
					zigzag=false;
					break;
				}
			}
			else{
				if(masiv[i]<masiv[i+1]){
					zigzag=false;
					break;
				}
			}
		}
		System.out.println(zigzag?"The numbers satisfy the requirements":"The numbers do NOT satisfy the requirements.");
		
		
	}

}
