package JavaProblems;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class DuplicateElementsArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1.compare -- worst soln. time - O(n*n)
		String names[] = { "C#", "java", "python", "java", "C", "C" };
		for (int i = 0; i <= names.length; i++) {
			for (int j = i + 1; j < names.length; j++) {
				if (names[i].equalsIgnoreCase(names[j])) {
					System.out.println("duplicate is : " + names[i]);
				}
			}
		}
		System.out.println("***********");
		// 2. hashset time - O(n)
		HashSet<String> hs = new HashSet<String>();
		for (String name : names) {
			if (hs.add(name) == false) {
				System.out.println(name + " is duplicate");
			}
		}

		System.out.println("*************");
		// 3. hashmap time - O(2n)
		Map<String, Integer> map = new HashMap<String, Integer>();
		for (String name : names) {
			Integer count = map.get(name);
			if (count == null) {
				map.put(name, 1);
			} else {
				map.put(name, ++count);
			}
		}
		Set<Entry<String, Integer>> set = map.entrySet();
		for(Entry<String, Integer> entry : set){
			if(entry.getValue()>1){
				System.out.println("duplicate : "+entry.getKey());
			}
		}

	}
}
