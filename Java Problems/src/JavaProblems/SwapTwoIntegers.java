package JavaProblems;

public class SwapTwoIntegers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.println("*****using temp*****");

		int c = 4;
		int d = 5;
		int temp;

		
		System.out.println(c + " beforeswap " + d);

		temp = c;
		c = d;
		d = temp;

		System.out.println(c + " afterswap " + d);

		System.out.println("*****using add sub*****");
		int x = 9;
		int y = 6;
		System.out.println(x + " beforeswap " + y);
		x = x + y;
		y = x - y;
		x = x - y;
		System.out.println(x + " afterswap " + y);
		System.out.println("*****using mul div*****");
		int a = 10;
		int b = 5;
		System.out.println(a + " beforeswap " + b);
		a = a * b;
		b = a / b;
		a = a / b;

		System.out.println(a + " afterswap " + b);
		System.out.println("*****using XOR operation*****");

		int m = 2;
		int n = 3;
		System.out.println(m + " beforeswap " + n);
		m = m ^ n;
		n = m ^ n;
		m = m ^ n;
		System.out.println(m + " afterswap " + n);

	}

}
