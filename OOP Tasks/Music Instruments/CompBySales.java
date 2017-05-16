import java.util.Comparator;

public class CompBySales implements Comparator<MusicalInstrument>{

	@Override
	public int compare(MusicalInstrument o1, MusicalInstrument o2) {
		return o2.getSelled() - o1.getSelled();
	}

}
