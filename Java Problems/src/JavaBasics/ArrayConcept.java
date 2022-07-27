package JavaBasics;

public class ArrayConcept {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1. int array:
		int i[] = new int[4];
		i[0] =10;
		i[1] =20;
		i[2] =30;
		i[3] =40;
		System.out.println(i[2]);
		//System.out.println(i[9]);//out of bound exception
		System.out.println(i.length);
		
		//print all values of array 
		for (int j=0; j<i.length;j++)
		{
			System.out.println(i[j]);
		}
	System.out.println("*******");
	    
	    //2. double array:
		double f[] ={1.8, 2.9, 3.6, 4.8, 5.9};
		for (int k=f.length-1;k>=0;k--)
		{
			System.out.println(f[k]);
		}
		
		//3. char array:
		char c[]={'a','b','c','&'};
		for (int l=0;l<c.length;l++)
		{
			System.out.print(c[l]+" ");
		}
		
		//4. boolean array:
		boolean b[]= new boolean[2];
		b[0]=true;
		b[1]=false;
		
		System.out.println("*********");
		//5. String array:
		String s[]=new String[3];
		s[0]="abc";
		s[1]="456";
		s[2]="#$%";
		System.out.println(s.length);
		
		System.out.println("*********");
		//5. Object array:
		Object o[] = new Object[6]; 
		o[0]= "TOM Hardy";
		o[1]= 29;
		o[2]= 4.11;
		o[3]= true;
		o[4]= 'M';
		o[5]=12/13/20;
		
		for(int y =0; y<o.length;y++)
		{
			System.out.println(o[y]);
		}
	}

}
