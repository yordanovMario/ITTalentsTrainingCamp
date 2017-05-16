

public class Udaren extends MusicalInstrument {
	
	enum Vid {BARABAN, TARAMBUKA, TYPAN, DAIRE};
	
	public Udaren(Vid group, String name, double price, int stock) {
		super(group + "", name, type.UDAREN, price, stock);
		// TODO Auto-generated constructor stub
	}

}
