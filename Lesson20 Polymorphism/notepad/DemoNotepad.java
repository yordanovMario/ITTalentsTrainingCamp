package notepad;

public class DemoNotepad {

	public static void main(String[] args) {
		
		Page one = new Page("News", "The news today are1...");
		System.out.println(one.searchWord("today"));
		System.out.println(one.containsDigits());
		one.viewPage();
		
		ElectronicSecuredNotepad kindle = new ElectronicSecuredNotepad(10, "Mario93");
		kindle.start();
		kindle.addPage(new Page("Politics", "The politicians..."));
		kindle.addPage(new Page("Sport", "Grigor Dimitrov won 4..."));
		kindle.addPage(new Page("Weather", "The weather tomorrow..."));
		kindle.addPage(new Page("Health", "Sport and healthy food are 2..."));
		kindle.printAllPagesWithDigits();
		kindle.viewAllPages();
		kindle.deleteText(3);
		kindle.addText("It will be sunny with no chances of rain.", 3);
		kindle.overWriteText("Donald Trump will build a wall", 1);
		kindle.viewAllPages();
		
	}

}
