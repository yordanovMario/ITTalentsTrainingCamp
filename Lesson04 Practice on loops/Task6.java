
public class Task6 {

	public static void main(String[] args) {
		
		int x = 19;
		
		int counter = 0;
		
		while(x>0){
			int ostatuk = x%2;
			System.out.println(ostatuk);
			if(ostatuk == 1){
				counter++;
			}
			x/=2;
		}
		System.out.println("Number of ones = " + counter);
	}
}
