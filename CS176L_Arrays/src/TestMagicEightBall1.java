/**
 * Test the MagicEightBall1 class.
 * @author AnnaNardelli
 *
 */
import java.util.Scanner;

public class TestMagicEightBall1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		MagicEightBall1 m8 = new MagicEightBall1();
		System.out.println("Enter a yes/no question (type \"exit\" to quit): ");
		while(input.hasNextLine()) {
			String in = input.nextLine();
			
			//Exits the program at user's prompt.
			if (in.equalsIgnoreCase("exit")) {
				break;
			}
			
			//Prints answer if user doesn't type exit.
			else {
				System.out.println("Enter a yes/no question (type \"exit\" to quit): ");
				System.out.println(m8.getAnswer());
			}
			
		}
	input.close();	
	}
}
