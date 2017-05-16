import java.util.ArrayList;

public class Court {

	private String name;
	private String address;
	private ArrayList<Iurist> iuristi;
	private ArrayList<Delo> dela;
	
	public Court(String name, String address) {
		this.name = name;
		this.address = address;
		this.iuristi = new ArrayList<Iurist>();
		this.dela = new ArrayList<Delo>();
	}
	
}
