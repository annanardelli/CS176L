/**
 * Tests the WeeklyTemps class.
 */

package labproject2.prob1;

import java.util.Scanner;

public class TestWeeklyTemps {

	public static void main (String[] args) {
		
		double[] temps = new double[7];
		
		Scanner input = new Scanner(System.in);
		
		//Gets input and stores it in the array.
		System.out.println("Please enter the temperatures for this week: ");
		for (int i = 0; i<=6; i++) {
			temps[i] = input.nextDouble();
		}
		input.close();
		
		//Creates LastWeek object.
		WeeklyTemps LastWeek = new WeeklyTemps(temps);
		
		//Prints output and calls getMean(), getRangeStr(), and getExtreme() methods.
		System.out.println();
		System.out.println("Weekly Temperature Data (Degrees F)");
		double mean = LastWeek.getMean();
		String meanStr = String.format("\t Mean: \t\t %.1f", mean);
		System.out.println (meanStr);
		
		System.out.println("\t Range:\t\t" + LastWeek.getRangeStr());
		System.out.println("\t Extreme Temp Days: " + LastWeek.getExtreme());
	}
}