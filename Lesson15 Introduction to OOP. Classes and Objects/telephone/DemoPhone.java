package telephone;

public class DemoPhone {

	public static void main(String[] args) {
		Gsm iphone = new Gsm("iPhone 6");
		Gsm samsung = new Gsm("Samsung Galaxy S4");
		
		iphone.insertSimCard("0888732573");
		samsung.insertSimCard("0879274037");
		
		iphone.call(samsung, 6);
		samsung.call(iphone, 3.5);
		iphone.call(samsung, 4.3);
		
		iphone.printInfoForTheLastIncomingCall();
		iphone.printInfoForTheLastOutgoingCall();
		
		samsung.printInfoForTheLastIncomingCall();
		samsung.printInfoForTheLastOutgoingCall();
		
		System.out.println(iphone.getSumForCall());
		System.out.println(samsung.getSumForCall());
		
	}

}
