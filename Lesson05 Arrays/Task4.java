import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array length:");
		int[] masiv = new int[sc.nextInt()];
		System.out.println("Insert "+masiv.length+" numbers for the array.");
		for(int scan=0; scan<masiv.length; scan++){
			masiv[scan] = sc.nextInt();
		}
		boolean ogledalen=true;
		for(int i=0; i<=(masiv.length/2)-1; i++){
			for(int j=1; j<=masiv.length/2; j++){
				if(masiv[i]!=masiv[masiv.length-j]){
					ogledalen=false;
					
				}
				else{
					ogledalen=true;
				}
			}	
		}
		System.out.println(ogledalen?"The array is specular.":"The array is NOT specular.");
	}

}
