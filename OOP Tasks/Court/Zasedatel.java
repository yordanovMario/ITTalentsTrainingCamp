import java.util.Random;

public class Zasedatel extends Iurist {

	public Zasedatel(String name, int staj, int broiDela) {
		super(name, "������� ���������", staj, broiDela);
		// TODO Auto-generated constructor stub
	}
	
	public boolean vzemaneNaReshenie(){
		boolean reshenie = new Random().nextBoolean();
		return reshenie;
	}
}
