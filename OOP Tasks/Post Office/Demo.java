package postOffice;

public class Demo {

	public static void main(String[] args) {
		
		PostOffice post = new PostOffice();
		MailCollector collector1 = new MailCollector("Ivan", "Ivanov", 1, post);
		PostMan deliverer1 = new PostMan("Petar", "Petrov", 4, post);
		
		

	}

}
