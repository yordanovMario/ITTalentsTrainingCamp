package postOffice;

public class MailCollector extends PostMan implements Runnable{

	public MailCollector(String firstName, String lastName, int yearsExp, PostOffice postOffice) {
		super(firstName, lastName, yearsExp, postOffice);
	}
	
	@Override
	public void run() {
		while(true){
			try {
				Thread.sleep(2*60*60*1000);
			} catch (InterruptedException e) {
				System.out.println("ops");
			}
			this.getPostOffice().insertCollectedMail();
		}
	}
}
