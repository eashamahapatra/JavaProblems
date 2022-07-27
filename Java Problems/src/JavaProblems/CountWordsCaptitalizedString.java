package JavaProblems;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CountWordsCaptitalizedString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = " thisNaveenAutomationLabsYoutube";
		
		System.out.println("****if lower case word in the beginning****");
		int c=0;
		if(Character.isLowerCase(s.trim().charAt(0))){
			c++;
		}
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') {
				c = c + 1;
			}

		}
		System.out.println(c);
		
		
		System.out.println("****char****");
		int count = 0;

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') {
				count = count + 1;
			}

		}

		System.out.println(count);

		System.out.println("****ascii number****");
		int count1 = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) >= 65 && s.charAt(i) <= 90) {
				count1 = count1 + 1;
			}

		}

		System.out.println(count1);

		System.out.println("****Character Class****");
		int count2 = 0;
		for (int i = 0; i < s.length(); i++) {
			if (Character.isUpperCase(s.charAt(i))) {
				count2 = count2 + 1;
			}

		}

		System.out.println(count2);

		System.out.println("****Streams****");
		long count3 = s.chars().filter(e -> e >= 65 && e <= 90).count();

		System.out.println(count3);

		System.out.println("****Streams****");
		long count4 = s.chars().filter(e -> Character.isUpperCase(e)).count();

		System.out.println(count4);

		System.out.println("****Regular Expression****");
		String reg = "[A-Z]+";
		Pattern pattern = Pattern.compile(reg);
		Matcher matcher = pattern.matcher(s);
		int count5 = 0;
		while(matcher.find()){
			count5+=matcher.group(0).length();
		}
		System.out.println(count5);

	}

}
