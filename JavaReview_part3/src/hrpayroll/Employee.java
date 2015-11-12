/**
 * 
 */
package hrpayroll;

/**
 * @author micah cooper
 *
 */
public class Employee {
	private String firstName;
	private String lastName;
	private int employeeNumber;
	private double monthlyPay;
	
	public Employee(){
		this.firstName = "";
		this.lastName = "";
		this.employeeNumber = 0;
		this.monthlyPay = 0.0;
		
	}
	
	public Employee(String firstName, String lastName, int employeeNumber){
		this.firstName = firstName;
		this.lastName = lastName;
		this.employeeNumber = employeeNumber;
		this.monthlyPay = 0.0;
	}

	protected double getMonthlyPay(){
		return this.monthlyPay;
	}
	/**
	 * @return the employeeNumber
	 */
	protected int getEmployeeNumber() {
		return this.employeeNumber;
	}

	/**
	 * @param employeeNumber the employeeNumber to set
	 */
	protected void setEmployeeNumber(int employeeNumber) {
		this.employeeNumber = employeeNumber;
	}

	/**
	 * @return the firstName
	 */
	protected String getFirstName() {
		return this.firstName;
	}

	/**
	 * @param firstName the firstName to set
	 */
	protected void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @return the lastName
	 */
	protected String getLastName() {
		return this.lastName;
	}

	/**
	 * @param lastName the lastName to set
	 */
	protected void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Employee [firstName=" + firstName + ", lastName=" + lastName + ", employeeNumber=" + employeeNumber
				+ ", monthlyPay=" + monthlyPay + "]";
	}
}
