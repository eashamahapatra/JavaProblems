package JavaProblems;

public class MissingNumberArray1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = { 1, 2, 3, 4, 5, 7, 8, 9, 10 };

		System.out.println(missing(a, 10));

	}

	public static int missing(int a[], int n) {
		int expectedSum = (n * (n + 1)) / 2;
		int actualSum = 0;
		for (int i : a) {
			actualSum += i;
		}
		return expectedSum - actualSum;

	}
}
