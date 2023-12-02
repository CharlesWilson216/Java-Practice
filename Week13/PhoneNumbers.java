import java.util.*;

public class PhoneNumbers
{
	public static void main(String[] args) 
	{
		/* Two parallel arrays to hold phone numbers and names
			ith name matches ith phone number; 0 indicates number unknown
			the L tag at the end of the numbers makes them a java long primitive type
			(necessary to fit 10 digits)
			You may extend these arrays but DO NOT modify the types
		 */
		long[] numbers = {9876543210L, 0, 3129152000L, 9094567890L, 3034061234L, 0, 0, 8133774578L};
		String[] names = {"Adam Smith", "George Washington", "Alexander Hamilton", "Thomas Payne",
							"Betsy Ross", "Martha Washington", "Deborah Sampson", "Patience Wright"};

		updateNumbers(numbers, names);
		showPhoneNumbers(numbers, names);

	}

	/**
	 * Ask the user to update zero or more phone numbers using a Scanner170 object. User enters name
	 * of person, if that person found in people parameter, then allow update of corresponding phone number
	 * in phoneNumbers parameter.
	 *
	 * Loop asking for names for which to update the phone number until user enters *Done*
	 *
	 * @param phoneNumbers - array of phone numbers in order matching names (0 indicates number unknown)
	 * @param people - array of people names in same order as phone numbers
	 * @return boolean true if any numbers were changed; false if no numbers changed successfully (for
	 * 			example if user never enters a name found in people
	 *
	 *		-A boolean return value is established and set to false (it will only be changed to true if ihe if statement is true and a number is changed
	 *		-So long as the user doesn't type "Done" the code will continue to prompt them for a name
	 *		-If the user enters a name that doesn't exist in the directory the code will prompt them for a name again
	 *		-When a valid name is entered the for loop finds the corresponding number and changes it to whatever the user entered
	 *
	 */
	public static boolean updateNumbers(long[] phoneNumbers, String[] people) {
		//TODO:  write your code here
		Scanner console = new Scanner(System.in);
		boolean result = false;
		System.out.print("You may update zero or more phone numbers. Type the name of the person whose phone number you would like to update: ");
		String name = console.nextLine();
		while (!(name.equals("Done"))) {
			for (int i = 0; i < people.length; ++i) {
				if (name.equals(people[i])) {
					System.out.print("Please enter the new number for " + name + ": ");
					phoneNumbers[i] = console.nextLong();
					result = true;
				}
			}
			System.out.print("Type the name of the person whose phone number you would like to update: ");
			name = console.nextLine();
		}
		return result;
	}

	/**
	 * Show the full set of names and phone numbers in the format indicated in the assignment
	 * (Display them to the console)
	 *
	 * @param phoneNumbers- array of phone numbers in order matching names (0 indicates number unknown)
	 * @param people- array of people names in same order as phone numbers
	 *		
	 *		-A String nums is created to hold the value of the phone number so it can be manipulated with the String method substring. 
	 *		-A for loop is used to iterate through each person, depending on the lenght of their name it's necessary to print two tabs the format the walls correctly
	 *		-a test is run to see if the phoneNumber[i] value is 0; if so then the comptuer prints out unknown
	 */
	public static void showPhoneNumbers(long[] phoneNumbers, String[] people) {
		String nums;
		System.out.println("Current Phone Directory:");
		for (int i = 0; i < phoneNumbers.length; ++i) {
			nums = String.valueOf(phoneNumbers[i]);
			if (people[i].length() <= 12) {
				System.out.print("| " + people[i] + "\t\t|");
				if (phoneNumbers[i] == 0) {
					System.out.print("   *Unknown*    |");
				} else {
					System.out.print(" (" + nums.substring(0, 3) + ") " + nums.substring(3, 6) + "-" + nums.substring(6, 10) + " |");
				}
			} else {
				System.out.print("| " + people[i] + "\t|");
				if (phoneNumbers[i] == 0) {
					System.out.print("   *Unknown*    |");
				} else {
					System.out.print(" (" + nums.substring(0, 3) + ") " + nums.substring(3, 6) + "-" + nums.substring(6, 10) + " |");
				}
			}
			System.out.println();
		}
	}
}
