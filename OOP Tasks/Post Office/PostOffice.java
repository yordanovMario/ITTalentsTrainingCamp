package postOffice;

import java.util.Vector;
import java.util.concurrent.ConcurrentHashMap;

public class PostOffice {
	
	private static final int MIN_ITEMS = 50;
	
	private ConcurrentHashMap<Integer, Vector<Mail>> postBoxes;
	private Vector<Item> allItems;
	
	public PostOffice() {
		this.postBoxes = new ConcurrentHashMap<>();
		for (int i = 1; i <= 25; i++) {
			this.postBoxes.put(i, new Vector<Mail>());
		}
		this.allItems = new Vector<Item>();
	}
	
	public Vector<Item> getAllItems() {
		return allItems;
	}
	
	public synchronized void insertCollectedMail(){
		if(allItems.size() >= MIN_ITEMS){
			try {
				wait();
			} catch (InterruptedException e) {
				System.out.println("ops");
			}
		}
		notifyAll();
	}
	
	public synchronized void deliverMail(){
		if(allItems.size() < MIN_ITEMS){
			try {
				wait();
			} catch (InterruptedException e) {
				System.out.println("ops");
			}
		}
		notifyAll();
	}
	
}
