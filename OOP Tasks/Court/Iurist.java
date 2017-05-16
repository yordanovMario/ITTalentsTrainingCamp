
public abstract class Iurist {
	
	private String name;
	private String dlyjnost;
	private int staj;
	private int broiDela;
	public static int counterNaVyprosi = 0;
	
	public Iurist(String name, String dlyjnost, int staj, int broiDela) {
		this.name = name;
		this.dlyjnost = dlyjnost;
		this.staj = staj;
		this.broiDela = broiDela;
	}
	
	public String zadaiVypros(Grajdanin nqkoisi){
		counterNaVyprosi++;
		return ("Задаване на въпрос номер " + counterNaVyprosi);
	}
	
	public void zapishiSi(String text){
		
	}
	
	public void uchastieVDelo(){
		this.broiDela++;
	}

	public String getName() {
		return name;
	}
	
	
	
}
