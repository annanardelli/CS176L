/**
 * Tests the SumOfDice class.
 */
package labproject3.prob1;

public class TestSumOfDice {
	public static void main (String[] args) {
		
		//Creates test object
		SumOfDice test = new SumOfDice();
		
		//Calls the methods from SumOfDice
		test.rollDice();
		test.printSums();
		test.printBars();
	}
}
