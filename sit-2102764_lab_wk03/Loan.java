
import java.util.Date;
import static java.lang.Math.pow;

public class Loan {

	private double annualInterestRate = 2.5;
	private int numberOfYears = 1;
	private double loanAmount = 1000;
	private Date loanDate;

	public Loan() {
	}

	public Loan(double annualInterestRate, int numberOfYears, double loanAmount) {
		this.annualInterestRate = annualInterestRate;
		this.numberOfYears = numberOfYears;
		this.loanAmount = loanAmount;
	}

	public double getAnnualInterestRate() {
		return annualInterestRate;
	}

	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}

	public int getNumberOfYears() {
		return numberOfYears;
	}

	public void setNumberOfYears(int numberOfYears) {
		this.numberOfYears = numberOfYears;
	}

	public double getLoanAmount() {
		return loanAmount;
	}

	public void setLoanAmount(double loanAmount) {
		this.loanAmount = loanAmount;
	}

	public Date getLoanDate() {
		return loanDate;
	}

	public void setLoanDate(Date loanDate) {
		this.loanDate = loanDate;
	}

	public double getMonthlyPayment(){

		double monthlyPayment, monthlyInterestRate;

		monthlyInterestRate = (annualInterestRate/100) / 12;
		monthlyPayment = ((loanAmount * monthlyInterestRate) / (1 - (1 / pow((1+monthlyInterestRate), (numberOfYears * 12)))));

		return monthlyPayment;
	}

	public double getTotalPayment(){

		double totalPayment;

		double monthlyPayment = getMonthlyPayment();

		totalPayment = monthlyPayment * numberOfYears * 12;

		return totalPayment;
	}
}
