/**
 * 
 */
package hrpayroll;

/**
 * @author micah cooper
 *
 */
public class HourlyEmployee extends Employee{
	private int monthlyHours;
	private double hourlyRate;
	
	/**
	 * default constructor
	 */
	public HourlyEmployee() {
		super();
		this.monthlyHours = 0;
		this.hourlyRate = 0;
	}
	
	/**
	 * @param firstName
	 * @param lastName
	 * @param employeeNumber
	 * @param monthlyHours
	 * @param hourlyRate
	 */
	public HourlyEmployee(String firstName, String lastName, int employeeNumber, int monthlyHours, double hourlyRate ){
		super(firstName,lastName,employeeNumber);
		this.hourlyRate = hourlyRate;
		this.monthlyHours = monthlyHours;
	}
	
	/**
	 * @return the monthly pay amount
	 */
	protected double getMonthlyPay(){
		return this.getMonthlyHours()*this.getHourlyRate();
	}
	
	/**
	 * @return the employee type
	 */
	protected String getEmployeeType(){
		return "Hourly employee";
	}

	/**	 * @return the monthlyHours
	 */
	protected int getMonthlyHours() {
		return monthlyHours;
	}

	/**
	 * @param monthlyHours the monthlyHours to set
	 */
	protected void setMonthlyHours(int monthlyHours) {
		this.monthlyHours = monthlyHours;
	}

	/**
	 * @return the hourlyRate
	 */
	protected double getHourlyRate() {
		return hourlyRate;
	}

	/**
	 * @param hourlyRate the hourlyRate to set
	 */
	protected void setHourlyRate(double hourlyRate) {
		this.hourlyRate = hourlyRate;
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
