
public class Task5 {

	public static void main(String[] args) {
		int[] masiv = new int[10];
		System.out.print("[");
		for(int i=0; i<masiv.length; i++){
			masiv[i]=i*3;
			if(i==masiv.length-1){
				System.out.print(masiv[i]);
			}
			else{
				System.out.print(masiv[i]+", ");
			}
		}
		System.out.print("]");

	}

}
