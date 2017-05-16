package tradingObjects;

public class Product {
	
	private String name;
	private int price;
	
	public Product(String name, int price) {
		if(!name.isEmpty()){
			this.name = name;
		}
		if(price > 0){
			this.price = price;
		}
	}
	
	public int getPrice() {
		return this.price;
	}
	
}
