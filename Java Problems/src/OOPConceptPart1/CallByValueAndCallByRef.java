package OOPConceptPart1;

public class CallByValueAndCallByRef {
	
	int p=50;
	int q=60;
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CallByValueAndCallByRef obj= new CallByValueAndCallByRef();
		
		int x=10;
		int y=20;
		int sum= obj.testSum(x,y);
		System.out.println(sum);
		
		obj.p=80;
		obj.q=90;
		System.out.println("value of p = "+obj.p);
		System.out.println("value of q = "+obj.q);
		System.out.println("after swap");
		obj.swap(obj);
		System.out.println("value of p = "+obj.p);
		System.out.println("value of q = "+obj.q);
	}
	
	
	public int testSum(int a,int b){
		
		a=30;
		b=40;
		
		int c=a+b ;
		return c;
	}
	
	public void swap(CallByValueAndCallByRef t){
		int temp;
		temp=t.p;
		t.p=t.q;
		t.q=temp;
		
	}

}
