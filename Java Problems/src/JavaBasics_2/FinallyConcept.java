package JavaBasics_2;

public class FinallyConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		test1();
		System.out.println();
		test2();
		System.out.println();
		array();
	}
	
	public static void test1(){
		try{
			System.out.println("inside test1 method");
		throw new RuntimeException("test");
		}catch(Exception e){
			e.printStackTrace();
			System.out.println("inside catch block");
			
		}

		finally{
			System.out.println("inside finally block");
		}
	}
	
		public static void test2(){
			try{
			System.out.println("method with no exception");
			}
			
			finally{
				System.out.println("inside finally block");
			}
			}
		
		public static void array(){
			try{
				System.out.println("inside try block");
				int ar[]=new int[3]; 
				ar[0]=10;
				ar[1]=3;
				ar[3]=4;
				for(int i=0;i<ar.length;i++){
					System.out.println(ar[i]);
					
				}
				
				}
				catch(ArithmeticException e){
					
					System.out.println("exception handled: "+e);
					
				}
			finally{
				System.out.println("finally executed even after being handled");
			}
			}
			
			
		
	}