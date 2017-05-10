import java.util.Scanner;

public class Task13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insert a number between 2 and 27:");
		int Num = sc.nextInt();
		if(Num>=2 && Num<=27){
			for(int x=102; x<=999; x++){
				int stotici = x/100;
				int desetici = (x/10)%10;
				int edinici = x%10;
				if(stotici+desetici+edinici==Num){
					System.out.println(x);
				}
			}	
		}
		else{
			System.out.println("Invalid number!");
		}
	}

}
// x/100    (x/10)%10     x%10
//Zashto ne raboti bez sum=0?