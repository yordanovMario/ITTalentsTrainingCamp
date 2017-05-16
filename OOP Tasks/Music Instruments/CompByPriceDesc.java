import java.util.Comparator;

public class CompByPriceDesc implements Comparator<MusicalInstrument>{

	@Override
	public int compare(MusicalInstrument o1, MusicalInstrument o2) {
		double razlika = o1.getPrice() - o2.getPrice();
		if(razlika > 0){
			return -1;
		}
		else{
			if(razlika == 0){
				return 0;
			}
			else{
				return 1;
			}
		}
	}

}
