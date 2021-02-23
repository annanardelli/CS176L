/**
 * Inputs positive integer n and displays the sum of the first
 * n positive odd integers.
 * @author AnnaNardelli
 *
 */
import java.util.Scanner;

public class SumOfOdd {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a positive integer: ");
		int n = input.nextInt();
		System.out.println("");
		int currentOddNumber = 1;
		int sum = 0;
		
		//Print integers
		System.out.println("The first " + n + " positive odd integers are: ");
		for (int i = 0; i< n; i++) {
			System.out.print(currentOddNumber + " ");
			sum += currentOddNumber;
			currentOddNumber+=2;
		}
		System.out.println("");
		System.out.println("");
		
		//Print sum
		System.out.println("The sum is: ");
		System.out.print(sum);
		input.close();
	}
}
