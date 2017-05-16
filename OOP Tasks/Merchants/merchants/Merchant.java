package merchants;

import java.util.ArrayList;
import java.util.Random;

import suppliers.Supplier;
import tradingObjects.Product;
import tradingObjects.TradingObject;

public abstract class Merchant implements IMerchant{
	
	private String name;
	private String address;
	private int money;
	
	public Merchant(String name, String address, int money) {
		if(!name.isEmpty()){
			this.name = name;
		}
		if(!address.isEmpty()){
			this.address = address;
		}
		if(money >= 0){
			this.money = money;
		}
	}
	
	@Override
	public void makeOrder(int money, Supplier supplier) {
		if(money > this.money){
			this.money -= money - (money * (supplier.getDiscount() / 100));
			int priceCap = 0;
			ArrayList<Product> listPokupki = new ArrayList<>();
			while(priceCap < money){
				Product p = new Product("Sofa", new Random().nextInt(10)+5);
				listPokupki.add(p);
				priceCap += p.getPrice();
			}
			acceptProducts(listPokupki);
		}
		
	}
	
	@Override
	public void collectMoney(TradingObject obj) {
		int numberOfSold = new Random().nextInt(obj.getProducts().size());
		int revenue = 0;
		int soldPrice = obj.getProducts().get(obj.getProducts().size()-1).getPrice();
		for (int i = 1; i <= numberOfSold; i++) {
			revenue += soldPrice * 1.3;
			obj.getProducts().remove(obj.getProducts().size()-1);
		}
		System.out.println("Revenue: " + revenue);
		this.money += revenue;
	}
	
	@Override
	public void payTaxes(TradingObject obj) {
		this.money -= obj.getTax()/12; //tax for 1 month
	}
	
	abstract void acceptProducts(ArrayList<Product> products);

	public int getMoney() {
		return this.money;
	}
	
	
}
