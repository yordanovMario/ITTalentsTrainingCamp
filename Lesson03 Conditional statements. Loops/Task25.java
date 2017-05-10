import java.util.Scanner;

public class Task25 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Insert N:");
		int N=sc.nextInt();
		long i=1L;
		int umnoj=2;
		long newNum=0L;
		if(N>0){
			if(N!=1){
				do{
					newNum=i*umnoj;
					umnoj++;
					i=newNum;	
				} while(umnoj<=N);
					System.out.println(newNum);
			}
			else{
				System.out.println(1);
			}
		}
		else{
			System.out.println("Invalid number.");
		}
		}

}
