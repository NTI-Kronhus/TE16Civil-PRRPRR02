package abstrakt;

public class InvestmentAccount extends Account{

	public InvestmentAccount(String owner){
		super(owner);

		
	}
	
	@Override
	public void deposit(double amount){
		super.deposit(amount-10);
	}
	
}
