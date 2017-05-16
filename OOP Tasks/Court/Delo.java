import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;

public class Delo {
	
	private String tip;
	private Sydiq sydiq;
	private HashSet<Zasedatel> zasedateli;
	private Obvinqem obvinqem;
	private Obvinitel obvinitel;
	private Prokuror prokuror;
	private HashSet<Svidetel> svideteli;
	private ArrayList<String> hronologiq = new ArrayList<String>();
	
	public Delo(Sydiq sydiq, Obvinqem obvinqem, Prokuror prokuror, HashSet<Svidetel> svideteli) {
		this.tip = "����������� ����";
		this.sydiq = sydiq;
		this.zasedateli = generateZasedateli(13);
		this.obvinqem = obvinqem;
		this.prokuror = prokuror;
		this.svideteli = new HashSet();
	}

	public Delo(Sydiq sydiq, Obvinqem obvinqem, Obvinitel obvinitel, HashSet<Svidetel> svideteli) {
		this.tip = "���������� ����";
		this.sydiq = sydiq;
		this.zasedateli = generateZasedateli(3);
		this.obvinqem = obvinqem;
		this.obvinitel = obvinitel;
		this.svideteli = new HashSet();
	}
	
	private HashSet<Zasedatel> generateZasedateli(int broi){
		HashSet<Zasedatel> zsdtli = new HashSet<Zasedatel>();
		for (int i = 0; i < broi; i++) {
			String name = "Gringo" + broi;
			zsdtli.add(new Zasedatel(name, broi, broi));
		}
		return zsdtli;
	}

	public void provejdane(){
		this.hronologiq.add("������� ���� �� ���: " + tip);
		this.hronologiq.add("�����: " + sydiq.getName());
		if(this.prokuror != null){
			this.prokuror.uchastieVDelo();
			this.hronologiq.add("��������: " + prokuror.getName());
		}
		else{
			this.hronologiq.add("���������: " + obvinitel.getIme());
		}
		this.sydiq.uchastieVDelo();
		
		this.hronologiq.add("��������: " + obvinqem.getIme());
		
		for (Iterator<Zasedatel> iterator = zasedateli.iterator(); iterator.hasNext();) {
			iterator.next().uchastieVDelo();
		}
		if(this.tip == "���������� ����"){
			HashSet<Advokat> advokati = obvinitel.getAdvokati();
			for (Iterator<Advokat> iterator = advokati.iterator(); iterator.hasNext();) {
				Advokat advokatcheto = iterator.next();
				this.hronologiq.add("������� �� ��������� ��� �������� " + advokatcheto.zadaiVypros(obvinqem));
				this.hronologiq.add("������� �� ��������� ��� �������� " + advokatcheto.zadaiVypros(obvinqem));
				this.hronologiq.add("������� �� ��������� ��� �������� " + advokatcheto.zadaiVypros(obvinqem));
			}
			for (Iterator<Advokat> iterator = advokati.iterator(); iterator.hasNext();) {
				Advokat advokatcheto = iterator.next();
				for (Iterator<Svidetel> iterator2 = svideteli.iterator(); iterator.hasNext();) {
					Svidetel svidetelcheto = iterator2.next();
					this.hronologiq.add("������� �� ��������� ��� �������� " + advokatcheto.zadaiVypros(svidetelcheto));
					this.hronologiq.add("������� �� ��������� ��� �������� " + advokatcheto.zadaiVypros(svidetelcheto));
				}
			}
		}
		else{
			this.hronologiq.add("�������� ��� �������� " + this.prokuror.zadaiVypros(obvinqem));
			this.hronologiq.add("�������� ��� �������� " + this.prokuror.zadaiVypros(obvinqem));
			this.hronologiq.add("�������� ��� �������� " + this.prokuror.zadaiVypros(obvinqem));
			this.hronologiq.add("�������� ��� �������� " + this.prokuror.zadaiVypros(obvinqem));
			this.hronologiq.add("�������� ��� �������� " + this.prokuror.zadaiVypros(obvinqem));
			
			for (Iterator<Svidetel> iterator = svideteli.iterator(); iterator.hasNext();) {
				this.hronologiq.add("�������� ��� �������� " + prokuror.zadaiVypros(iterator.next()));
				this.hronologiq.add("�������� ��� �������� " + prokuror.zadaiVypros(iterator.next()));
				this.hronologiq.add("�������� ��� �������� " + prokuror.zadaiVypros(iterator.next()));
				this.hronologiq.add("�������� ��� �������� " + prokuror.zadaiVypros(iterator.next()));
				this.hronologiq.add("�������� ��� �������� " + prokuror.zadaiVypros(iterator.next()));
			}
		}
		
		HashSet<Advokat> advokati = obvinqem.getAdvokati();
		for (Iterator<Advokat> iterator = advokati.iterator(); iterator.hasNext();) {
			Advokat advokatcheto = iterator.next();
			for (Iterator<Svidetel> iterator2 = svideteli.iterator(); iterator.hasNext();) {
				Svidetel svidetelcheto = iterator2.next();
				this.hronologiq.add("������� �� �������� ��� �������� " + advokatcheto.zadaiVypros(svidetelcheto));
				this.hronologiq.add("������� �� �������� ��� �������� " + advokatcheto.zadaiVypros(svidetelcheto));
				this.hronologiq.add("������� �� �������� ��� �������� " + advokatcheto.zadaiVypros(svidetelcheto));
				this.hronologiq.add("������� �� �������� ��� �������� " + advokatcheto.zadaiVypros(svidetelcheto));
				this.hronologiq.add("������� �� �������� ��� �������� " + advokatcheto.zadaiVypros(svidetelcheto));
			}
		}
		int resheniq = 0;
		for (Iterator<Zasedatel> iterator = zasedateli.iterator(); iterator.hasNext();) {
			if(iterator.next().vzemaneNaReshenie() == true){
				resheniq++;
			}
		}
		if(resheniq > zasedateli.size()/2){
			int prisyda = new Random().nextInt(37)+3;
			this.hronologiq.add("��������� ���������� ����� ������� � " + resheniq + " ����� ��, �� ����������� � �������.");
			this.hronologiq.add("����� " + sydiq.getName() + " ��� ������� ����������� " + obvinqem.getIme() + " �� ���� � ������� " + prisyda + " ������.");
		}
		else{
			this.hronologiq.add("��������� ���������� ����� ������� � " + resheniq + " ����� ������, �� ����������� � �������.");
		}
		
	}
	public void printHrono(){
		for (Iterator<String> iterator = hronologiq.iterator(); iterator.hasNext();) {
			System.out.println(iterator.next());
		}
	}
}
