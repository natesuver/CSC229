package csc229.midterm;

public class AccountEntry {

	public static void main(String[] args) {
		Account a = new Account(100);
        System.out.println("Current balance: " + a.getBalance());

        a.deposit(50);
        System.out.println("Current balance after deposit: " + a.getBalance());

        a.withdraw(75);
        System.out.println("Current balance after withdrawal: " + a.getBalance());

        a.withdraw(100);
        System.out.println("Current balance after second withdrawal: " + a.getBalance()); //missing out
	}

}
