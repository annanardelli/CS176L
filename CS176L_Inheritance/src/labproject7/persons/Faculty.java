/**
 * Subclass of Employee 
 * Sets faculty rank
 */
package labproject7.persons;

public class Faculty extends Employee {

	//Instance variable
	private String rank;
	
	//sets the rank of the faculty
	public void setRank (String rank) {
		this.rank = rank;
	}
	
	@Override
	public String toString() {
		return super.toString() + "\n" +
				"Rank: " + rank;
	}
}
