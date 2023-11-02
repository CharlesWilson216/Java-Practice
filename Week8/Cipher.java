import java.util.*;

public class Cipher {
	public static void main(String[] args) {
		Scanner Console = new Scanner(System.in);

		// Collect the message and encoding key into variables to be passed in the ceasarCipher() method

		System.out.print("Your message? ");
		String message = Console.nextLine();

		System.out.print("Encoding Key? ");
		int key = Console.nextInt();

		ceasarCipher(message, key);
		
	}
	public static void ceasarCipher(String inputMessage, int shift) {
		
		//Create new variable currentChar to store the character to be manipulated in the for loop

		char currentChar;
		inputMessage = inputMessage.toUpperCase();
		
		System.out.print("Your message: ");
	
		//iterate through each element of the string
		for (int i = 0; i < inputMessage.length(); ++i) {

			//so long as the character being tested is between 'A' and 'Z' run this code
			if (inputMessage.charAt(i) >= 'A' && inputMessage.charAt(i) <= 'Z') {
				
				//add the shift to the character of the current index and save that character in currentChar
				currentChar = (char) (inputMessage.charAt(i) + shift);

				//test if currentChar has gone out of the alphabet and cycle it back around so it only prints characters in the alphabet
				if (currentChar > 'Z') {
					currentChar = (char) ((currentChar - 'Z') + 'A' - 1);
				}
				if (currentChar < 'A') {
					currentChar = (char) ('Z' - ('A' - currentChar) + 1);
				}

				//print the results of currentChar
				System.out.print(currentChar);

			// if the element of the string was not a character between 'A' and 'Z' then it is a space; print a space
			} else {
				System.out.print(" ");
			}
		}
		System.out.println();
	}
}
