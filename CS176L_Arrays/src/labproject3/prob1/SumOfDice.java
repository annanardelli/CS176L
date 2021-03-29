/**
 * Simulates rolling 2 dice 100 times and prints out
 * 2 charts of the sums from each roll.
 */
package labproject3.prob1;

import java.util.concurrent.ThreadLocalRandom;

public class SumOfDice {

	//Creates array to keep track of sums,
	//and sets the number of rolls to 100
	private int[] diceSums = new int[13];
	private int rolls = 100;
	
	//Rolls the dice 100 times and adds each sum to the array
	public void rollDice() {
		for(int i = 0; i < rolls; i++) {
			int dice1 = ThreadLocalRandom.current().nextInt(1, 7);
			int dice2 = ThreadLocalRandom.current().nextInt(1, 7);
			int sum = dice1 + dice2;
			diceSums[sum]++;
		}
	}
		
	//Prints out a chart of the sums
	public void printSums() {
		System.out.println("Sum of Dice" + "\t" + "Occurences");
		System.out.println("-----------" + "\t" + "----------");
		for (int i = 2; i <= 12; i++) {
			System.out.println(i + "\t\t" + diceSums[i]);
		}
		System.out.println("");
	}
	
	//Prints out a bar chart of the sums
	public void printBars() {
		System.out.println("Dice Sums: (" + rolls + " rolls)" + "\n");
		
		for (int i = 2; i <= 12; i++) {
			String bar = "";
			for (int j = 0; j < diceSums[i]; j++) {
				bar = bar + "*";
			}
			System.out.println(i + ":\t" + bar);
		}
	}
}
