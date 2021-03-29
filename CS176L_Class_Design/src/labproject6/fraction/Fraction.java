/**
 * 
 */
package labproject6.fraction;

public class Fraction {
	 // data about a Fraction
    int numerator;
    int denominator;

    // static data
    private static int fractionCount = 0; // Keep track of number of Fractions.

    // constructor #1
    public Fraction(int n, int d)
    {
    	if (d != 0) {
    		numerator = n;
    		denominator = d;
    	}
    	else {
    		System.err.println("Denominator can't be zero. Setting it to 1.");
    		denominator = 1;
    	}
        // If d is non-zero, set numerator and denominator instance variables from n and d,
        // Else print an error message about the 0 denominator and set denominator to 1.

        // Call the reduce method below to reduce the fraction.
    	reduce();
        // Increment fractionCount.
    	fractionCount++;
    }
  
    // constructor #2 (default constructor)
    public Fraction() // default constructor has no inputs
    {
        // Increment fractionCount.
    	fractionCount++;
    }

    // methods
    /**
     * Reduce this Fraction
     */
    private void reduce()
    {
        // If this is a negative fraction, set a boolean negativeFraction to true.
			boolean negativeFraction = false;
    		if (numerator * denominator < 0) {
    			negativeFraction = true;
    		}

        // Set numerator and denominator to their absolute values.
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

        // If this was a negative fraction, then make numerator negative.
	            if (negativeFraction) {
	            	numerator = numerator / -1;
	            }
    }

  
    public String toString()
    {
        // return a String representation of the fraction, i.e.,
        // numerator / denominator.
        // If numerator is 3 and denominator is 5, the returned String
        // will be "3/5".
    	return (numerator + "/" + denominator);
    }


    /**
     * Method #1 to add Fractions and return the resulting sum Fraction
     * @param Fraction f1
     * @param Fraction f2
     * @return Fraction sum
     */
    public Fraction add(Fraction f1, Fraction f2)
    {
        /* Complete this code. (Same as Project 5) */
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
     * Method #2 to add Fractions and return the resulting sum Fraction
     * @param fraction 1 numerator
     * @param fraction 1 denominator
     * @param fraction 2 numerator
     * @param fraction 2 denominator
     * @return Fraction sum
     */
    public static Fraction addFraction (int f1num, int f1den, int f2num, int f2den)
    {
        /* Complete this code. */
    	Fraction f1 = new Fraction(f1num, f1den);
    	Fraction f2 = new Fraction(f2num, f2den);
    	
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
     * Return number of Fraction objects that have been constructed.
     * @return fractionCount
     */
    public static int getFractionCount() {
    	return fractionCount;
    }

}
