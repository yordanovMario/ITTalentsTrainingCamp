package library;

import java.time.LocalDate;

public class Magazine extends ReadingObject implements Comparable<Magazine>{
	
	enum Category implements IGroup {NATURE, HISTORY, LIFESTYLE, GOSSIP};
	private int number;
	private LocalDate issueDate;

	public Magazine(Category group, String name, String publisher, int number, LocalDate issueDate) {
		super(group, ReadingType.MAGAZINE, name, publisher);
		this.number = number;
		this.issueDate = issueDate;
	}

	@Override
	public int compareTo(Magazine o) {
		if(this.name.compareTo(o.name) == 0){
			return this.number - o.number;
		}
		return this.name.compareTo(o.name);
	}
}
