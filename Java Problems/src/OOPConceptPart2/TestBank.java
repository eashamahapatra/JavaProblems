package OOPConceptPart2;

public class TestBank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(USBank.min_bal);
		HSBCBank obj= new HSBCBank();
		
		obj.carLoan();
		obj.educationLoan();
		obj.credit();
		obj.debit();
		obj.transferMoney();
		obj.MutualFund();
		
		System.out.println("dynamic polymorphism");
		
		USBank obj1= new HSBCBank();
		obj1.credit();
		obj1.debit();
		obj1.transferMoney();
		
		
		
		
		
		
	}

}
