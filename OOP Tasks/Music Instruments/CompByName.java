import java.util.Comparator;

public class CompByName implements Comparator<MusicalInstrument>{

	@Override
	public int compare(MusicalInstrument m1, MusicalInstrument m2) {
		return m1.getName().compareTo(m2.getName());
	}

}
