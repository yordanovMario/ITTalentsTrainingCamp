
public class Task5 {

	public static void main(String[] args) {
		
		int x = 1119;
		int umnojitel = 1;
		int sum = 0;
		
		while(x > 0){
			int ostatuk = x%2;
			sum = sum + (ostatuk*umnojitel);
			umnojitel = umnojitel*10;
			System.out.println(ostatuk);
			x/=2;
		}
		System.out.println(sum);
	}
}
