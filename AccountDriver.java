
public class AccountDriver {

	public static void main(String[] args) {
		Account account1 = new Account(1122, 20000, 4.5);
		account1.withdraw(2500.00);
		System.out.println("Your account has the updated information");
		System.out.printf("Balance: $%.2f", account1.getBalance());
		System.out.printf("\nMonthly Interest: $%.2f", account1.getMonthlyInterest(4.5));
		System.out.println("\nDate Account was Created: " + account1.getDate());
	}

}
