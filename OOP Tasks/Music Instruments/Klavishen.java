
public class Klavishen extends MusicalInstrument {
	
	enum Vid {ORGAN, PIANO, AKORDEON};
	
	public Klavishen(Vid group, String name, double price, int stock) {
		super(group + "", name, type.KLAVISHEN, price, stock);
		// TODO Auto-generated constructor stub
	}

}
