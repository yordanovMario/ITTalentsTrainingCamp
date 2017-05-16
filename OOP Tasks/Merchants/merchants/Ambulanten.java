package merchants;

import java.util.ArrayList;

import suppliers.Drebno;
import tradingObjects.Product;

public class Ambulanten extends Merchant{
	
	Drebno supplier;  // 1 suplier na drebno
	ArrayList<Product> products;
	
	public Ambulanten(String name, String address, int money) {
		super(name, address, money);
	}

	@Override
	void acceptProducts(ArrayList<Product> products) {
		this.products.addAll(products);
	}
	
}
