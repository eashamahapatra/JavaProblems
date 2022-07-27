package JavaBasics_2;

public class ExceptionHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {int i =9/0;
		System.out.println(i);
		}
		
		catch(Exception e){
			System.out.println(e);
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
		
		finally{
			System.out.println("complete");
		}
		  
		
	}

}
