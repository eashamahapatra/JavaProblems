package JavaProblems;

public class StringContainsDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("is 0 numberic: " + isDigit("0"));
		System.out.println("is -123 numberic: " + isDigit("-123"));
		System.out.println("is 123 numberic: " + isDigit("123"));
		System.out.println("is abc123 numberic: " + isDigit("abc123"));
		System.out.println("is 123abc numberic: " + isDigit("123abc"));
		System.out.println("is abc numberic: " + isDigit("abc"));
		System.out.println("is !@#abc123 numberic: " + isDigit("!@#abc123"));
		System.out.println("is !@#asd numberic: " + isDigit("!@#asd"));
		System.out.println("is blank numberic: " + isDigit(""));
		System.out.println("is null numberic: " + isDigit(null));
		System.out.println("is space numberic: " + isDigit(" "));
		System.out.println("is 2.3 numberic: " + isDigit("2.3"));
		System.out.println("is \u0967 numberic: " + isDigit("\u0967"));

	}

	public static boolean isEmpty(String cs) {
		return cs == null || cs.length() == 0;
	}

	public static boolean isDigit(String input) {

		if (isEmpty(input)) {
			return false;
		}

		for (int i = 0; i < input.length(); i++) {
			if (!Character.isDigit(input.charAt(i))) {
				return false;
			}

		}
		return true;
	}

}
