package AbstractionConcept;

public class TestCar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BMW obj = new BMW();
		obj.start();
		obj.stop();
		obj.refuel();
		obj.theftSafety();
		
		System.out.println(obj.wheels);
		System.out.println(obj.colour);
		System.out.println();
		
		Car obj1 = new BMW();
		System.out.println(obj1.colour);
		System.out.println(obj1.wheels);
		
		obj1.start();
		obj1.stop();
		obj1.refuel();
		
	}

}
