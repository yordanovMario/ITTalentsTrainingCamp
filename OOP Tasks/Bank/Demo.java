
public class Demo {
	
	public static void main(String[] args) {
		
		Klient pesho = new Klient("����", "�����", 15000, 1500);
		Klient gosho = new Klient("����", "�����", 1500, 1600);
		Klient misho = new Klient("����", "�����", 5000, 1700);
		Klient vanio = new Klient("�����", "�������", 2000, 1800);
		Klient maria = new Klient("�����", "������", 12000, 1000);
		Klient petya = new Klient("����", "�����", 18000, 2000);
		Klient luiza = new Klient("�����", "������", 1000, 1400);
		Klient gliza = new Klient("�����", "����", 10000, 1300);
		Klient pizza = new Klient("�����", "�����", 4000, 1200);
		
		Bank banka = new Bank("�������", "�������", 500000);
		
		Klient.banka = banka;
		
		pesho.getCredit(15000, 60, "Home Credit");
		gosho.getCredit(12000, 48, "Consumer Credit");
		misho.getCredit(11000, 36, "Home Credit");
		vanio.getCredit(10000, 24, "Consumer Credit");
		maria.getCredit(9000, 12, "Home Credit");
		petya.getCredit(8000, 6, "Consumer Credit");
		luiza.getCredit(7000, 30, "Home Credit");
		gliza.getCredit(6000, 18, "Consumer Credit");
		pizza.getCredit(5000, 36, "Home Credit");
		pesho.getCredit(15000, 60, "Home Credit");
		gosho.getCredit(12000, 48, "Consumer Credit");
		misho.getCredit(11000, 36, "Home Credit");
		vanio.getCredit(10000, 24, "Consumer Credit");
		maria.getCredit(9000, 12, "Home Credit");
		petya.getCredit(8000, 6, "Consumer Credit");
		luiza.getCredit(7000, 30, "Home Credit");
		gliza.getCredit(6000, 18, "Consumer Credit");
		pizza.getCredit(5000, 36, "Home Credit");
		
		pesho.otkrivaneNaDeposit(1000, "Short Deposit");
		gosho.otkrivaneNaDeposit(1800, "Long Deposit");
		misho.otkrivaneNaDeposit(1100, "Short Deposit");
		vanio.otkrivaneNaDeposit(1200, "Long Deposit");
		System.out.println(banka.klienti);
		
	}
	
}
