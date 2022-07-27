package AbstractionConcept;

public interface Car {
	
	int wheels = 4;//final considered by interface automatically
	static String colour = "black";
	
	public void start();
	
	public void stop();
	
	public void refuel();
	
	

}
