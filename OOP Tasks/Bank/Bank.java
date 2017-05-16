import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map.Entry;

public class Bank {

	private String name;
	private String address;
	private double money;
	private double deposits;
	public HashMap<Klient, HashMap<String, Product>> klienti;
	//private HashMap<String, HashMap<Product>> produkti;
	
	
	
	public Bank(String name, String address, double money) {
		super();
		this.name = name;
		this.address = address;
		this.money = money;
		this.klienti = new HashMap<Klient, HashMap<String, Product>>();
		//this.produkti = new HashMap<String, HashMap<Product>>();
	}

	public void getDeposit(double suma, String tip, Klient klient){
		
		this.deposits += suma;
		this.money += suma*0.9;
		Deposit deposit;
		if(tip == "Short Deposit"){
			deposit = new Deposit(suma);
		}
		else{
			deposit = new Deposit("", suma);
		}
	
		if(!this.klienti.containsKey(klient)){
			this.klienti.put(klient, new HashMap<String, Product>());
		}
		this.klienti.get(klient).put("Депозит", deposit);
		System.out.println("Бяха депозирани " + suma + " лв. от " + klient.getName() + " за " + deposit.getDuration() + " месеца");
	}
	
	public void payInterest(){
		
	}
	
	public Kredit newCredit(double suma, int duration, String tip, Klient klient){
		Kredit kredit;
		if(tip == "Home Credit"){
			kredit = new Kredit(duration, suma);
		}
		else{
			kredit = new Kredit(suma, duration);
		}
		if(suma < this.money && (this.money-suma > (deposits*0.1))){
			if(klient.getVnoski() < (klient.getSalary()*0.5)){
				if(!klienti.containsKey(klient)){		
					this.klienti.put(klient, new HashMap<String, Product>());
				}
				klienti.get(klient).put("Кредит", kredit);
				this.money -= suma;
				System.out.println("Кредит беше отпуснат на клиент " + klient.getName() + " на стойност " + suma + " с продължителност " + duration + " месеца и месечна вноска " + kredit.getVnoska());
				return kredit;
			}
			System.out.println("Заплатата на клиента не позволява изплащането на още един кредит");
			return null;
		}
		System.out.println("Банката не може да отпусне кредит на кандидата, тъй като не разполага с достатъчно средства");
		return null;
	}
	
	public void vnoskaCredit(Kredit kredit, Klient klient){
		this.money += kredit.getVnoska();
		kredit.platiVnoska();
		if(kredit.getDuration() == 0){
			klienti.get(klient).remove(kredit);
		}
		this.klienti.get(klient).get(kredit).platiVnoska();
	}

}
