package calculator;
 
public class LoanCalculator {
 
        public static void main(String[] args) {
                // calculated variables
                int totalMonths;
                double monthlyPayment;
                double monthlyRate;
                
                //input variables
                double amountLoaned = Double.parseDouble(args[0]);
                double interestRate = Double.parseDouble(args[1]);
                int termInYears = Integer.parseInt(args[2]);
               
                monthlyRate = (interestRate/100) / 12;
                totalMonths = termInYears * 12;
                monthlyPayment = (amountLoaned * monthlyRate) / (1 - (Math.pow( (1 + monthlyRate), (-1*totalMonths)) ));
               
                System.out.println("Monthly payment "+monthlyPayment);
                System.out.println("Monthly rate "+monthlyRate);
                System.out.println("Total months "+totalMonths);
        }
 
}