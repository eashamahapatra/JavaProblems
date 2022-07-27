package JavaProblems;

import org.apache.commons.lang3.StringUtils;

public class CountCharacterinString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "india is the best country";
		countchar(s, ' ');
		countchar(s, 'n');
		System.out.println("********countchar*********");
		countchararray(s, ' ');
		countchararray(s, 'i');
		System.out.println("********countchararray*********");
		countcharusingstream(s, " ");
		countcharusingstream(s, "t");
		System.out.println("********countcharusingstream*********");
		countcharApache(s, ' ');
		countcharApache(s, 's');
		System.out.println("********countcharApache*********");

	}

	public static void countchar(String s, char charvalue) {
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			Character c = s.charAt(i);
			if (c.equals(charvalue)) {

				count = count + 1;
			}
		}
		System.out.println(charvalue + " : " + count);
	}

	public static void countchararray(String s, char charvalue) {
		int count1 = 0;
		for (char ch : s.toCharArray()) {
			if (ch == charvalue) {
				count1 = count1 + 1;
			}

		}
		System.out.println(charvalue + " : " + count1);

	}

	public static void countcharusingstream(String s, String charvalue) {
		long count2 = s.chars().mapToObj(e -> String.valueOf((char) e))
				.filter(e -> e.equals(charvalue)).count();
		System.out.println(charvalue + " : " + count2);
	}

	public static void countcharApache(String s, char charvalue) {
		int count3 = StringUtils.countMatches(s, charvalue);
		System.out.println(charvalue + " : " + count3);
	}

}
