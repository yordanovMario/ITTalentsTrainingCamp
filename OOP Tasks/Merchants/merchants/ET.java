package merchants;

import java.util.ArrayList;

import suppliers.Drebno;
import tradingObjects.IETTradingObject;
import tradingObjects.Product;

public class ET extends Merchant{
	
	private Drebno[] drebni;
	private IETTradingObject store; 
	
	public ET(String name, String address, int money) {
		super(name, address, money);
		drebni = new Drebno[5];
	}
	
	public void setTradingObject(IETTradingObject store){
		this.store = store;
	}

	@Override
	void acceptProducts(ArrayList<Product> products) {
		this.store.acceptProducts(products);
	}
	
}
