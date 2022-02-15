

import java.util.Date;
import java.util.Scanner;

public class Bank extends Loan{
	public static void main(String[] args) {

		double annualInterestRate, loanAmount;
		int numberOfYears;

		Scanner input  = new Scanner(System.in);
		Date currentDate = new Date();

		System.out.print("Enter annual interest rate, for example, 8.25:  ");
		annualInterestRate = input.nextDouble();

		System.out.print("Enter number of years as an integer: ");
		numberOfYears = input.nextInt();

		System.out.print("Enter loan amount, for example, 120000.95: ");
		loanAmount = input.nextDouble();

		Loan l001 = new Loan(annualInterestRate, numberOfYears, loanAmount);

		l001.setLoanDate(currentDate);
		System.out.println("The loan was created on " + l001.getLoanDate());

		System.out.format("The monthly payment is %.2f\n", l001.getMonthlyPayment());
		System.out.format("The total payment is %.2f\n", l001.getTotalPayment());

		input.close();
	}
}
