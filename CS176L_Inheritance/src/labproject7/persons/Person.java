/**
 * Superclass
 * Sets the name of each person
 * @author AnnaNardelli
 *
 */
package labproject7.persons;

public class Person {

	//instance variables
	private String name;
	
	//methods
	public void setName(String name) {
		this.name = name;
	}
	
	public String toString() {
		return getClass() + "\n" + 
				"Name: " + name;
	}
}
