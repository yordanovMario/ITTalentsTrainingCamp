

public abstract class MusicalInstrument {
	
	enum type {STRUNEN, UDAREN, ELEKTRONEN, DUHOV, KLAVISHEN};
	private String vid;
	private type type;
	private String name;
	private double price;
	private int stock;
	private int selled;
	
	
	public MusicalInstrument(String vid, String name, type instrumentType, double price, int stock) {
		this.vid = vid;
		this.type = instrumentType;
		this.name = name;
		this.price = price;
		this.stock = stock;
		this.selled = 0;
	}

	public int getSelled() {
		return selled;
	}

	private void addSelled(int count){
		this.selled += count;
	}
	
	public String getName() {
		return name + "";
	}


	public String getVid() {
		return vid;
	}


	public void setType(type type) {
		this.type = type;
	}


	public String getType() {
		return type + "";
	}

	public double getPrice() {
		return price;
	}

	public int getStock() {
		return stock;
	}
	
	public void addStock(int count) {
		this.stock += count;
	}
	
	public void sellStock(int count) {
		this.stock -= count;
		addSelled(count);
	}


	@Override
	public String toString() {
		return "Тип: " + type + ", Вид: " + vid + ", Име: " + name + ", Цена: " + price + ", Наличност: " + stock;
	}
}
