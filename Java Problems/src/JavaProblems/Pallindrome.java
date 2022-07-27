package JavaProblems;

public class Pallindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		isPallindrome(121);
		isPallindrome(123);
		isPallindrome(1);
		isPallindrome(0);
		isPallindrome(-121);
		isPallindrome(-345);
		isPallindrome(333);

	}

	public static void isPallindrome(int number) {

		int temp = number;
		int rev = 0;
		while (number > 0) {
			rev = rev * 10 + number % 10;
			number = number / 10;
		}
		if (rev == temp) {
			System.out.println(temp + " is pallindrome");
		} else {
			System.out.println(temp + " is not pallindrome");
		}

	}

}
