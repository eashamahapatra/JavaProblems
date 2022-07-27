package ConstructorConcept;

public class ConstructorConcept {

	
	public ConstructorConcept(){
		System.out.println("Default Constructor");
	}
		
	
	public ConstructorConcept(int i){
		System.out.println("Parameterized Constructor");
		System.out.println("the value of i "+i);
	}
	
	public ConstructorConcept(int i, int j){
		System.out.println("two Param Constructor");
		System.out.println("the value of i "+i);
		System.out.println("the value of j "+j);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ConstructorConcept obj= new ConstructorConcept();
		ConstructorConcept obj1= new ConstructorConcept(10);
		ConstructorConcept obj2 = new ConstructorConcept(10,20);
		
	}

}
