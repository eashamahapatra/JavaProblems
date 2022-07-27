package JavaProblems;

import java.util.function.IntPredicate;

public class CountVowelsinString {

	public static boolean isvowel(char t) {
		return t == 'a' || t == 'e' || t == 'i' || t == 'o' || t == 'u'
				|| t == 'A' || t == 'E' || t == 'I' || t == 'O' || t == 'U';

	}

	public static void enterinput1(String t) {
		IntPredicate vowel = new IntPredicate() {

			@Override
			public boolean test(int t) {
				return t == 'a' || t == 'e' || t == 'i' || t == 'o' || t == 'u'
						|| t == 'A' || t == 'E' || t == 'I' || t == 'O'
						|| t == 'U';

			}

		};
		long n = t.chars().filter(vowel).count();
		System.out.println(n);

	}

	public static void enterinput(String t) {
		int Vcount = 0;
		for (int i = 0; i < t.length(); i++) {
			if (isvowel(t.charAt(i))) {
				Vcount = Vcount + 1;
			}

		}

		System.out.println(Vcount);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("*******JAVA*******");
		enterinput("qwrty");
		enterinput("aeiou");
		enterinput("tree");
		enterinput("aEIou");
		System.out.println("*******JAVA 8 Streams*******");
		enterinput1("qwrty");
		enterinput1("aeiou");
		enterinput1("tree");
		enterinput1("aEIou");
	}

}
