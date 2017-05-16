package tradingObjects;

import java.util.ArrayList;

public abstract class TradingObject {
	
	private String address;
	private String workingTime;
	private double area;
	private int tax;
	private ArrayList<Product> products;
	
	public TradingObject(String address, String workingTime, double area, int tax) {
		if(validateArea(area)){
			this.area = area;
		}
		if(!address.isEmpty()){
			this.address = address;
		}
		if(!workingTime.isEmpty()){
			this.workingTime = workingTime;
		}
		this.tax = tax;
	}

	protected abstract boolean validateArea(double area);
	
	public void acceptProducts(ArrayList<Product> pokupki){
		this.products.addAll(pokupki);
	}

	public ArrayList<Product> getProducts() {
		return products;
	}

	public int getTax() {
		return tax;
	}
	
	
}
