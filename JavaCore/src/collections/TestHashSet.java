package collections;

import java.util.HashSet;
import java.util.Set;

public class TestHashSet {
	public static void main(String[] args) {
		Person p1 = new Person("Thien", 12);
		Person p2 = new Person("Thien", 12);

		Set<Person> hs = new HashSet<>();

		hs.add(p1);
		hs.add(p2);

		for (Person p : hs) {
			System.out.println(p.toString());
		}

	}
}
