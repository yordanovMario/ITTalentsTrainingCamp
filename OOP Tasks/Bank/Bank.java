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
		this.klienti.get(klient).put("�������", deposit);
		System.out.println("���� ���������� " + suma + " ��. �� " + klient.getName() + " �� " + deposit.getDuration() + " ������");
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
				klienti.get(klient).put("������", kredit);
				this.money -= suma;
				System.out.println("������ ���� �������� �� ������ " + klient.getName() + " �� �������� " + suma + " � ��������������� " + duration + " ������ � ������� ������ " + kredit.getVnoska());
				return kredit;
			}
			System.out.println("��������� �� ������� �� ��������� ����������� �� ��� ���� ������");
			return null;
		}
		System.out.println("������� �� ���� �� ������� ������ �� ���������, ��� ���� �� ��������� � ���������� ��������");
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
