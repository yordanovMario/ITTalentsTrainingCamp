import java.util.Scanner;

public class Task9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Insert Number A:");
		int A = sc.nextInt();
		System.out.println("Insert Number B:");
		int B = sc.nextInt();
		int min = A;
		int max = B;
		if(B<A){
			min = B;
			max = A;
		}
		int counter = 0;
		if(min<=max){
			for(int x=min; x<=max; x++){
				if((x*x)%3==0){
					System.out.print("skip "+x*x);
				}
				else{
					System.out.print(x*x);
					counter+=x*x;
					if(counter>200){
						break;
					}
				}
				if(x==max){
					break;
				}
				System.out.print(",");
			}
		}
	}

}
