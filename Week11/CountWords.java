import java.util.*;

public class CountWords {
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);

		int count1 = countValidWords(console, 'a', 'k');
		System.out.println("You typed " + count1 + " valid words");

		int count2 = countValidWords(console, 'Z', 'q');
		System.out.println("You typed " + count2 + " valid words");

		int count3 = countValidWords(console, '*', 'b');
		System.out.println("You typed " + count3 + " valid words");
	}
	public static int countValidWords(Scanner console, char bound1, char bound2) {
		
		/* -This program accepts input from the user and returns a count of the amount of words the user typed that are between the parameters
		 	First the program promtpts the user to enter the input
		 	The int array is declared and initialized to hold all of the numerical values of non chars
		 	The int array is compared to the parameters to see if the parameters are legal for the program
		 	both parameters are set to lower case for the program to be case insensitive
			The program then checks to test what the range of characters will be in an if statement
			if the second parameter is less than the first's numerical value they switch values
			another int array is made to hold all the values of chars in the range of valid characters
			a do statement collects the user's words into a string and finds the numerical value of the first character
			then it compares its numerical value to all valid first letters, if it finds a match it adds to count
			it will also test if the user entered a word that starts with a non character
			if they did then the program returns the value of count and stops running
		 	*/
		char storage;
		int count = 0;

		System.out.println("This is a program that will count the amount of words you type that include all characters from " + bound1 + " to " + bound2);
		System.out.println("If you type a word that begins with anything other than a letter then the program will stop and return the count.");
		System.out.print("You may begin typing here: ");

		//these lines create and intialize the array of all non characters
		int[] nonchars = new int[69];
		int z= 32;

		for (int k = 0; k < 65; ++k) {
			nonchars[k] = z;
			++z;
		}
		z = 123;
		for (int m = 65; m < 69; ++m) {
			nonchars[m] = z;
			++z;
		}
		//both parameters are set to lower case for the sake of case insensitivity
		bound1 = Character.toLowerCase(bound1);
		bound2 = Character.toLowerCase(bound1);

		//the code tests whether the parameters are letters
		for (int f = 0; f < 69; ++f) {
			if (bound1 == nonchars[f] || bound2 == nonchars[f]) {
				throw new IllegalArgumentException("Please enter a valid letter.");
			}
		}

		//this sets bound 1 to always be the smaller char
		if (bound1 > bound2) {
			storage = bound1;
			bound1 = bound2;
			bound2 = storage;
		}
		//here is the initialization of the array which stores all values of valid first letters
		int[] range = new int[bound2 - bound1 + 1];
		int j = bound1;

		for (int i = 0; i <= bound2 - bound1; ++i) {
			range[i] = j;
			++j;
		}

		//each word is saved in a string, then the first letter is compared to the valid first letters and noncharacters
		do {
			String word = console.next();
			word = word.toLowerCase();
			int firstLetterValue = (int) (word.charAt(0));

			for (int n = 0; n <= bound2 - bound1; ++n) {
				if (range[n] == firstLetterValue) {
					++count;
				}
			}
			for (int x = 0; x < 69; ++x) {
				if (nonchars[x] == firstLetterValue) {
					return count;
				}
			}
		} while (count >= 0);
		
		return count;
	}
}

