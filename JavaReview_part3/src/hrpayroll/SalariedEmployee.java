/**
 * 
 */
package hrpayroll;

/**
 * @author mrcooper
 *
 */
public class SalariedEmployee extends Employee {

	private double yearlySalary;
	/**
	 * 
	 */
	public SalariedEmployee() {
		// TODO Auto-generated constructor stub
		super();
		this.setYearlySalary(0);
	}
	
	public SalariedEmployee(String firstName, String lastName, int employeeNumber, double yearlySalary){
		super(firstName, lastName, employeeNumber);
		this.setYearlySalary(yearlySalary);
	}
	
	protected double getMonthlySalary(){
		return yearlySalary / 12;
	}
	
	protected String getEmployeeType(){
		return "Salaried Employee";
	}
	
	public String toString(){
		return "First Name: "+super.getFirstName()+"\n"+
				"Last name: "+super.getLastName()+"\n"+
				"Employee type: "+this.getEmployeeType()+"\n"+
				"Monthly pay: "+ this.getMonthlySalary();
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
