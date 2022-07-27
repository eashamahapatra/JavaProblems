package JavaBasics;

public class IncrementAndDecrementOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//post increment - first assign then increase
		int i =1;
		int j =i++;
		System.out.println(i);
		System.out.println(j);
		
		System.out.println("********");
		
		//pre increment - increase and then assign
		
		int a = 1;
		int b = ++a;
		
		System.out.println(a);
		System.out.println(b);
		
		//post decrement - first assign then decrease
		
		System.out.println("*******");
		int m = 2;
		int n = m--;
		System.out.println(m);
		System.out.println(n);
		
		//pre decrement - decrease and then assign
		
		System.out.println("*******");
		int x = 2;
		int y = --x;
		System.out.println(x);
		System.out.println(y);
		
	}

}
