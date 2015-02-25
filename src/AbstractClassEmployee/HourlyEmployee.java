package AbstractClassEmployee;

public class HourlyEmployee extends Employee{
	
	private int hoursWorked;
	private double payRate;
	
	public HourlyEmployee(String title, String firstName, String lastName,
			String ID, int hoursWorked, double payRate) {
		super(title, firstName, lastName, ID);
		
		this.hoursWorked = hoursWorked;
		this.payRate = payRate;
		// TODO Auto-generated constructor stub
	}

	public double getPayRate() {
		return payRate;
	}

	public void setPayRate(double payRate) {
		this.payRate = payRate;
	}

	public int getHoursWorked() {
		return hoursWorked;
	}

	public void setHoursWorked(int hoursWorked) {
		this.hoursWorked = hoursWorked;
	}

	@Override
	public double computeSalary() {
		// TODO Auto-generated method stub
		return hoursWorked * payRate;
	}

	@Override
	public double getWeeklySalary() {
		// TODO Auto-generated method stub
		return 0;
	}

}
