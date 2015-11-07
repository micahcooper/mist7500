package calculator;
 
public class LoanCalculator {
 
        public static void main(String[] args) {
                // loan variables
                int totalMonths;
                double monthlyPayment;
                double monthlyRate;
               
                double amountLoaned = Double.parseDouble(args[0]);
                double interestRate = Double.parseDouble(args[1])/100;
                int termInYears = Integer.parseInt(args[2]);
               
                monthlyRate = interestRate / 12;
                totalMonths = termInYears * 12;
                monthlyPayment = (amountLoaned * monthlyRate) / (1 - (Math.pow( (1 + monthlyRate), (-1*totalMonths)) ));
               
                System.out.println("Monthly payment "+monthlyPayment);
                System.out.println("Monthly rate "+monthlyRate);
                System.out.println("Total months "+totalMonths);
        }
 
}