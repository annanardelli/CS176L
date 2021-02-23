/**
 * Tests the MagicEightBall2 class.
 * @author AnnaNardelli
 *
 */

import  java.util.Scanner;

public class TestMagicEightBall2 {
	
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		MagicEightBall2 m8 = new MagicEightBall2();
		System.out.println("Enter a yes/no question (type \"exit\" to quit "
				+ "or \"list\" to list all possible answers): ");
		
		while(input.hasNextLine()) {
			String in = input.nextLine();
			
			//Causes program to exit at user's prompt.
			if (in.equalsIgnoreCase("exit")) {
				break;
			}
			
			//Calls listAnswers method at user's prompt.
			else {
				if (in.equalsIgnoreCase("list")) {
					m8.listAnswers();
					System.out.println("Enter a yes/no question (type \"exit\" to quit"
							+ "or \"list\" to list all possible answers): ");
					continue;
				}
				
				//Prints out an answer if the user doesn't type exit or list.
				System.out.println(m8.getAnswer());
				System.out.println("Enter a yes/no question (type \"exit\" to quit"
						+ "or \"list\" to list all possible answers): ");
			}
			
		}
	input.close();	
	}
}
