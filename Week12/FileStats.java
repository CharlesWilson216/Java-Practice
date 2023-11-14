import java.util.*;
import java.io.*;

public class FileStats {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner input = new Scanner(new File("trashfile.txt"));
		
		inputStats(input);
	}
	public static void inputStats(Scanner input) {

		int lineNum = 0;
		int lineCount = 0;
		int longestToken = 0;
		int tokens = 0;
		String longestLine = "";

		while (input.hasNextLine()) {
			++lineNum;
			String currentLine = input.nextLine();
			if (currentLine.length() > longestLine.length()) {
				longestLine = currentLine;
			}
			Scanner token = new Scanner(currentLine);
			while (token.hasNext()) {
				String word = token.next();
				++tokens;
				if (word.length() > longestToken) {
					longestToken = word.length();
				}
			}
			System.out.println("Line " + lineNum + " has " + tokens + " tokens (longest = " + longestToken + ")");
			tokens = 0;
			longestToken = 0;
		}
		System.out.println("Longest line: " + longestLine);
	}
}


