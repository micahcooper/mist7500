/**
 * 
 */
package hrpayroll;

/**
 * @author micah cooper
 *
 */
public class StudentEmployee extends HourlyEmployee{

	/**
	 * default constructor
	 */
	public StudentEmployee() {
		super();
	}
	
	/**
	 * @param firstName
	 * @param lastName
	 * @param employeeNumber
	 * @param monthlyHours
	 * @param hourlyRate
	 */
	public StudentEmployee(String firstName, String lastName, int employeeNumber, int monthlyHours, int hourlyRate){
		super(firstName, lastName, employeeNumber, monthlyHours, hourlyRate);
	}

	/**
	 * @return the monthly pay calculation
	 */
	protected double getMonthlyPay(){
		if(super.getMonthlyHours() > 40)
			return 40*super.getHourlyRate();
		else
			return (double)super.getMonthlyHours()*super.getHourlyRate();
	}
	
	/**
	 * @return the employee type
	 */
	protected String getEmployeeType(){
		return "Student Employee";
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Name: "+super.getLastName()+", "+super.getFirstName()+"\t"+
				"Type: "+this.getEmployeeType()+"\t"+
				"Monthly pay: "+ this.getMonthlyPay();
	}
}
