import java.text.DecimalFormat;

/**
 * US2Metric: Generate a table of inch-to-centimeter and 
 * 			  pound-to-kilogram values
 * 
 * @author AnnaNardelli
 *
 */

public class US2Metric {

	public static void main(String[] args) {
		
		//Constants should be all caps
		final double IN_TO_CM = 2.54;
		final double LB_TO_KG = 0.454;
		DecimalFormat decFormat = new DecimalFormat(".00");
		
		//Print column headings
		System.out.println("inches\t\t" + "centimeters\t\t" + "pounds\t\t" + "kilograms");
		System.out.println("------\t\t" + "-----------\t\t" + "------\t\t" + "---------");
		
		//Print values
		for (int i = 1; i <= 50; i++) {
			double cm = i*IN_TO_CM;
			double kg = i*LB_TO_KG;
			System.out.println(i + "\t\t" + decFormat.format(cm) + "\t\t\t" + i +  "\t\t" + decFormat.format(kg));
		}

	}
}

