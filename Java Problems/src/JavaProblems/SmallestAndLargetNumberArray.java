package JavaProblems;

import java.util.Arrays;

public class SmallestAndLargetNumberArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = { -1, 199, -33, 0, 33, 100, 200, -200, 0, -199 };
		int max = a[0];
		int min = a[0];
		for (int i = 1; i < a.length; i++) {

			if (a[i] > max) {
				max = a[i];

			} else if (a[i] < min) {
				min = a[i];
			}

		}
		System.out.println("given number : " + Arrays.toString(a));
		System.out.println("maximum number : " + max);
		System.out.println("minimum number : " + min);
	}

}
