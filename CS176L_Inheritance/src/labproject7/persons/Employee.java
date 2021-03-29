/**
 * Subclass of Person
 * Sets employee office and salary
 */
package labproject7.persons;

public class Employee extends Person {

	//Instance variables
	private String officeNumber;
	private double salary;
	
	//methods
	
	//sets the office number of the employee
	public void setOfficeNumber (String number) {
		officeNumber = number;
	}
	
	//sets the salary of the employee
	public void setSalary (double money) {
		salary = money;
	}
	
	@Override
	public String toString() {
		return super.toString() + "\n" +
				"Office Number: " + officeNumber + "\n" +
				"Salary: " + salary;
	}
}
