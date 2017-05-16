
public class Kredit extends Product {

	private double vnoska;
	public Kredit(int duration, double suma) {
		super("Home Credit", 6.0, duration, suma);
		vnoska(duration, suma, 6.0);
	}
	
	public Kredit(double suma, int duration){
		super("Consumer Credit", 10.0, duration, suma);
		vnoska(duration, suma, 10.0);
	}

	public double getVnoska() {
		return vnoska;
	}
	
	private void vnoska(int duration, double suma, double interest){
		double mesechna = duration/12;
		this.vnoska = (suma*(1+((interest*mesechna)/100)))/duration;
	}
	
	
}
