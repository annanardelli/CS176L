/**
 * Subclass of Employee
 * Sets staff title
 */
package labproject7.persons;

public class Staff extends Employee {

	//instance variables
	private String title;
	
	//methods
	
	//Sets the title of the employee
	public void setTitle (String title) {
		this.title = title;
	}
	
	@Override
	public String toString() {
		return super.toString() + "\n" +
				"Title: " + title;
	}
}
