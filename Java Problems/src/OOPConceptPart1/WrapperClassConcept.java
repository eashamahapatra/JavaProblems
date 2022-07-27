package OOPConceptPart1;

public class WrapperClassConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s ="100";
		System.out.println(s+20);
		
		//Data convert string to interger
		System.out.println();
		System.out.println("Data convert string to interger");
		int i= Integer.parseInt(s);
		System.out.println(i+20);
		
		//Data convert string to Double
		System.out.println();
		System.out.println("Data convert string to double");
		double j=Double.parseDouble(s);
		System.out.println(22.334+j);
		
		//Data convert string to Boolean
		System.out.println();
		String k="false";
		System.out.println("Data convert string to boolean");
		boolean t= Boolean.parseBoolean(k);
		System.out.println(t);
		
		//Data convert integer to string
		System.out.println();
		int x=90;
		System.out.println("Data convert int to string");
		String y= String.valueOf(x);
		System.out.println(20+10+y+10);
		
		//number format exception as not pure number
		String u="aa22";
		System.out.println(Integer.parseInt(u));
		
		
	}

}
