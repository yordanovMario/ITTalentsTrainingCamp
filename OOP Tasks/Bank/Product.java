
public abstract class Product {
	
	private String name;
	private String type;
	private double interest;
	private int duration;
	private double suma;
	
	
	public Product(String name, double interest, int duration, double suma) {
		this.name = name;
		this.type = type;
		if(interest >0){
			this.interest = interest;
		}
		if(duration>0 && duration <60){
			this.duration = duration;
		}
		this.suma = suma;
	}


	public double getInterest() {
		return interest;
	}
	
	public void platiVnoska(){
		this.duration--;
	}
	
	public int getDuration(){
		return this.duration;
	}
	
}
