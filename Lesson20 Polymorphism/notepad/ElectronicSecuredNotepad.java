package notepad;

public class ElectronicSecuredNotepad extends SecuredNotepad implements IElectronicDevice{

	private boolean isStarted;
	
	public ElectronicSecuredNotepad(int maxPages, String password) {
		super(maxPages, password);
		this.isStarted = false;
	}

	@Override
	public void start() {
		this.isStarted = true;
	}

	@Override
	public void stop() {
		this.isStarted = false;
	}

	@Override
	public boolean isStarted() {
		return this.isStarted;
	}
	
	@Override
	public void addText(String text, int pageNumber) {
		if(this.isStarted){
			super.addText(text, pageNumber);
		}
	}
	
	@Override
	public void deleteText(int pageNumber) {
		if(this.isStarted){
			super.deleteText(pageNumber);
		}
	}
	
	@Override
	public void overWriteText(String text, int pageNumber) {
		if(this.isStarted){
			super.overWriteText(text, pageNumber);
		}
	}
	
	@Override
	public void viewAllPages() {
		if(this.isStarted){
			super.viewAllPages();
		}
	}
	
	@Override
	void addPage(Page page) {
		if(this.isStarted){
			super.addPage(page);
		}
	}

}
