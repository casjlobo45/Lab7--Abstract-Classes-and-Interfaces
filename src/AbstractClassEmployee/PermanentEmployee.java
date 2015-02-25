package AbstractClassEmployee;

public class PermanentEmployee extends Employee {

	private int hoursWorked;
	private double weeklySalary;
	
	public PermanentEmployee(String title, String firstName, String lastName,
			String ID, int hoursWorked, double weeklySalary) {
		super(title, firstName, lastName, ID);
		// TODO Auto-generated constructor stub
		this.hoursWorked = hoursWorked;
		this.weeklySalary = hoursWorked;
	}

	public double getWeeklySalary() {
		return weeklySalary;
	}

	public void setWeeklySalary(double weeklySalary) {
		this.weeklySalary = weeklySalary;
	}

	public int getHoursWorked() {
		return hoursWorked;
	}

	public void setHoursWorked(int hoursWorked) {
		this.hoursWorked = hoursWorked;
	}

	@Override
	public double computeSalary(){
		double salary = 0;
		if(hoursWorked > 40){
			salary = weeklySalary + ((hoursWorked-40)*8*1.5);
			return salary;
		}else{
			return weeklySalary;
		}
	}
	
	
}
