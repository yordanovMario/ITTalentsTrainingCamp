package library;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.TreeSet;

import library.ReadingObject.IGroup;
import library.ReadingObject.ReadingType;

public class Library {

	//(reading type -> (IGroup -> treeset of reading objects))
	HashMap<ReadingType, HashMap<IGroup, TreeSet<ReadingObject>>> katalog;
	
	public Library() {
		this.katalog = new HashMap<ReadingType, HashMap<IGroup, TreeSet<ReadingObject>>>();
		
		this.katalog.put(ReadingType.BOOK, new HashMap<IGroup, TreeSet<ReadingObject>>());
		this.katalog.put(ReadingType.MAGAZINE, new HashMap<IGroup, TreeSet<ReadingObject>>());
		this.katalog.put(ReadingType.TEXTBOOK, new HashMap<IGroup, TreeSet<ReadingObject>>());
	}

	public void addReadingObject(ReadingObject r) {
		//ReadingType type = reading.type;//book, magazine or textbook
		//IGroup group = reading.group;//genre, category or theme
		
		if(!this.katalog.get(r.type).containsKey(r.group)){
			this.katalog.get(r.type).put(r.group, new TreeSet<ReadingObject>());
		}
		
		this.katalog.get(r.type).get(r.group).add(r);
	}

	@Override
	public String toString() {
		for (Entry<ReadingType, HashMap<IGroup, TreeSet<ReadingObject>>> e : katalog.entrySet()) {
			System.out.println(e.getKey() + ": ");
			for (Entry<IGroup, TreeSet<ReadingObject>> e1 : e.getValue().entrySet()) {
				System.out.println("    " + e1.getKey() + ": ");
				for (ReadingObject r : e1.getValue()) {
					System.out.println("    " + r);
				}
			}
		}
		return "";
	}

	
	
	
}
