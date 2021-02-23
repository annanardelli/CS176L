/**
 * Determines if three integer sides
 * can form a valid triangle.
 * 
 * @author AnnaNardelli
 *
 */

import java.util.Scanner;

public class ValidTriangles {
	
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		while (true) {
			System.out.println("Enter the three integer edges of a tringle (-1 to quit): ");
			double side1 = input.nextDouble();
			if (side1 == -1) break;
			
			double side2 = input.nextDouble();
			double side3 = input.nextDouble();
			
			//Determine whether the three sides form a valid triangle.
			
			if (side1 + side2 > side3 && side1 + side3 > side2 && side2 + side3 > side1) {
				System.out.println("This is a valid triangle.");
			}
			else {
				System.out.println("This is not a valid triangle.");
			}
			input.close();
		}

		}
}
