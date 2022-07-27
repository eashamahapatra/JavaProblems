package OOPConceptPart2;

public class TestCar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BMW b=new BMW();//child object
		
		System.out.println("inheritance method overriding");
		b.start();
		
		System.out.println("inherited methods");
		b.stop();
		b.refuel();
		
		System.out.println("calling a child method by its object");
		b.theftSafety();
		
		System.out.println("calling a grandparent method by child object");
		b.engine();
		
		Car c= new Car();
		System.out.println("calling a parent method by its object");
		c.start();
		c.stop();
		c.refuel();
		
		System.out.println("top casting");
		Car c1=new BMW();
		c1.start();
		c1.stop();
		c1.refuel();
		
		BMW b1=(BMW)new Car();
		b1.start();
		b1.stop();
		b1.refuel();
		b1.theftSafety();
		
	}

}
