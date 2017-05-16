package tradingObjects;

public class Budka extends TradingObject implements IChainTradingObject, IETTradingObject{

	public Budka(String address, String workingTime, double area) {
		super(address, workingTime, area, 50);
	}

	@Override
	protected boolean validateArea(double area) {
		return area >= 4 && area <= 6;
	}

}
