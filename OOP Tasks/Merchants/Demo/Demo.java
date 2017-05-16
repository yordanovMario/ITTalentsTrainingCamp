package Demo;

import java.util.Random;

import merchants.Ambulanten;
import merchants.Chain;
import merchants.ET;
import merchants.Merchant;
import suppliers.Drebno;
import suppliers.Edro;
import suppliers.Supplier;
import tradingObjects.Budka;
import tradingObjects.IChainTradingObject;
import tradingObjects.IETTradingObject;
import tradingObjects.Mall;
import tradingObjects.Sergia;
import tradingObjects.TradingObject;

public class Demo {
	
	static Supplier[] suppliersArr = new Supplier[10];
	static TradingObject[] tradingObjectsArr = new TradingObject[20];
	
	public static void startTrading(Merchant[] merchants){
		
	}
	
	public static void main(String[] args) {
		
		//1.
		for (int i = 0; i < suppliersArr.length; i++) {
			boolean rand = new Random().nextBoolean();
			if(rand){
				suppliersArr[i] = new Drebno();
			}
			else{
				suppliersArr[i] = new Edro();
			}
		}
		
		//2.
		for (int i = 0; i < tradingObjectsArr.length; i++) {
			int rand = new Random().nextInt(3);
			if(rand == 0){
				tradingObjectsArr[i] = new Sergia("Mladost", "10-17", 8);
			}
			if(rand == 1){
				tradingObjectsArr[i] = new Mall("Hladilnika", "10-22", 90);
			}
			if(rand == 2){
				tradingObjectsArr[i] = new Budka("Lozenetz", "9-16", 4);
			}
		}
		
		//3.
			Ambulanten ambul = new Ambulanten("Yoanna", "Hladilnika", 100);
			ET mario = new ET("Mario Yordanov", "Hladilnika", 500);
			Chain billa = new Chain("Billa", "Lulin", 3000);
			
			//4.
			int randIndexTO = new Random().nextInt(tradingObjectsArr.length);
			if(tradingObjectsArr[randIndexTO] instanceof IChainTradingObject){
				billa.setTradingObject((IChainTradingObject) tradingObjectsArr[randIndexTO]);
			}
			
			randIndexTO = new Random().nextInt(tradingObjectsArr.length);
			if(tradingObjectsArr[randIndexTO] instanceof IETTradingObject){
				mario.setTradingObject((IETTradingObject) tradingObjectsArr[randIndexTO]);
			}
			
			//5.
			Merchant[] merchants = new Merchant[3];
			merchants[0] = ambul;
			merchants[1] = mario;
			merchants[2] = billa;
			
			ambul.payTaxes(tradingObjectsArr[1]);
			System.out.println(ambul.getMoney());
	}

}
