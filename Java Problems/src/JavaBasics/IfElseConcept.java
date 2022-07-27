package JavaBasics;

public class IfElseConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 10;
		int b = 20;
		
		if (a<b)
		{
			System.out.println("a is greater than b");
		}
		else 
		{
			System.out.println("b is greater than a");
		}
		//////////////////////////////////////////////////
		int c =40;
		int d= 40;
		if (c==d)
		System.out.println("equal");
		else
			System.out.println("not equal");
		
		int x = 50;
		int y = 70;
		int z = 30;
		
		if (x>y & x>z)
		{
			System.out.println("x is greatest");
		}
		else if (y>z)
		{
			System.out.println("y is greatest");
		}
		else
		{
			System.out.println("z is greatest");
		}
      	///////////////////////////////////////////////
		if (x>y)
		{
			if (x>z)
			{
				System.out.println("x is greatest");
			}
			else
			{
				System.out.println("z is greatest");
			}
		}
		else
		{
			System.out.println("y is greatest");
		}
		
	}

}
