
public abstract class Grajdanin {
	
	private String ime;
	private String prezime;
	private String familiq;
	private String address;
	private int age;
	
	public Grajdanin(String ime, String prezime, String familiq, String address, int age) {
		super();
		this.ime = ime;
		this.prezime = prezime;
		this.familiq = familiq;
		this.address = address;
		this.age = age;
	}

	public String getIme() {
		return ime + " " + familiq;
	}
	
	
	
}
