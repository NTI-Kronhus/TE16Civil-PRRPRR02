package abstrakt;

public class BankAccount extends Account{

	public BankAccount(String owner){
		super(owner);		
	}
	
	@Override
	public void deposit(double amount){
		super.deposit(amount-10);
	}
	
	public void taxReturn(){
		super.deposit(getBalance()*0.01);
	}
	
	public void withdraw(double amount){
		super.withdraw(amount+1);
	}
}
