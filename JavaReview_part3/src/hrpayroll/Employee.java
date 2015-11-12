/**
 * 
 */
package hrpayroll;

/**
 * @author mrcooper
 *
 */
public class Employee {
	private String firstName;
	private String lastName;
	private int employeeNumber;
	
	public Employee(){
		firstName = "";
		lastName = "";
	}
	
	public Employee(String firstName, String lastName, int employeeNumber){
		this.firstName = firstName;
		this.lastName = lastName;
		this.employeeNumber = employeeNumber;
	}

	/**
	 * @return the employeeNumber
	 */
	protected int getEmployeeNumber() {
		return employeeNumber;
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
		return firstName;
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
		return lastName;
	}

	/**
	 * @param lastName the lastName to set
	 */
	protected void setLastName(String lastName) {
		this.lastName = lastName;
	}
}
