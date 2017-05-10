package notepad;

public interface INotepad {
	
	void addText(String text, int pageNumber);
	void overWriteText(String text, int pageNumber);
	void deleteText(int pageNumber);
	void viewAllPages();
	boolean searchWord(String word);
	void printAllPagesWithDigits();
	
}
