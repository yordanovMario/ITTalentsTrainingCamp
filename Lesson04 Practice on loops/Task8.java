
public class Task8 {

	public static void main(String[] args) {
		
		int n = 5;
		int spaces = n-1;
		int stars = 1;
		
		for(int row = 1; row<=n; row++){//for each row
			//print spaces
			for(int s = 1; s <= spaces; s++){
				System.out.print(" ");
			}
			//print stars
			for(int t = 1; t <= stars; t++){
				System.out.print("*");
			}
			//decrease spaces for next row
			spaces--;
			//increase stars for next row
			stars+=2;
			//print new line
			System.out.println();
		}
		
	}
}
