package AbstractionConcept;

public class TestBank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		HDFCBank obj = new HDFCBank();
		obj.credit();
		obj.debit();
		obj.loan();
		obj.funds();
		System.out.println(obj.amt);
		System.out.println(obj.rate);
		System.out.println(obj.loanRate);		
		
		System.out.println();
		
		Bank obj1 = new HDFCBank();
		obj1.credit();
		obj1.debit();
		obj1.loan();
		System.out.println(obj1.amt);
		System.out.println(obj1.rate);
		System.out.println(obj1.loanRate);		
		
		
	}

}
