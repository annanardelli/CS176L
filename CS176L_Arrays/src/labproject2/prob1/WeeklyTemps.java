/**
 * Stores 7 temperature values in a double array and
 * calculates the mean, range, and number of extreme
 * temperature days.
 */

package labproject2.prob1;

public class WeeklyTemps {

	//Global array
	double[] temperatures = new double[7];
	
	//Constructor
	public WeeklyTemps(double[] temps) {
		temperatures = temps;
	}
	
	//Calculates the maximum temperature
	public double getMax() {
		double max = temperatures[0];
		for (int i = 0; i < temperatures.length; i++) {
			if (temperatures[i] > max) {
				max = temperatures[i];
			}
		}
		return max;
	}
	
	//Calculates the minimum temperature
	public double getMin() {
		double min = temperatures[0];
		for (int i = 0; i < temperatures.length; i++) {
			if (temperatures[i] < min) {
				min = temperatures[i];
			}
		}
		return min;
	}
	
	//Calls getMax() and getMin(), places the range in a String
	public String getRangeStr() {
		String range = String.format("%.1f - %.1f", getMin(), getMax());
		return range;
	}
	
	//Calculates the mean temperature
	public double getMean() {
		double sum = 0;
		for (double temperature: temperatures) {
			sum = sum + temperature;
		}
		return sum/7;
	}
	
	//Checks for extreme temperature values
	public int getExtreme() {
		int extremes = 0;
		for (int i = 0; i < temperatures.length; i++) {
			if (temperatures[i] <= 5.0 || temperatures[i] >= 95.0) {
				extremes++;
			}
		}
		return extremes;
	}
}
