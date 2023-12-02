import java.util.*;
import java.io.*;

public class WordCount {
	public static void main(String[] args) throws FileNotFoundException {
		//This program counts the number of words, lines, and total characters in the hamlet.txt file
		
		int lineCount = 0;
		int wordCount = 0;
		int charCount = 0;

		Scanner hamlet = new Scanner(new File("hamlet.txt"));

		while (hamlet.hasNextLine()) {
			++lineCount;
			Scanner line = new Scanner(hamlet.nextLine());
			while(line.hasNext()) {
				++wordCount;
				String word = line.next();
				charCount = charCount + word.length();
			}
		}
		System.out.println("This file contains " + wordCount + " words, " + lineCount + " lines, and " + charCount + " characters");
	}
}



