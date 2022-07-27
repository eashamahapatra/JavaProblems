package JavaProblems;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1 = "Hello";
		String s3 = "Easha";
		System.out.println(s1);
		String s2 = "";
		for (int i = s1.length()-1; i >= 0; i--) {
			s2 = s2 + s1.charAt(i);
			System.out.println(s2);

		}
		System.out.println(s2);

		StringBuffer sb = new StringBuffer(s3);
		sb = sb.reverse();
		System.out.println(sb);

	}

}
