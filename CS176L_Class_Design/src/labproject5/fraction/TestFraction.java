/**
 * Tests the Fraction class
 */
package labproject5.fraction;

public class TestFraction {
	public static void main (String[] args) {
		
		Fraction f7 = new Fraction(4, 1);
		Fraction f8 = new Fraction(1, 17);
		Fraction f9 = new Fraction();
		
		f9 = Fraction.addFraction(f7, f8);
		System.out.println(f9);
		

	    Fraction f0 = new Fraction( 4, 6 );
	    System.out.println(f0); // expected output: 2/3

	    Fraction f1 = new Fraction( 5, 8 ); // fraction 5/8
	    Fraction f2 = new Fraction( 1, 9 );
	    Fraction f3 = new Fraction();
	            
	    // Add f1 and f2 and store result in f3:
	    f3 = f3.add( f1, f2 ); 
	    System.out.println( f1 + " + " + f2 + " = " + f3 ); // uses the toString() method
	    // expected output: 5/8 + 1/9 = 53/72

	    // Subtract f1 and f2 and store result in f3:
	    f3 = f3.subtract( f1, f2 ); // f3 holds the result of 5/8 - 1/9
	    System.out.println( f1 + " - " + f2 + " = " + f3 );
	    // expected output: 5/8 + 1/9 = 37/72

	    // Multiply f1 and f2 and store result in f3:
	    f3 = f3.multiply( f1, f2 ); 
	    System.out.println( f1 + " * " + f2 + " = " + f3 );
	    // expected output: 5/8 + 1/9 = 5/72

	    // Divide f1 and f2 and store result in f3:
	    f3 = f3.divide( f1, f2 ); // f3 holds the result of 5/8  1/9
	    System.out.println( f1 + " / " + f2 + " = " + f3 );
	    // expected output: 5/8 + 1/9 = 45/8
	    
	    System.out.println("Number of fractions created: " + Fraction.getFractionCount());

	    System.out.println("Static Version: ");
	    
	    Fraction f4 = new Fraction(11, 21); // fraction 11/21
		Fraction f5 = new Fraction(7, 3);
		Fraction f6 = new Fraction();

		//Static operations
		f6 = Fraction.addFraction(f4, f5);
		System.out.println(f4 + " + " + f5 + " = " + f6);
		
		f6 = Fraction.subtractFraction(f4, f5);
		System.out.println(f4 + " - " + f5 + " = " + f6);
		
		f6 = Fraction.multiplyFraction(f4, f5);
		System.out.println(f4 + " * " + f5 + " = " +f6);
		
	    f6 = Fraction.divideFraction(f4, f5);
	    System.out.println(f4 + " / " + f5 + " = " + f6);
	    
	    System.out.println("Number of fractions created: " + Fraction.getFractionCount());
	    
	}
}
