package vinetki;

public class Vinetka {
	
	public enum AutoType {
		CAR(5, "Blue"), TRUCK(7, "Yellow"), BUS(9, "Red");
		
		private int price;
		private String color;
		
		private AutoType(int price, String color) {
			this.price = price;
			this.color = color;
		}
	}
	public enum DurationType {
		
		EARLY(60), MONTHLY(10), DAYLY(1);
		
		private int multiplier;
		
		private DurationType(int multiplier) {
			this.multiplier = multiplier;
		}
	}
	

	private AutoType type;//za kamion, za kola, za avtobus
	private DurationType srok;//dnevna, mesechna, godishna
	private int price;
	
	public Vinetka(AutoType type, DurationType srok) {
		
		this.type = type;
		this.srok = srok;
		this.price = calcPrice();
	}

	private int calcPrice() {
		return type.price*srok.multiplier;
	}
	
	@Override
	public String toString() {
		return type + " - " + srok;
	}
	
	public AutoType getType() {
		return type;
	}
	
	public DurationType getSrok() {
		return srok;
	}
	
	public String getColor(){
		return type.color;
	}
	
	public int getPrice() {
		return price;
	}
}
