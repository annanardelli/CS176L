import java.text.DecimalFormat;

/**
 * Output two temperature conversion tables, F-to-C and C-to-F.
 * @author AnnaNardelli
 *
 */
public class TempConvert {
	public static void main (String[] args) {
		DecimalFormat decFormat = new DecimalFormat(".00");
		
		//F-to-C table
		System.out.println("Fahrenheit" + "\t" + "Celcius");
		System.out.println("----------" + "\t" + "-------");
		for (int tempF = 0; tempF <= 212; tempF += 2) {
			double tempC = (tempF -32)/1.8;
			System.out.println(tempF+ "\t\t" + decFormat.format(tempC));
		}
		
		//C-to-F table
		System.out.println("");
		System.out.println("Celcius" + "\t\t" + "Fahrenheit");
		System.out.println("-------" + "\t\t" + "----------");
		for (int tempC = 0; tempC <= 100; tempC += 2) {
			double tempF = (tempC*1.8) + 32;
			System.out.println(tempC + "\t\t" + decFormat.format(tempF));
		}
	}
}
