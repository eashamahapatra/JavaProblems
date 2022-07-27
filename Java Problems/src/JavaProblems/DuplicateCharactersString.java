package JavaProblems;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class DuplicateCharactersString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "java and selenium";
		duplicatechar(s);
		duplicatechar("tesla");
		duplicatechar("");
		duplicatechar(" ");
		duplicatechar(null);
		duplicatechar("1000");

	}

	public static void duplicatechar(String s) {

		if (s == null) {
			System.out.println("null string");
			return;
		}

		if (s.isEmpty()) {
			System.out.println("empty string");
			return;
		}

		if (s.length() == 1) {
			System.out.println("Single Char String");
		}

		char c[] = s.toCharArray();
		Map<Character, Integer> mp = new HashMap<Character, Integer>();
		for (Character cc : c) {
			if (mp.containsKey(cc)) {
				mp.put(cc, mp.get(cc) + 1);
			} else {
				mp.put(cc, 1);
			}
		}
		Set<Entry<Character, Integer>> entry = mp.entrySet();
		for (Entry<Character, Integer> e : entry) {
			if (e.getValue() > 1) {
				System.out.println(e.getKey() + " : " + e.getValue());
			}

		}
	}
}
