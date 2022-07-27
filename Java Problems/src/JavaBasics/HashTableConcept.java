package JavaBasics;

import java.util.Hashtable;

public class HashTableConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Hashtable h= new Hashtable();
		
		h.put("a", "TOM");
		h.put(1, 100);
		h.put('%', '&');
		h.put(true, false);
		h.put(12.22, 13.55);
		
		System.out.println(h.isEmpty());
		System.out.println(h.size());
		System.out.println(h.get('%'));
		
		System.out.println();
		Hashtable<Integer, String>	h1=new Hashtable<Integer,String>();	
		h1.put(1, "qwerty");
		h1.put(10, "k");
		System.out.println(h1.get(1));
		System.out.println(h1.get(10));
		
		h1.put(1, "abc");//replace
		h1.replace(10, "pp");
		System.out.println(h1.get(1));
		System.out.println(h1.get(10));
		
		System.out.println(h1.containsKey(2));
		System.out.println(h1.keySet());
		System.out.println(h1.values());
		
		
		
		
	}

}
