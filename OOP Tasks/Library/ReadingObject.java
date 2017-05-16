package library;


public abstract class ReadingObject {

	public interface IGroup { }
	enum ReadingType {BOOK, MAGAZINE, TEXTBOOK};
	
	protected IGroup group;
	protected ReadingType type;
	protected String name;
	protected String publisher;
	

	public ReadingObject(IGroup group, ReadingType type, String name, String publisher) {
		this.group = group;
		this.type = type;
		this.name = name;
		this.publisher = publisher;
	}
	
	public ReadingType getType() {
		return type;
	}
	
	public IGroup getGroup() {
		return group;
	}

	@Override
	public String toString() {
		return "ReadingObject ["+"type = " + type + ", group = " + group + ", name=" + name + ", publisher=" + publisher + "]";
	}
	
	
	
}
