/**
 * 
 */
package hrpayroll;

/**
 * @author mrcooper
 *
 */
public class SalariedEmployee extends Employee {

	/**
	 * 
	 */
	public SalariedEmployee() {
		// TODO Auto-generated constructor stub
		super.setFirstName("John");
		super.setLastName("Smith");
	}
	
	public String toString(){
		return super.getLastName();
	}

}
