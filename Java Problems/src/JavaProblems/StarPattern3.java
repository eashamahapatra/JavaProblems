package JavaProblems;

public class StarPattern3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//A=65, Z= 90
		//a=97, z= 122
		/*
A 
A B 
A B C 
A B C D 
A B C D E 
A B C D E F 
		 */
		
		
		int alpha = 97;
		for (int i = 0; i <= 5; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print((char) (alpha + j) + " ");
			}
			System.out.println();
		}
		System.out.println("---------------------");
		/*
A 
B B 
C C C
D D D D 
E E E E E  
F F F F F F 
		 */
		
		
		int alpha1 = 65;
		for (int i = 0; i <= 5; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print((char) (alpha1) + " ");
			}
			alpha1++;
			System.out.println();
		}

	}
}
