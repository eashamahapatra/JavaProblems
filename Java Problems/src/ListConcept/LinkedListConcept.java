package ListConcept;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList<String> ll = new LinkedList<String>();

		ll.add("test");
		ll.add("selenium");
		ll.add("java");
		ll.add("JScript");

		System.out.println("contents in linkedList: " + ll);

		ll.addFirst("Maths");
		ll.addLast("English");

		System.out.println("contents in linkedList: " + ll);

		System.out.println(ll.get(4));

		ll.set(4, "Biology");
		System.out.println(ll);

		ll.removeFirst();
		ll.removeLast();
		System.out.println(ll);

		ll.remove(3);
		System.out.println(ll);

		// for loop
		for (int i = 0; i < ll.size(); i++) {
			System.out.println("for loop - " + ll.get(i));
		}

		System.out.println();

		for (String s : ll) {
			System.out.println("for each - " + s);
		}

		System.out.println();
		// iterator
		Iterator<String> it = ll.iterator();
		while (it.hasNext()) {
			System.out.println("iterator - " + it.next());
		}

		System.out.println();

		// while loop
		int j = 0;
		while (j < ll.size()) {
			System.out.println("while loop - " + ll.get(j));
			j++;
		}
		System.out.println();

		// create class object
		Employee e1 = new Employee("easha", 27, 'Q');
		Employee e2 = new Employee("TOM", 28, 'A');
		Employee e3 = new Employee("MIKE", 29, 'D');

		// create linkedList
		LinkedList<Employee> emp = new LinkedList<Employee>();

		emp.add(e1);
		emp.add(e2);
		emp.add(e3);

		// Iterate
		Iterator<Employee> it1 = emp.iterator();
		while (it1.hasNext()) {
			Employee e = it1.next();
			System.out.println("Employee Details: " + e.name + " " + e.age
					+ " " + e.dept);
		}

	}

}
