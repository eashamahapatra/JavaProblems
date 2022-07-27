package JavaBasics_2;

public class ThrowsKeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ThrowsKeyword obj = new ThrowsKeyword();
		obj.sum();
		System.out.println("complete");

	}

	public void sum() {
		try {
			div();
		} catch (Throwable e) {
			System.out.println("this method handled the exception");
		}
	}

	public void div() throws Exception {
		int i = 9 / 0;
	}

}
