package merchants;

import java.util.ArrayList;

import suppliers.Supplier;
import tradingObjects.TradingObject;

public interface IMerchant {
	
	void makeOrder(int money, Supplier supplier);
	void collectMoney(TradingObject obj);
	void payTaxes(TradingObject obj);
	
}
