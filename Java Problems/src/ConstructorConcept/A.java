package ConstructorConcept;

public class A {
	
	public A(){
		System.out.println("parent class constructor");
	}
	
	public A(int i){
		System.out.println("parent "+i);
	}
	
	public A(int i, int j){
		System.out.println("parent "+i+" "+j);
	}

}
