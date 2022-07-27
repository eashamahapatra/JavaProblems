package JavaBasics;

import java.util.ArrayList;

public class ArrayListConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList ar= new ArrayList();
		ar.add(100);
		ar.add("TOM");
		System.out.println(ar.size());
		
		ar.add(12.33);
		ar.add('M');
		ar.add(true);
		
		
		System.out.println(ar.size());
		
		ar.remove(0);
		
		System.out.println(ar.size());
		
		System.out.println(ar.get(0));
		
		System.out.println(ar.get(3));
		
		System.out.println("Array list contains these - ");
		
		for (int i =0; i<ar.size();i++)
		{
			System.out.println(ar.get(i));
		}
		
		ArrayList<Integer> ar1=new ArrayList<Integer>();
		ar1.add(0);
		ar1.add(1);
		ar1.add(-1);
		
		System.out.println(ar1.indexOf(-1));
		
		ar1.set(0, 3);
		System.out.println(ar1.get(0));
		

	}

}
