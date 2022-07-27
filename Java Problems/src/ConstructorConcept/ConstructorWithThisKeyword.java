package ConstructorConcept;

public class ConstructorWithThisKeyword {

	String name;
	int age;
	
	public ConstructorWithThisKeyword(String name, int age){
		this.name=name;
		this.age=age;
		System.out.println(name+" "+age);
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ConstructorWithThisKeyword obj= new ConstructorWithThisKeyword("TOM", 27);
	}

}
