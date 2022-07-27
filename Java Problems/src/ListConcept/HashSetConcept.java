package ListConcept;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set<String> hs = new HashSet<String>();
		hs.add("abc");
		hs.add("test");
		hs.add("xyz");
		hs.add("selenium");
		hs.add("xyz");

		Iterator<String> it = hs.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println();
		for (String letters : hs) {
			System.out.println(letters);
		}
		System.out.println();
		System.out.println(hs.contains("xyz"));
		System.out.println();
		hs.remove("xyz");
		for (String letters : hs) {
			System.out.println(letters);
		}
		System.out.println();
		Set<Integer> s1 = new HashSet<Integer>();
		s1.addAll(Arrays.asList(new Integer[] { 1, 3, 5, 6, 7, 9 }));

		Set<Integer> s2 = new HashSet<Integer>();
		s2.addAll(Arrays.asList(new Integer[] { 2, 4, 6, 0, 10, 8 }));

		Set<Integer> union = new HashSet<Integer>(s1);
		union.addAll(s2);
		System.out.println(union);
		System.out.println();

		Set<Integer> intersect = new HashSet<Integer>(s1);
		intersect.retainAll(s2);
		System.out.println(intersect);
		System.out.println();

		Set<Integer> minus = new HashSet<Integer>(s1);
		minus.removeAll(s2);
		System.out.println(minus);
		System.out.println();

	}

}
