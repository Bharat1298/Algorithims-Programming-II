/**
 * Programing Assignment 2 - Bank Account Inheritance
 * Practice with inheritance and polymorphism by emulating
 * a bank system higharchy. This program tests the classes
 * and makes sure everything works correctly.
 * 
 * @author Bharat Khadka
 */

public class AccountDriver2 {

	public static void main(String[] args) {
		//create a basic BankAccount
		BankAccount account = new BankAccount("BA-00001", "Test User", 200.00);
		
		//deposit some money
		
		account.deposit(500);
		
		//withdraw some money
		
		account.withdraw(250);
		
		System.out.println(account);
		
		//create a second BankAccount using the copy constructor
		
		BankAccount copied = new BankAccount(account);
		
		//set a new balance
		
		copied.setBalance(300);
		
		System.out.println(copied);
		
		//create a CheckingAccount
		
		CheckingAccount checking = new CheckingAccount("BA-00002", "John Smith", 125.22);
		
		//withdraw some money
		
		checking.withdraw(50.22);
		
		System.out.println(checking);
		
		//create a SavingsAccount
		
		SavingsAccount savings = new SavingsAccount("SA-00001", "Jane Doe", 672.40, 0.05);
		
		//deposit some money
		
		savings.deposit(500);
		
		//add interest to the account
		
		savings.postInterest();
		
		System.out.println(savings);
		
		//Create a second SavingsAccount with the copy constructor
		
		SavingsAccount copy = new SavingsAccount(savings);
		
		//reset the balance to a new value
		
		copy.setBalance(36205.06);
		
		//reset the account number to a new string
		
		copy.setAccountNumber("SA-00002");
		
		//add interest to the account for a period of 5 years
		
		for(int i = 0; i < 5; i++) {
			copy.postInterest();
		}
		
		System.out.println(copy);
	}

}
