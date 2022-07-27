package ConstructorConcept;

public class B extends A {

	public B() {
		super(20, 30);
		System.out.println("child class constructor");
	}

	public B(int i) {
		super(40);
		System.out.println("Child: " + i);

	}

	public B(int i, int j) {
		super();
		System.out.println("child2: " + i + " " + j);
	}

	public static void main(String[] args) {
		B obj = new B();
		B obj1 = new B(10);
		B obj2 = new B(60, 50);
	}

}
