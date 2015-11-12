/**
 * 
 */
package hrpayroll;

/**
 * @author mrcooper
 *
 */
public class StudentEmployee extends HourlyEmployee{

	/**
	 * 
	 */
	public StudentEmployee() {
		// TODO Auto-generated constructor stub
		super();
	}
	
	public StudentEmployee(String firstName, String lastName, int employeeNumber, int monthlyHours, int hourlyRate){
		super(firstName, lastName, employeeNumber, monthlyHours, hourlyRate);
	}

	protected double getMonthlyPay(){
		if(super.getMonthlyHours() > 40)
			return 40*super.getHourlyRate();
		else
			return (double)super.getMonthlyHours()*super.getHourlyRate();
	}
	
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
