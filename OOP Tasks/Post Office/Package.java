package postOffice;

public class Package extends Item {
	
	private double tax;
	private int length;
	private int width;
	private int height;
	private boolean fragile;
	
	public Package(Citizen sender, Citizen receiver, int length, int width, int height, boolean fragile) {
		super(sender, receiver);
		if(length > 0){
			this.length = length;
		}
		if(length > 0){
			this.width = width;
		}
		if(length > 0){
			this.height = height;
		}
		if(length <= 60 && width <= 60 && height <= 60){
			if(fragile){
				this.tax = 3;
			}
			else{
				this.tax = 2;
			}
		}
		else{
			if(fragile){
				this.tax = 4.50;
			}
			else{
				this.tax = 3;
			}
		}
	}
	
	
	
}
