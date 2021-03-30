/**
 * Subclass of Person 
 * Sets student year
 */
package labproject7.persons;

public class Student extends Person {

	//Instance variable
	private int year;
	
	//Constants
	public static final int FRESHMAN = 1;
	public static final int SOPHOMORE = 2;
	public static final int JUNIOR = 3;
	public static final int SENIOR = 4;
	public static final int SUPERSENIOR = 5;
	
	/**
	 * setYear method to set the year of the student
	 */
	
	//Sets the year of the student
	public void setYear(int yearInt) {
		if (yearInt >= 1 && yearInt <=5) {
			year = yearInt;
		}
		else if ((yearInt <1)){
			System.out.println("Invalid Input! Setting year to Freshman.");
			year = FRESHMAN;
		}
		else if (yearInt >5) {
			System.out.println("Invalid Input! Setting year to Supersenior.");
			year = SUPERSENIOR;
		}
	}
	
	@Override
	public String toString() {
		return super.toString() + "\n" +
				"Year: " + year;
	}
}
