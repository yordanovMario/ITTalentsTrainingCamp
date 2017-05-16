package postOffice;

public abstract class Item {
	
	private Citizen sender;
	private Citizen receiver;
	
	public Item(Citizen sender, Citizen receiver) {
		if(sender != null){
			this.sender = sender;
		}
		if(sender != null){
			this.receiver = receiver;
		}
	}
	
	
}
