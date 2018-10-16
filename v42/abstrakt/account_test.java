package abstrakt;

public class account_test {
	
	
	public static String typeOfAccount(Account acc){
			if(acc instanceof BankAccount)
				return "BankAccount";
			else if(acc instanceof InvestmentAccount)
				return "InvestmentAccount";
			else
				return "kommer aldrig hända lol";
	} 
	
	public static void main(String[] args) {
		
		
		Account acc = new BankAccount("joakim");
		
		if(acc instanceof BankAccount){
			((BankAccount) acc).taxReturn();
		}
		acc.getOwner();
		acc.getBalance();
		acc.deposit(500);
		acc.withdraw(400);
	}
}
