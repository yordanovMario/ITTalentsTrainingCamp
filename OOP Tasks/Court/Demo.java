import java.util.HashSet;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Court vtyrnovo = new Court("Окръжен съд Велико Търново", "Велико Търново");
		Advokat advokat = new Advokat("Пенчо Панков", 15);
		Advokat advokat2 = new Advokat("Пейо пощальона", 25);
		Prokuror prokuror = new Prokuror("Гринго Грънчаров", 50);
		Sydiq sydiq = new Sydiq("Господин Господинов", 60);
		Obvinqem obvinqem = new Obvinqem("Пешо", "Пешов", "Пешевски", "Калипетрово", 22);
		Obvinitel obvinitel = new Obvinitel("Гошо", "Гошов", "Гошовски", "Койнаре", 50);
		Svidetel pesho = new Svidetel("pesho1", "pesho1", "pesho1", "tyrnovo", 22);
		Svidetel pesho1 = new Svidetel("pesho2", "pesho2", "pesho2", "tyrnovo", 22);
		Svidetel pesho2 = new Svidetel("pesho3", "pesho1", "pesho1", "tyrnovo", 22);
		Svidetel pesho3 = new Svidetel("pesho4", "pesho1", "pesho1", "tyrnovo", 22);
		Svidetel pesho4 = new Svidetel("pesho5", "pesho1", "pesho1", "tyrnovo", 22);
		HashSet<Svidetel> svideteli = new HashSet<Svidetel>();
		obvinqem.addAdvokat(advokat);
		obvinitel.addAdvokat(advokat2);
		Delo delo1 = new Delo(sydiq, obvinqem, obvinitel, svideteli);
		delo1.provejdane();
		delo1.printHrono();
		System.out.println("==============");
		Delo delo2 = new Delo(sydiq, obvinqem, prokuror, svideteli);
		delo2.provejdane();
		delo2.printHrono();
	}

}
