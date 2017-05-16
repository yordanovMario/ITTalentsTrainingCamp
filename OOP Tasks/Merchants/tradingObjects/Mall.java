package tradingObjects;

public class Mall extends TradingObject implements IChainTradingObject{

	public Mall(String address, String workingTime, double area) {
		super(address, workingTime, area, 150);
	}

	@Override
	protected boolean validateArea(double area) {
		return area >= 10 && area <= 100;
	}


	

}
