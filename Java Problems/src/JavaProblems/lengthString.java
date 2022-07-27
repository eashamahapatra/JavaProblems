package JavaProblems;

public class lengthString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "testing";

		System.out.println(s.toCharArray().length);

		System.out.println(s.lastIndexOf(""));
		
		System.out.println(s.split("").length);
		
		int count =0;
		for(char c : s.toCharArray()){
			count++;
		}
		System.out.println(count);
		
		
		
	}

}
