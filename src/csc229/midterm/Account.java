package csc229.midterm;

public class Account {
	private double balance;

	public Account(double balance) {
		this.balance = balance;
	}

	public void deposit(double amount) {
		this.balance += amount;
	}

	public void withdraw(double amount) { //this is a mutator, and should specify VOID
		if (this.balance >= amount) { //should be >=, this disallows someone from emptying their account
			this.balance -= amount;
		} else {
			System.out.println("Insufficient funds");
		}
	}

	public double getBalance() { //wrong data type
		return this.balance;
	}

}
