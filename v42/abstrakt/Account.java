package abstrakt;

public abstract class Account {
	
	private String owner;
	private double balance;

	public Account(String owner){
		this.owner = owner;
	}
	
	public String getOwner(){
		return this.owner;
	}

	public double getBalance(){
		return this.balance;
	}
	
	public void deposit(double amount){
		if(amount < 0){
			return;
		}
		this.balance += amount;
	}

	public void withdraw(double amount){
		if(amount < 0 || this.balance - amount < 0){
			return;
		}
		
		this.balance -= amount;
	}


}
