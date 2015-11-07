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
        
        Loan myLoan = new Loan(loanAmount, interestRate, termInYears);
        
        myLoan.printValues();
	}

}
