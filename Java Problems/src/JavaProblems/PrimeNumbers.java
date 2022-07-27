package JavaProblems;

public class PrimeNumbers {

	public static void getPrime(int num) {
		for (int i = 2; i <= num; i++) {
			if (isPrime(i))
				System.out.print(i + " ");
		}

	}

	public static boolean isPrime(int number) {
		if (number <= 1) {
			return false;
		}
		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				return false;
			}
		}
		return true;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("30 prime number : " + isPrime(30));
		System.out.println("-2 prime number : " + isPrime(-2));
		System.out.println("2 prime number : " + isPrime(2));
		System.out.println("1 prime number : " + isPrime(1));
		System.out.println("17 prime number : " + isPrime(17));
		System.out.println("0 prime number : " + isPrime(0));
		System.out.println("5 prime number : " + isPrime(5));
		getPrime(20);
		System.out.println();
		getPrime(10);
		System.out.println();
		getPrime(30);

	}

}
