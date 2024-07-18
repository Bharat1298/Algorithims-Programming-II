/**
 * Programing Assignment 2 - Bank Account Inheritance
 * Practice with inheritance and polymorphism by emulating
 * a bank system higharchy. This class initializes the CheckingAccount
 * class, which is a child of the BankAccount class. It overrides the withdraw
 * and toString methods from BankAccount.
 * 
 * @author Bharat Khadka
 */

public class CheckingAccount extends BankAccount{
	
	private double FEE = 0.15;
	
	// CheckingAccount constructor
	public CheckingAccount(String accountNumber, String owner, double balance) {
		super(accountNumber, owner, balance);
	}
	
	//@Override - Adds a fee to the withdrawal
	public boolean withdraw(double amount) {
		double total = amount + FEE;
		return super.withdraw(total);
	}

	//@Override
	public String toString() {
        return String.format("Account number: %s, Account owner: %s, Balance: %.2f", super.getAccountNumber(), super.getOwner(), super.getBalance());		
	}
}
