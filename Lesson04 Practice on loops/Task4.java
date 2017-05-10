
public class Task4 {

	public static void main(String[] args) {
		
		int x = 8;
		
		boolean xIsPrime = true;
		
		for(int i = 2; i<x-1; i++){
			if(x%i ==0){
				xIsPrime = false;
				break;
			}
		}
		
		if(xIsPrime){
			System.out.println("x is prime");
		}
		else{
			System.out.println("x is not prime");
		}
	}
}
