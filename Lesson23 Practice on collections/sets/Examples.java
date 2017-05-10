package sets;

import java.util.ArrayList;
import java.util.HashSet;

public class Examples {

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<>();
		list.add("ana");
		list.add("bojo");
		list.add("ceco");
		list.add("didi");
		list.add("emo");
		System.out.println(list);
		
		HashSet<Person> set = new HashSet<>();
		set.add(new Person("ana"));
		set.add(new Person("bojo"));
		set.add(new Person("ceco"));
		set.add(new Person("didi"));
		set.add(new Person("emo"));
		set.add(new Person("ana"));
		set.add(new Person("bojo"));
		System.out.println(set);

	}

}
