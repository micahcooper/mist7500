/**
 * 
 */
package calculator;

/**
 * @author mrcooper
 *
 */
public class Loan {
	protected int loanAmount;
	protected double interestRate;
	protected int termInYears;
	/**
	 * 
	 */
	public Loan() {
		// no values given, default to something
		loanAmount = 0;
		interestRate = 0;
		termInYears = 0;
	}
	
	/**
	 * @param original loan amount
	 * @param the annual interest rate
	 * @param total number of years
	 */
	public Loan(int loanAmount, double interestRate, int termInYears){
		this.loanAmount = loanAmount;
		this.interestRate = interestRate;
		this.termInYears = termInYears;
	}
	
	public double getMonthlyPayment(){
		return (loanAmount * getMonthlyRate()) / (1 - (Math.pow( (1 + getMonthlyRate()), (-1*getTermInMonths())) ));
	}
	
	protected int getTermInMonths(){
		return termInYears*12;
	}
	protected double getMonthlyRate(){
		return (interestRate/100)/12;
	}

	protected int getLoanAmount() {
		return loanAmount;
	}

	protected void setLoanAmount(int loanAmount) {
		this.loanAmount = loanAmount;
	}

	protected double getInterestRate() {
		return interestRate;
	}

	protected void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}

	protected int getTermInYears() {
		return termInYears;
	}

	protected void setTermInYears(int termInYears) {
		this.termInYears = termInYears;
	}

	public void calculateMonthlyValues(){
		System.out.println("Number of months: "+getTermInMonths());
		System.out.println("Monthly interest rate: "+getMonthlyRate());
		System.out.println("Monthly payment: "+getMonthlyPayment());
	}
}
