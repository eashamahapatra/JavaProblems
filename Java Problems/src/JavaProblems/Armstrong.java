package JavaProblems;

public class Armstrong {

	public static void isArmstrong(int number) {

		int temp = number;
		int sum = 0;
		int rev;

		while (number > 0) {
			rev = number % 10;
			sum = sum + rev * rev * rev;
			number = number / 10;
		}
		if (temp == sum) {
			System.out.println(temp + " is armstrong");
		} else {
			System.out.println(temp + " is not armstrong");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		isArmstrong(0);
		isArmstrong(1);
		isArmstrong(153);
		isArmstrong(154);
		isArmstrong(407);
		isArmstrong(-153);
		isArmstrong(-0);

	}
}
