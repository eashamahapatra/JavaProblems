package OOPConceptPart1;

public class FunctionsInJava {

	//non static methods
	
	//return type void
	public void test(){
		System.out.println("no input no output");
	}
	
	//return type int. no ip some op
	public int pqr(){
		int a =10;
		int b=20;
		int c=a+b;
		return c;
	}
	
	//no ip some op
	public String qa()
	{
		String s="no ip some op";
		return s;
	}
	
	//some ip some op
	public int division(int x, int y){
		
		System.out.println("some ip some op");
		int d=x/y;
		return d;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		FunctionsInJava ob = new FunctionsInJava();
		//ob is the reference variable
		//after creating the ob , the copy of non static methods will be given
		ob.test();
		int l=ob.pqr();
		System.out.println(l);
		String d =ob.qa();
		System.out.println(d);
		int g =ob.division(10, 5);
		System.out.println(g);
		
	}

}
