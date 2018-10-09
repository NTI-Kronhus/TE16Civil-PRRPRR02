
public class Bankkonto {

	private static int KONTO = 0;
	private static final double WITHDRAW_FEE = 5;

	private double saldo;
	private int kontonummer;
	private String ägare;

	public Bankkonto(String ägare) {
		Bankkonto.KONTO++;
		this.kontonummer = Bankkonto.KONTO;
		this.saldo = 0;
		this.ägare = ägare;
	}

	public String getÄgare() {
		return this.ägare;
	}

	public boolean deposit(double amount) {

		if (amount > 0) {
			this.saldo += amount;
			return true;
		} else {
			return false;
		}

	}

	public boolean withdraw(double amount) {

		if (amount > 0) {
			if (this.saldo >= (amount + WITHDRAW_FEE)) {
				this.saldo -= (amount + WITHDRAW_FEE);
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}

	}

	public double getSaldo() {
		return this.saldo;
	}

	public boolean transfer(Bankkonto account, double amount) {
		if (this.withdraw(amount + 5)) { // överföringsavgift 10kr (5 för
											// överföring och 5 för uttag)
			if (account.deposit(amount)) {
				// LYCKADES
				return true;
			} else {
				this.deposit(amount + 10);
				return false;
			}
		} else {
			return false;
		}
	}

}
