package merchants;

import java.util.ArrayList;

import suppliers.Supplier;
import tradingObjects.IChainTradingObject;
import tradingObjects.Product;

public class Chain extends Merchant{
	
	private Supplier[] suppliers; 
	private IChainTradingObject[] stores;
	private int addedStores = 0;

	public Chain(String name, String address, int money) {
		super(name, address, money);
		this.suppliers = new Supplier[15]; 
		this.stores = new IChainTradingObject[10];
	}

	public void setTradingObject(IChainTradingObject store){
		if(addedStores < this.stores.length){
			this.stores[addedStores++] = store;
		}
	}
	
	@Override
	void acceptProducts(ArrayList<Product> products) {
		for (int i = 0; i < stores.length; i++) {
			if(stores[i] != null){
				stores[i].acceptProducts(products);
			}
		}
	}
	
}
