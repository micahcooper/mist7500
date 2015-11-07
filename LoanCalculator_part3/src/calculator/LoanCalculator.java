/**
 * 
 */
package calculator;

/**
 * @author mrcooper
 *
 */
public class LoanCalculator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// expected input order of values loan amount, interest rate and loan term in years
		int loanAmount = Integer.parseInt(args[0]);
        double interestRate = Double.parseDouble(args[1]);
        int termInYears = Integer.parseInt(args[2]);
        
        //Instantiate my Loan object
        Loan myLoan = new Loan();
        
        //give the loan object the loan term in years
        myLoan.setTermInYears(termInYears);
        //give the loan object the annual interest rate
        myLoan.setInterestRate(interestRate);
        //give the loan object the initial loan amount
        myLoan.setLoanAmount(loanAmount);
        
        //
        
        myLoan.calculateMonthlyValues();
	}

}
