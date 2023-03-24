package csc229.midterm;

public class AccountUnitTest {
	 public static void main(String[] args) {
			Account acct = new Account(10);
			//your code goes here
			acct.deposit(10);
			
			if (acct.getBalance()!=20) {
				System.out.println("Incorrect Balance");
			}
			double currentBalance = acct.getBalance();
			
			acct.withdraw(500);
			
			double newBalance = acct.getBalance();
			if (currentBalance != newBalance) {
				System.out.println("Balance should not have changed.. there is a problem");
			}
			
	 }
}
