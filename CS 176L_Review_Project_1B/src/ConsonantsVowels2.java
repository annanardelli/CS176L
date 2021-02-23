/**
 * Calculates the number of punctuation marks, digits, spaces, vowels,
 * and consonants in a String line.
 * 
 * @author AnnaNardelli
 *
 */

import java.util.Scanner;

public class ConsonantsVowels2 {
	
	public static void main(String[] args) {
		
		//Set up variables based on type of character.
		int numberOfPunctuation = 0;
		int numberOfDigits = 0;
		int numberOfSpaces= 0;
		int numberOfVowels = 0;
		int numberOfConsonants = 0;
		
		//Get user input.
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a phrase: ");
		String words = input.nextLine();
		
		//Determine the type of each character and add them to their respective variable.
		for (int i = 0; i < words.length(); i++) {
			char character = words.charAt(i);
			if (character == '.' || character == ',' || character == '-' ||
				character == '!' || character == '\'' || character == '"' ||
				character == ';' ||character == ':') {
				numberOfPunctuation++;
		}
			else if (character == '0' || character == '1' || character == '2' ||
					character == '3' || character == '4' || character == '5' ||
					character == '6' || character == '7' || character == '8' ||
					character == '9') {
				numberOfDigits++;
			}
			
			else if (character == ' ') {
				numberOfSpaces++;
			}
			
			else if (character == 'a' || character == 'A' || character == 'e' ||
					character == 'E' || character == 'i' || character == 'I' ||
					character == 'o' || character == 'O' || character == 'u' ||
					character == 'U') {
				numberOfVowels++;
			}
			else {
				numberOfConsonants++;
			}			
		}
		
		//Print out the values of each variable.
		System.out.println();
		System.out.println("Number of Vowels: " + numberOfVowels);
		System.out.println("Number of Consonants: " + numberOfConsonants);
		System.out.println("Number of Digits: " + numberOfDigits);
		System.out.println("Number of Spaces: " + numberOfSpaces);
		System.out.println("Number of Punctuation Marks: " + numberOfPunctuation);
		input.close();
	}

}
