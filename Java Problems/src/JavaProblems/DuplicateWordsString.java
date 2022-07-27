package JavaProblems;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DuplicateWordsString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1 = "Hey java is java and is a good language";
		String s2 = "hello world world world hello";
		findDuplicate(s1);
		findDuplicate(s2);

	}

	public static void findDuplicate(String input) {
		String words[] = input.split(" ");
		Map<String, Integer> mp = new HashMap<String, Integer>();
		for (String word : words) {

			if (mp.containsKey(word)) {
				mp.put(word.toLowerCase(), mp.get(word) + 1);
			} else {
				mp.put(word, 1);
			}
		}
		System.out.println(mp);

		Set<String> entry = mp.keySet();
		for (String word : entry) {
			if (mp.get(word) > 1) {
				System.out.println(word + " : " + mp.get(word));
			}
		}
	}

}
