
public class Deposit extends Product {
	
	private double paymentInterest;

	public Deposit(double suma) {
		super("Short Deposit", 3, 3, suma);
		// TODO Auto-generated constructor stub
	}
	
	public Deposit(String annual, double suma) {
		super("Long Deposit", 5, 12, suma);
		// TODO Auto-generated constructor stub
	}
	
}
