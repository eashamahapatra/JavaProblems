package OOPConceptPart1;

public class MethodOverloading {

	//zero input parameter
	public void area(){
		System.out.println("area method, no parameter");
	}
	
	//one input parameter
	public double area(int r){
		double area = (3.14)*r*r;
		System.out.println("area of circle");
		return area;
	}
	
	//two input parameter
		public int area(int l, int b){
			int area=l*b;
			System.out.println("area of rectangle");
			return area ;
			
		}
		
		//two input parameter
				public double area(int l, double b){
					double area=0.5*l*b;
					System.out.println("area of triangle");
					return area ;
					
				}
				
				
				//one input parameter
				public double area(double l){
					double area=l*l;
					System.out.println("area of square");
					return area ;
					
				}
		
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MethodOverloading obj=new MethodOverloading();
		obj.area();
		System.out.println(obj.area(15));
		System.out.println(obj.area(2,5));
		System.out.println(obj.area(2,5.0));
		System.out.println(obj.area(2.0));
		
	}
	//main method can be overloaded
	public static void main(Object args){
		
		MethodOverloading obj=new MethodOverloading();
		obj.area();
		System.out.println(obj.area(15));
		System.out.println(obj.area(2,5));
		System.out.println(obj.area(2,5.0));
		System.out.println(obj.area(2.0));
		
	}

}
