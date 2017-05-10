import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String bukvi1;
		String bukvi2;
		do{
			System.out.println("Enter less than 40 lower or upper case letters into String 1:");
			bukvi1 = sc.nextLine();
			if(bukvi1.length()>40){
				System.out.println("You have entered more than 40 letters.");
			}
		} while(bukvi1.length()>40);
		do{
			System.out.println("Enter less than 40 lower or upper case letters into String 2:");
			bukvi2 = sc.nextLine();
			if(bukvi2.length()>40){
				System.out.println("You have entered more than 40 letters.");
			}
		} while(bukvi2.length()>40);
		System.out.print(bukvi1.toUpperCase()+" "+bukvi1.toLowerCase()+" "+bukvi2.toUpperCase()+" "+bukvi2.toLowerCase());
		
	}

}
