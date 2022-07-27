package JavaBasics;

public class TwoDimArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String a[][]=new String[3][5];
		System.out.println(a.length);
		System.out.println(a[0].length);
		System.out.println("************");
		a[0][0]="a";
		a[0][1]="b";
		a[0][2]="c";
		a[0][3]="d";
		a[0][4]="e";
		
		a[1][0]="a1";
		a[1][1]="b1";
		a[1][2]="c1";
		a[1][3]="d1";
		a[1][4]="e1";
		
		a[2][0]="a2";
		a[2][1]="b2";
		a[2][2]="c2";
		a[2][3]="d2";
		a[2][4]="e2";
		
		for (int row=0;row<a.length;row++){
			System.out.println("row : "+row);
			for (int col=0;col<a[row].length;col++)
			{
				System.out.println(a[row][col]);
			}
			
		}
		
	}

}
