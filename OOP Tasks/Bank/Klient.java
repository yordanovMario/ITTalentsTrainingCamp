import java.util.ArrayList;
import java.util.Iterator;

public class Klient {

	private String name;
	private String address;
	private double cash;
	private double salary;
	private ArrayList<Deposit> depositi;
	private ArrayList<Kredit> krediti;
	public static Bank banka;
	
	public Klient(String name, String address, double cash, double salary) {
		this.name = name;
		this.address = address;
		this.cash = cash;
		this.salary = salary;
		depositi = new ArrayList();
		krediti = new ArrayList();
	}
	
	public void getCredit(double suma, int duration, String tip){
		Kredit kredit = this.banka.newCredit(suma, duration, tip, this);
		this.krediti.add(kredit);
		this.cash += suma;
	}
	
	public void vnoskaCredit(Kredit kredit){
		this.banka.vnoskaCredit(kredit, this);
		this.cash -= kredit.getVnoska();
		if(kredit.getDuration() == 0){
			krediti.remove(kredit);
		}
	}
	
	public String getName() {
		return name;
	}

	public double getSalary() {
		return salary;
	}

	public void otkrivaneNaDeposit(double suma, String tip){
		if(suma < this.cash){
			this.banka.getDeposit(suma, tip, this);
			this.cash -= suma;
		}
	}
	
	public double getVnoski(){
		double sum = 0;
		for (Iterator<Kredit> iterator = krediti.iterator(); iterator.hasNext();) {
			sum += iterator.next().getVnoska();
		}
		return sum;

	}
	
}
