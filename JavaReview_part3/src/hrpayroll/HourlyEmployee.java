/**
 * 
 */
package hrpayroll;

/**
 * @author mrcooper
 *
 */
public class HourlyEmployee extends Employee{
	private int monthlyHours;
	private double hourlyRate;
	
	/**
	 * 
	 */
	public HourlyEmployee() {
		// TODO Auto-generated constructor stub
		super();
		this.monthlyHours = 0;
		this.hourlyRate = 0;
	}
	
	public HourlyEmployee(String firstName, String lastName, int employeeNumber, int monthlyHours, double hourlyRate ){
		super(firstName,lastName,employeeNumber);
		this.hourlyRate = hourlyRate;
		this.monthlyHours = monthlyHours;
	}
	
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
		return "HourlyEmployee [monthlyHours=" + monthlyHours + ", hourlyRate=" + hourlyRate + getEmployeeType()+ "]";
	}

}
