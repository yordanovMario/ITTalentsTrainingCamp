package tradingObjects;

public class Sergia extends TradingObject implements IETTradingObject{

	public Sergia(String address, String workingTime, double area) {
		super(address, workingTime, area, 50);
	}

	@Override
	protected boolean validateArea(double area) {
		return area >= 2 && area <= 10;
	}
	
	
}
