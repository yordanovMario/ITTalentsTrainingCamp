package notepad;

public class SimpleNotepad implements INotepad{
	
	private Page[] pages;
	private int maxPages;
	private int currentPage;
	
	public SimpleNotepad(int maxPages) {
		if(maxPages > 0 && maxPages <= 100){
			this.maxPages = maxPages;
		}
		this.currentPage = 0;
		this.pages = new Page[this.maxPages];
	}
	
	void addPage(Page page){
		if(this.currentPage+1 >= this.maxPages){
			return;
		}
		this.pages[this.currentPage++] = page;
	}
	
	@Override
	public void addText(String text, int pageNumber) {
		if(pageNumber >= 1 && pageNumber <= this.pages.length){
			this.pages[pageNumber-1].addText(text);
		}
	}

	@Override
	public void overWriteText(String text, int pageNumber) {
		if(pageNumber > 0 && pageNumber <= this.maxPages){
			this.pages[pageNumber-1].deleteText();
			this.pages[pageNumber-1].addText(text);
		}
	}

	@Override
	public void deleteText(int pageNumber) {
		if(pageNumber > 0 && pageNumber <= this.maxPages){
			this.pages[pageNumber-1].deleteText();
		}
	}

	@Override
	public void viewAllPages() {
		for (int i = 0; i < pages.length; i++) {
			if(this.pages[i] != null){
				this.pages[i].viewPage();
			}
		}
	}

	@Override
	public boolean searchWord(String word) {
		boolean contains = false;
		for (int i = 0; i < pages.length; i++) {
			if(this.pages[i] != null){
				if(this.pages[i].searchWord(word)){
					contains = true;
					break;
				}
			}
		}
		return contains;
		
	}

	@Override
	public void printAllPagesWithDigits() {
		for (int i = 0; i < pages.length; i++) {
			if(this.pages[i] != null){
				if(this.pages[i].containsDigits()){
					this.pages[i].viewPage();
				}
			}
		}
		
	}
	
}
