package JavaProblems;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("facorial of 3 : " + fact(3));
		System.out.println("facorial of 0 : " + fact(0));
		System.out.println("facorial of 1 : " + fact(1));
		System.out.println("facorial of 5 : " + fact(5));
		System.out.println("facorial of 5 : " + fact(2));
		System.out.println("******************");
		System.out.println("facorial of 3 : " + reccur(3));
		System.out.println("facorial of 0 : " + reccur(0));
		System.out.println("facorial of 1 : " + reccur(1));
		System.out.println("facorial of 5 : " + reccur(5));
		System.out.println("facorial of 5 : " + reccur(2));

	}

	public static int fact(int number) {
		int f = 1;
		if (number == 0) {
			return 1;
		}
		for (int n = number; n >= 2; n--) {
			f = f * n;
		}
		return f;
	}

	public static int reccur(int number) {
		if (number == 0) {
			return 1;
		}
		return number * reccur(number - 1);

	}

}
