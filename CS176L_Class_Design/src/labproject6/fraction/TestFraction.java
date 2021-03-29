/**
 * 
 * @author AnnaNardelli
 *
 */
package labproject6.fraction;

public class TestFraction {

	public static void main (String[] args) {
    	Fraction f1 = new Fraction(11, 21);
        Fraction f2 = new Fraction(-7, 3);
        Fraction result = new Fraction();
    /* Add the following code. */

    // Print the number of Fraction objects that have been constructed so far;
    // use the static getFractionCount() method.
    	 System.out.println("Number of Fractions constructed: " + Fraction.getFractionCount());

    // Add f1 and f2 and assign the result to result...

    // Use add method #1:
    	 result = result.add(f1, f2);
    	 System.out.println(f1 + " + " + f2 + " " + " = " + result);
    // Print the result of using add method #1.
    // Expected output is: 11/21 + -7/3 = -38/21

    // Use add method #2:

    // Print the result of using add method #2.
    // Expected output is: 11/21 + -7/3 = -38/21
    	 System.out.println("Static Version:");
    	 result = Fraction.addFraction(f1.numerator, f1.denominator, f2.numerator, f2.denominator);
    	 System.out.println(f1 + " + " + f2 + " = " + result);
    // Print the number of Fraction objects that have been constructed so far,
    // using the static getFractionCount() method.
    	 System.out.println("Number of Fractions constructed: " + Fraction.getFractionCount());
    }
}