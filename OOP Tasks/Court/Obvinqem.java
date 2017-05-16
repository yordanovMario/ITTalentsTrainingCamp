import java.util.HashSet;

public class Obvinqem extends Grajdanin {
	
	private HashSet<Advokat> advokati;

	public Obvinqem(String ime, String prezime, String familiq, String address, int age) {
		super(ime, prezime, familiq, address, age);
		this.advokati = new HashSet<Advokat>();
		// TODO Auto-generated constructor stub
	}

	public HashSet<Advokat> getAdvokati() {
		return advokati;
	}
	
	public void addAdvokat(Advokat advokatcheto){
		advokati.add(advokatcheto);
	}
}
