/**
 * Programing Assignment 2 - Bank Account Inheritance
 * Practice with inheritance and polymorphism by emulating
 * a bank system higharchy. This class initializes the BankAccount
 * class, which is the parent for all types of bank accounts.
 * 
 * @author Bharat Khadka
 */

public class BankAccount {
	
	private double balance;
	private String owner;
	private String accountNumber;
	
	protected int numberOfAccounts;
	
	static final double CONVERSION = 0.79;
	
	public BankAccount(){
		numberOfAccounts++;
	}
	
	public BankAccount(String accountNumber, String owner, double balance) {
		this.accountNumber = accountNumber;
		this.owner = owner;
		this.balance = balance;
		numberOfAccounts++;
	}
	
	public BankAccount(BankAccount account) {
		this.accountNumber = account.accountNumber;
		this.owner = account.owner;
		this.balance = account.balance;
		numberOfAccounts++;
	}
	
	public void deposit(double amount) {
		if (amount > 0) {
			balance += amount;
		}
	}
	
	public boolean withdraw(double amount) {
		if(amount > balance) {
			return false;
		}else {
			balance -= amount;
		}
		return true;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public String getOwner() {
		return owner;
	}
	
	public String getAccountNumber() {
		return accountNumber;
	}
	
	public void setBalance(double newBalance) {
		if (newBalance >= 0){
			balance = newBalance;	
		}
	}
	
	public void setAccountNumber(String newAccountNumber) {
		accountNumber = newAccountNumber;
	}
	
	public String toString() {
        return String.format("Account number: %s, Account owner: %s, Balance: %.2f", accountNumber, owner, balance);		
	}
	
	public double convertToBritishPound(double amount) {
		return amount * CONVERSION;
	}
	
}
