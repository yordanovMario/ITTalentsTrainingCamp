import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the names (name, surname and last name) of 2 persons divided by a ',':");
		String names = sc.nextLine();
		String[] arrnames = names.split(",");
		int sumChars1=0;
		for(int i=0; i<arrnames[0].length(); i++){
			sumChars1=arrnames[0].charAt(i)+sumChars1;
		}
		int sumChars2=0;
		for(int i=0; i<arrnames[1].length(); i++){
			sumChars2=arrnames[1].charAt(i)+sumChars2;
		}
		if(sumChars1>sumChars2){
			System.out.println(arrnames[0]+" has a bigger sum of the ASCII codes of the letters in the name.");
		}
		else{
			System.out.println(arrnames[1]+" has a bigger sum of the ASCII codes of the letters in the name.");
		}
		
	}

}
