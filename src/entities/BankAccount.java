package entities;

public class BankAccount {
	private int accountNumber;
	private String holder;
	private double balance;
	
	public BankAccount(int accountNumber, String holder){
		this.accountNumber = accountNumber;
		this.holder = holder;
	}
	
	public BankAccount(int accountNumber, String holder, double initialDepositValue){
		this.accountNumber = accountNumber;
		this.holder = holder;
		deposit(initialDepositValue);
	}
	
	public void deposit(double depositValue) {
		if(depositValue > 0)
			this.balance+=depositValue;
	}
	
	public void withdraw(double withdrawValue) {
		if(withdrawValue > 0)
			this.balance -= withdrawValue + 5.00;
	}
	
	public String getDataAccount() {
		return String.format("Account: %d, Holder: %s, Balance: $ %.2f\n",
				this.accountNumber, 
				this.getHolder(), 
				this.balance);
	}	
	
	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public double getBalance() {
		return balance;
	}

}
