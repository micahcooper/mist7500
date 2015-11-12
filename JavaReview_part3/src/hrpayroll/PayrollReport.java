/**
 * 
 */
package hrpayroll;

/**
 * @author mrcooper
 *
 */
public class PayrollReport {
	
	public static void main(String[] args){
		Employee[] hrList = new Employee[3];
		
		hrList[0] = new SalariedEmployee("victor", "marx", 123, 65000);
		hrList[1] = new SalariedEmployee("nic","alexander", 124, 89000);
		hrList[2] = new HourlyEmployee("estelle", "helene", 125, 160, 12.5);
		
		for(int i=0; i<hrList.length; i++){
			System.out.println(hrList[i].toString());
		}

	}

}
