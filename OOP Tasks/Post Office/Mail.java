package postOffice;

public class Mail extends Item {
	
	private double tax;
	
	public Mail(Citizen sender, Citizen receiver) {
		super(sender, receiver);
		this.tax = 0.5;
	}

}
