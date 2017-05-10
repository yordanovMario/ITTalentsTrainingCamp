package treesAndComparators;

import java.util.Comparator;

public class DuskiComparatorPoVisochina implements Comparator<Board> {

	@Override
	public int compare(Board d1, Board d2) {
		return d1.getHeight() - d2.getHeight();
	}

}
