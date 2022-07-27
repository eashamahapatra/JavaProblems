package JavaProblems;

public class RemoveJunk {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1 = "H 4 7 .. $^( JKL * ( ) || ~a b n ` F U S L 8 5 , 6 ";

		// Regular Expression - [a-zA-Z0-9]

		System.out.println(s1);

		String s2 = s1.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(s2);

		String s3 = s1.replaceAll("[^a-zA-Z]", "");
		System.out.println(s3);

		String s4 = s1.replaceAll("[^0-9]", "");
		System.out.println(s4);

	}

}
