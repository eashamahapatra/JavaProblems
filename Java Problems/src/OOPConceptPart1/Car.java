package OOPConceptPart1;

public class Car {
	
	//Class variables:
	int mod;
	int wheel;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car a = new Car();
		Car b = new Car();
		Car c = new Car();
		
		a.mod=2015;
		a.wheel=4;
		
		b.mod=2016;
		b.wheel=4;
		
		c.mod=2013;
		c.wheel=4;
		
		//Before assignment 
		System.out.println("Car properties with A model: "+a.mod+" "+a.wheel);
		System.out.println("Car properties with B model: "+b.mod+" "+b.wheel);
		System.out.println("Car properties with C model: "+c.mod+" "+c.wheel);
		
		//After assignment 
		System.out.println();
		a=b;
		b=c;
		c=a;
		
		System.out.println("Car properties with A model: "+a.mod+" "+a.wheel);
		System.out.println("Car properties with B model: "+b.mod+" "+b.wheel);
		System.out.println("Car properties with C model: "+c.mod+" "+c.wheel);
				
	}

}
