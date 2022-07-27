package OOPConceptPart2;

public class HSBCBank implements USBank,BrazilBank{

	@Override
	public void credit() {
		// TODO Auto-generated method stub
		System.out.println("hsbc--credit");
	}

	@Override
	public void debit() {
		// TODO Auto-generated method stub
		System.out.println("hsbc--debit");
	}

	@Override
	public void transferMoney() {
		// TODO Auto-generated method stub
		System.out.println("hsbc--transferMoney");
	}

	@Override
	public void MutualFund() {
		// TODO Auto-generated method stub
		
		System.out.println("BrazilBank-MutualFund");
		
	}
	
	public void educationLoan() {
		// TODO Auto-generated method stub
		System.out.println("hsbc--educationLoan");
	}

	public void carLoan() {
		// TODO Auto-generated method stub
		System.out.println("hsbc--carLoan");
	}
	
}
