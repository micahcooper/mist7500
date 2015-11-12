/**
 * 
 */
package hrpayroll;

/**
 * @author micah cooper
 *
 */
public class PayrollReport {
	
	public static void main(String[] args){
		//create a new array to house the employees
		Employee[] hrList = new Employee[6];
		double totalPayroll = 0;
		
		//add employees to the array
		hrList[0] = new SalariedEmployee("victor", "marx", 123, 65000.04);
		hrList[1] = new SalariedEmployee("nic","alexander", 124, 89000.04);
		hrList[2] = new HourlyEmployee("estelle", "helene", 125, 160, 8.5);
		hrList[3] = new StudentEmployee("craig", "allan", 126, 30, 10);
		hrList[4] = new StudentEmployee("clark", "edwards", 127, 25, 10);
		hrList[5] = new StudentEmployee("monique", "rogers", 128, 44, 10);
		
		//iterate over the array and print out the toString
		for(int i=0; i<hrList.length; i++){
			System.out.println(hrList[i].toString());
			totalPayroll = totalPayroll + hrList[i].getMonthlyPay();
		}

		//print the total monthly payroll
		System.out.println("Total Payroll:\t"+totalPayroll);
	}

}
