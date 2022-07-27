package OOPConceptPart1;

public class LocalVsGlobalVariables {

	//class/global variables
	String name ="Tom";
	int age =25;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i=10;//local variables
		System.out.println(i);
		LocalVsGlobalVariables obj= new LocalVsGlobalVariables();
		System.out.println(obj.age);
		System.out.println(obj.name);
	}

	public void sum(){
		int i =10;//local variables
		int j =20;
		int age =25;
		
	}
	
	
}
