package AbstractClassEmployee;

public abstract class Employee {
	private String ID;
	private String firstName;
	private String lastName;
	private String title;
	
	
	public Employee(String title, String firstName,String lastName, String ID){
		
		this.firstName = firstName;
		this.ID = ID;
		this.lastName = lastName;
		this.title = title;
		
	}
	
	public String getID(){
		return this.ID;
		
	}
	public void setID(String ID) {
		this.ID = ID;
	}

	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getlastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getName(){
		return lastName + "," + firstName;
	}


	public abstract double computeSalary();

	public abstract int getHoursWorked();

	public abstract double getWeeklySalary();
	
	
}
