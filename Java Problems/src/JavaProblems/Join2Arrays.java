package JavaProblems;

import java.util.Arrays;
import java.util.stream.Stream;

public class Join2Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] s1 = { "Rohit", "Virat", "Dhawan", "Shreyash", "Risabh",
				"Shubhman" };
		String[] s2 = { "Hardik", "Bhuvi", "Dhawan", "Bumrah", "Chahal",
				"Jaddu" };
		Stream<String> s3 = Arrays.stream(s1);
		Stream<String> s4 = Arrays.stream(s2);

		String[] s5 = Stream.concat(s3, s4).toArray(size -> new String[size]);

		for (String s : s5) {
			System.out.println(s);

		}

	}

}
