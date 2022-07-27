package ListConcept;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Set;

public class HashTableConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Hashtable ht = new Hashtable();
		ht.put(1, "String");
		ht.put(2, 100);
		ht.put(3, 'M');
		ht.put(4, true);
		//ht.put(null, null);//null pointer exception
		
		System.out.println("value : "+ht);
		
		Hashtable ht1 = (Hashtable) ht.clone();
		
		System.out.println(ht1);
		
		if (ht1.contains(100)){
			
			System.out.println("value is found");
		}
		else{
			System.out.println("not found");
		}
		
		System.out.println("*******");
		
		Enumeration e= ht1.elements();
		while(e.hasMoreElements()){
			System.out.println(e.nextElement());
			
		}
		
		Set s =  ht1.entrySet();
		 System.out.println(s);
		 
		 if (ht.equals(ht1)){
			 System.out.println("same hashtable");
		 }
		
		 System.out.println(ht.get(1));
		 
		 System.out.println(ht.hashCode());
		 
		 
		 Hashtable<Integer, Integer> ht3= new Hashtable<Integer, Integer>();
	}

}
