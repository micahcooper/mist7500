package calculator;

public class LoanCalculator {
	static int termInMonths;
	static double monthlyInterestRate;
	static double monthlyPayment;
	
	public static int getTermInMonths(int termInYears){
		return 12*termInYears;
	}
	
	public static double getMonthlyInterestRate(double apr){
		return (apr/100)/12;
	}
	
	public static double getMonthlyPayment(int amountLoaned, double monthlyRate, int totalMonths){
		return (amountLoaned * monthlyRate) / (1 - (Math.pow( (1 + monthlyRate), (-1*totalMonths)) ));
	}
	
	public static void printValues(){
		System.out.println("Number of months: "+termInMonths);
		System.out.println("Monthly interest rate: "+monthlyInterestRate);
		System.out.println("Monthly payment: "+monthlyPayment);
	}

	public static void main(String[] args) {
		// expected input order is loan amount, interest, years of loan
		int amountLoaned = Integer.parseInt(args[0]);
        double interestRate = Double.parseDouble(args[1]);
        int termInYears = Integer.parseInt(args[2]);
        
        termInMonths = getTermInMonths(termInYears);
        monthlyInterestRate = getMonthlyInterestRate(interestRate);
        monthlyPayment = getMonthlyPayment(amountLoaned, getMonthlyInterestRate(interestRate), getTermInMonths(termInYears));
        
        printValues();
        
	}

}
