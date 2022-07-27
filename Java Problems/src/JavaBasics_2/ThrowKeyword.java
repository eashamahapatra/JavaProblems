package JavaBasics_2;

public class ThrowKeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("abc");
		
		try {
			throw new Exception("Naveen Exception");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("PQR");
	
		String flag="N";
		try{if (flag.equalsIgnoreCase("n"))
		{
			throw new Exception("exception found in site");
		}
		}catch(Throwable e){
			e.printStackTrace();
			System.out.println("complete");
		}		
	}
}
