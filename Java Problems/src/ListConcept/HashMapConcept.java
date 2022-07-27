package ListConcept;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<Integer, String> hm= new HashMap<Integer, String>();
		hm.put(1, "selenium");
		hm.put(2, "qtp");
		hm.put(3, "TestComplete");
		hm.put(4, "RFT");
		
		System.out.println(hm.get(1));
		System.out.println(hm.get(0));
		System.out.println(hm.size());
			
		for (Entry m : hm.entrySet()){
			System.out.println(m.getKey()+" "+m.getValue());
		}
		
		hm.remove(2);
		System.out.println(hm);
		
		
		Employee e1 = new Employee("TOM",29,'V');
		Employee e2 = new Employee("MIKE",22,'R');
		Employee e3 = new Employee("JOHN",23,'T');
		
		
		HashMap<Integer, Employee> emp = new HashMap<Integer, Employee>();
		emp.put(1, e1);
		emp.put(2, e2);
		emp.put(3, e3);
		
		for(Entry<Integer, Employee> m : emp.entrySet()){
			int key = m.getKey();
			Employee e = m.getValue();
			System.out.println(key+" "+e.name+" "+e.age+" "+e.dept);
			
		}
		
	}

}
