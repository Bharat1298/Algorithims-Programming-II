/**
 * Programing Assignment 2 - Bank Account Inheritance
 * Practice with inheritance and polymorphism by emulating
 * a bank system higharchy. This class initializes the SavingsAccount
 * class, which is a child of the BankAccount class. It overrides
 * the toString methods from BankAccount and also adds its own methods.
 * 
 * @author Bharat Khadka
 */

public class SavingsAccount extends BankAccount{
	private double rate;
	
	// Constructor that uses inherited data from BankAccount to create a new Savings Account
	public SavingsAccount(String accountNumber, String owner, double balance, double rate) {
		super(accountNumber, owner, balance);
		this.rate = rate;
	}
	
	// Copy constructor
	public SavingsAccount(SavingsAccount self) {
		this.rate = self.rate;
	}
	
	// Deposits interest into the savings account
	public void postInterest() {
		double interest = super.getBalance() * rate;
		super.deposit(interest);
	}
	
	//@Override
	public String toString() {
        return String.format("Account number: %s, Account owner: %s, Balance: %.2f, Interest Rate: %.2f%%", super.getAccountNumber(), super.getOwner(), super.getBalance(), rate * 100);		
	}
}
