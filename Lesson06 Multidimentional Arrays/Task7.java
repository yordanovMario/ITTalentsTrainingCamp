
public class Task7 {

	public static void main(String[] args) {
		int[][] masiv = { {11,12,13,14,15,16} , 
				{21,22,23,24,25,26} , 
				{31,32,33,34,35,36} ,
				{41,42,43,44,45,46} ,
				{51,52,53,54,55,56} , 
				{61,62,63,64,65,66} 
				};
		int sumRows = 0;
		int sum = 0;
		int count = 0;
		for(int i = 0; i < masiv.length; i++){
			if((count + i) % 2 == 0){
				sumRows += masiv[count][i];
				System.out.print(masiv[count][i] + " ");
			}
			if (i == masiv.length - 1){
				count++;
				if(count != 6){
					System.out.println(" - sum is: " + sumRows);
					sum += sumRows;
					sumRows = 0;
					i = -1;
				}
				else{
					System.out.println(" - sum is: " + sumRows);
					sum += sumRows;
					System.out.print("The sum of all is: " + sum);
				}
			}
		}
	}

}
