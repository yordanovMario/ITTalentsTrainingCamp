package treesAndComparators;

import java.util.Comparator;

public class DuskiComparatorPoDebelina implements Comparator<Board> {

	@Override
	public int compare(Board o1, Board o2) {
		return o1.getThickness() - o2.getThickness();
	}

}
