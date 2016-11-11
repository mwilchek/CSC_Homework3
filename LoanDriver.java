import java.util.Scanner;

public class LoanDriver {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		System.out.print("Enter annual interest rate, for example, 8.25: ");
		double annualInterestRate = kb.nextDouble();
		System.out.print("Enter number of years as an integer: ");
		int numberOfYears = kb.nextInt();
		System.out.print("Enter loan amount, for example, 120000.95: ");
		double loanAmount = kb.nextDouble();
		Loan loan = new Loan(annualInterestRate, numberOfYears, loanAmount);
		System.out.println();
		System.out.printf("The loan was created on %s\n" + "The monthly payment is: %.2f\nThe total payment is: %.2f\n",
				loan.getLoanDate().toString(), loan.getMonthlyPayment(), loan.getTotalPayment());
		kb.close();
	}

}
