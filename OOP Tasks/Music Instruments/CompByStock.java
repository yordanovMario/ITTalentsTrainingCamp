import java.util.Comparator;

public class CompByStock implements Comparator<MusicalInstrument>{

	@Override
	public int compare(MusicalInstrument o1, MusicalInstrument o2) {
		return o1.getStock() - o2.getStock();
	}

}
