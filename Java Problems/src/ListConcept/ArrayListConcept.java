package ListConcept;

import java.util.ArrayList;
import java.util.Iterator;


public class ArrayListConcept {

	public static <E> void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]=new int[3];
		
		//System.out.println(a[3]=10);
		
		ArrayList ar=new ArrayList();
		ar.add(4);
		ar.add(true);
		ar.add("xcv");
		
		System.out.println(ar.size());
		
		System.out.println(ar.get(2));
		
		for(int i=0; i<ar.size();i++){
			System.out.println(ar.get(i));
		}
		
		ArrayList<Integer> ar1=new ArrayList<Integer>();
		ar1.add(10);
		ar1.add(2);
		
		ArrayList<String> ar2=new ArrayList<String>();
		
		ArrayList<E> ar3=new ArrayList<E>();//when you don't know what you are going to add
		
		//Employee class Objects:
		Employee e1=new Employee("easha",27,'Q');
		Employee e2=new Employee("TOM",28,'A');
		Employee e3=new Employee("MIKE",29,'D');
		
		//create arraylist:
		ArrayList<Employee> ar4=new ArrayList<Employee>();
		ar4.add(e1);
		ar4.add(e2);
		ar4.add(e3);
		
		//Iterator to traverse the values:
		Iterator<Employee> it = ar4.iterator();
		while(it.hasNext()){
			Employee emp =it.next();
			System.out.println("Employee Details : "+emp.name+" "+emp.age+" "+emp.dept);
			
		}
		
		ArrayList ar5= new ArrayList();
		ar5.add(1);
		ar5.add("rrr");
		ar5.add(true);
		
		ArrayList ar6= new ArrayList();
		ar6.add('*');
		ar6.add(12.33);
		ar6.add(false);
		
		
		ar5.addAll(ar6);
		System.out.println("****************");
		for(int i = 0;i<ar5.size();i++){
			System.out.println(ar5.get(i));
		}
		System.out.println("****************");
		ar5.removeAll(ar6);
		for(int j=0;j<ar5.size();j++){
		System.out.println(ar5.get(j));
		}
		
		System.out.println("****************");
		ArrayList ar7= new ArrayList();
		ar7.add(1);
		ar7.add("rrr");
		ar7.add(true);
		
		ArrayList ar8= new ArrayList();
		ar8.add('*');
		ar8.add(12.33);
		ar8.add(false);
		ar8.add(true);
		
		ar7.retainAll(ar8);
		for(int k=0;k<ar7.size();k++){
			System.out.println(ar7.get(k));
		
		}
	
	}

}
