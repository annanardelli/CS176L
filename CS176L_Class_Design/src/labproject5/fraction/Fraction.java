/**
 * Adds, subtracts, multiplies, and divides fractions
 */
package labproject5.fraction;

public class Fraction {
	 private int numerator;
	 private int denominator;
	 
	 //Count number of fractions
	 private static int fractionCount = 0;
	    
	    // data about a Fraction
	   

	    // constructor #1
	    public Fraction(int n, int d)
	    {
	    	if (d == 0) {
	    		System.err.println("Denominator can't be zero. Setting it to 1.");
	    		denominator = 1;
	    	}
	        // Set numerator and denominator instance variables from n and d
	    	else {
	    		numerator = n;
	    		denominator = d;
	    	}
	        // Call the reduce method below to reduce the fraction.
	    	reduce();
	    	fractionCount++;
	    }
	  
	    // constructor #2 (default constructor)
	    public Fraction() // default constructor has no inputs
	    {
	    	fractionCount++;
	    }

	    // methods
	    /**
	     * Reduce this Fraction
	     */
	  
	    private void reduce() {
	    	
	    	//boolean negativeFraction = false;
	    	//if (numerator * denominator < 0) {
	    		//negativeFraction = true; }
	    	
	    	numerator = Math.abs(numerator);
	    	denominator = Math.abs(denominator);	
	    	
	        // Set the greatest common factor to the value of numerator.
	            int GCF = numerator;
	            
	        // While the greatest common factor is greater than 1:
	            while (GCF > 1) {
	            	if (numerator % GCF != 0 || denominator % GCF != 0) {
	            		GCF --;
	            	}
	            	else {
	            		break;
	            	}
	            }
	        // End While

	        // Divide both numerator and denominator by the greatest common factor to 
	        // reduce the fraction.
	            numerator = numerator / GCF;
	            denominator = denominator / GCF;
	    }

	  
	    public String toString() {
	        // return a String representation of the fraction, i.e.,
	    	return (numerator + "/" + denominator);
	    }


	    /**
	     * Add Fractions and return the resulting sum Fraction
	     */
	    public Fraction add(Fraction f1, Fraction f2) {
	        // You will need to get the sum of Fractions f1 and f2, resulting
	        // in a sumNumerator and sumDenominator that represents the sum.
	    	
	    	int commonDenominator = f1.denominator * f2.denominator;
	    	
	    	int f1Numerator = f1.numerator * f2.denominator;
	    	int f2Numerator = f2.numerator * f1.denominator;
	    	
	    	int sumNumerator = f1Numerator + f2Numerator;

	        // Then you will need to construct a Fraction using the resulting
	        // sumNumerator and sumDenominator and return that Fraction.
	    	
	    	Fraction sum = new Fraction(sumNumerator, commonDenominator);
	    	return sum;
	    }

	    /**
	     * Subtract Fractions and return the resulting difference Fraction
	     */
	    public Fraction subtract(Fraction f1, Fraction f2) {
	    	
	    	int commonDenominator = f1.denominator * f2.denominator;
	    	int f1Numerator = f1.numerator * f2.denominator;
	    	int f2Numerator = f2.numerator * f1.denominator;
	    	
	    	int subNumerator = f1Numerator - f2Numerator;
	    	Fraction difference = new Fraction(subNumerator, commonDenominator);
	    	return difference;
	    }

	    /**
	     * Multiply Fractions and return the resulting product Fraction
	     */
	    public Fraction multiply(Fraction f1, Fraction f2) {
	    	
	    	int productNumerator = f1.numerator * f2.numerator;
	    	int productDenominator = f1.denominator * f2.denominator;
	    	
	    	Fraction product = new Fraction (productNumerator, productDenominator);
	    	return product;
	    }

	    /**
	     * Divide Fractions and return the resulting Fraction
	     */
	    public Fraction divide(Fraction f1, Fraction f2) {
	    	
	    	int switchNumerator = f2.denominator;
	    	int switchDenominator = f2.numerator;
	    	
	    	Fraction quotient = new Fraction(switchNumerator, switchDenominator);
	    	quotient = multiply(f1, quotient);
	    	return quotient;
	    }
	    
	    public static int getFractionCount() {
	    	return fractionCount;
	    }
	    
	    /**
	     * Start of static methods
	     * @param f1
	     * @param f2
	     * @return
	     */
	    public static Fraction addFraction (Fraction f1, Fraction f2) {
	        // You will need to get the sum of Fractions f1 and f2, resulting
	        // in a sumNumerator and sumDenominator that represents the sum.
	    	
	    	int commonDenominator = f1.denominator * f2.denominator;
	    	
	    	int f1Numerator = f1.numerator * f2.denominator;
	    	int f2Numerator = f2.numerator * f1.denominator;
	    	
	    	int sumNumerator = f1Numerator + f2Numerator;

	        // Then you will need to construct a Fraction using the resulting
	        // sumNumerator and sumDenominator and return that Fraction.
	    	
	    	Fraction sum = new Fraction(sumNumerator, commonDenominator);
	    	return sum;
	    }

	    /**
	     * Subtract Fractions and return the resulting difference Fraction
	     */
	    public static Fraction subtractFraction (Fraction f1, Fraction f2) {
	    	
	    	int commonDenominator = f1.denominator * f2.denominator;
	    	int f1Numerator = f1.numerator * f2.denominator;
	    	int f2Numerator = f2.numerator * f1.denominator;
	    	
	    	int subNumerator = f1Numerator - f2Numerator;
	    	Fraction difference = new Fraction(subNumerator, commonDenominator);
	    	return difference;
	    }

	    /**
	     * Multiply Fractions and return the resulting product Fraction
	     */
	    public static Fraction multiplyFraction (Fraction f1, Fraction f2) {
	    	
	    	int productNumerator = f1.numerator * f2.numerator;
	    	int productDenominator = f1.denominator * f2.denominator;
	    	
	    	Fraction product = new Fraction (productNumerator, productDenominator);
	    	return product;
	    }

	    /**
	     * Divide Fractions and return the resulting Fraction
	     */
	    public static Fraction divideFraction (Fraction f1, Fraction f2) {
	    	
	    	int switchNumerator = f2.denominator;
	    	int switchDenominator = f2.numerator;
	    	
	    	Fraction quotient = new Fraction(switchNumerator, switchDenominator);
	    	quotient = multiplyFraction(f1, quotient);
	    	return quotient;
	    }

	  } // end of Fraction class
