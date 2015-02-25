package AbstractClassEmployee;

public abstract class AbstractClassDemo {

	public static void main(String[] args) {
		Employee employee1 = new HourlyEmployee("Cook", "Spongebob", "Squarepants", "12345", 15, 8); //TODO - make hourly employee
		Employee employee2 = new PermanentEmployee("Cashier", "Squidward", "Tentacles", "23456", 600, 20); // TODO - make permanent employee

		// print the salary
		printSalary(employee1);
		printSalary(employee2);
	}

	public static void printSalary(Employee e) {
		System.out.println("Salary of " + e.getName() + " is: "
				+ e.computeSalary());
	}

}