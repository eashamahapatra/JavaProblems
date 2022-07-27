package JavaProblems;

public class ReverseInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x = 123;
		int rev=0;
		
		System.out.println(x);
		
		while(x>0)
		{
		rev= rev*10+x%10;
		x=x/10;
		}
		
		System.out.println(rev);
		
		long y = 23456789;		
		String s1 = String.valueOf(y);
		System.out.println(s1);
		StringBuffer sb = new StringBuffer(s1);
		System.out.println(sb.reverse());
		
		
	}

}
