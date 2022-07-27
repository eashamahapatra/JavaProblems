package JavaProblems;

import java.util.Arrays;
import java.util.OptionalDouble;

public class AverageArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num[] = { 1, 2, 3, 4, 5, 3, 2, 3, 4 , 5, 6, 9, 10
				};

		double total = 0;
		for (int e : num) {

			total += e;

		}
		System.out.println("****java****");
		System.out.println("total is : " + total);
		System.out.println("avg. is : " + (total / num.length));
		
		System.out.println("****java 8 streams****");
		OptionalDouble avg = Arrays.stream(num).average();
		System.out.println(avg.getAsDouble());
		

	}

}
