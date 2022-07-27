package OOPConceptPart1;

public class StaticAndNonStaticConcept {

	String name = "Tom";// nonstatic variable
	static int age = 25;// static variable

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StaticAndNonStaticConcept obj = new StaticAndNonStaticConcept();

		System.out.println("non static calling");
		System.out.println(obj.name);
		obj.sendMail();

		System.out.println();

		System.out.println("ClassName calling");
		int Age = StaticAndNonStaticConcept.age;
		System.out.println(Age);
		StaticAndNonStaticConcept.sum();

		System.out.println();

		System.out.println("Direct calling");
		sum();
		System.out.println(age);

		System.out.println();

		System.out.println("static method called by object");
		obj.sum();
		System.out.println(obj.age);
	}

	public void sendMail() {
		System.out.println("non static method");
	}

	public static void sum() {
		System.out.println("static method");
	}
}
