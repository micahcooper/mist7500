/**
 * 
 */
package hrpayroll;

/**
 * @author micah cooper
 *
 */
public class SalariedEmployee extends Employee {

	private double yearlySalary;
	/**
	 * default constructor, initializes the variables to a default value
	 */
	public SalariedEmployee() {
		// TODO Auto-generated constructor stub
		super();
		this.setYearlySalary(0);
	}
	
	/**
	 * @param firstName
	 * @param lastName
	 * @param employeeNumber
	 * @param yearlySalary
	 */
	public SalariedEmployee(String firstName, String lastName, int employeeNumber, double yearlySalary){
		super(firstName, lastName, employeeNumber);
		this.setYearlySalary(yearlySalary);
	}
	
	/**
	 * @return the monthlyPay
	 */
	protected double getMonthlyPay(){
		return yearlySalary / 12;
	}
	
	/**
	 * @return the type of employee
	 */
	protected String getEmployeeType(){
		return "Salaried Employee";
	}
	
	/**
	 * @return string representation of the object
	 */
	public String toString(){
		return "Name: "+super.getLastName()+", "+super.getFirstName()+"\t"+
				"Type: "+this.getEmployeeType()+"\t"+
				"Monthly pay: "+ this.getMonthlyPay();
	}

	/**
	 * @return the yearlySalary
	 */
	protected double getYearlySalary() {
		return yearlySalary;
	}

	/**
	 * @param yearlySalary the yearlySalary to set
	 */
	protected void setYearlySalary(double yearlySalary) {
		this.yearlySalary = yearlySalary;
	}

}
