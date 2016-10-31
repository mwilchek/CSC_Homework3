import java.util.Date;

public class Account {
	private int id;
	private double balance;
	private double annualInterestRate;
	private Date dateCreated;

	public Account(){
		
	}
	
	public Account(int id, double balance, double annualInterestRate){
		this.id = id;
		this.balance = balance;
		this.annualInterestRate = annualInterestRate;
		this.dateCreated = new Date();
	}
	
	// Divide by 100
	public double getMonthlyInterest(double annualInterestRate){
		double monthlyInterestRate = getMonthlyInterestRate(annualInterestRate);
		return balance * monthlyInterestRate;
	}
	
	public double getMonthlyInterestRate(double annualInterestRate){
		return ((annualInterestRate/100) / 12);
	}
	
	public double withdraw(double w){
		balance = getBalance()-w;
		return balance;
	}
	
	public double deposit(double d){
		balance = getBalance() + d;
		return balance;
	}

	public double getBalance(){
		return balance;
	}
	
	public int getID(){
		return id;
	}
	
	public double getAnnualInterestRate(){
		return annualInterestRate;
	}
	
	public Date getDate(){
		return dateCreated;
	}
	
}
