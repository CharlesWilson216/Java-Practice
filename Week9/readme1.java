import java.util.*; 
import java.io.*;

public class readme1 {
	public static void main(String[] args) throws FileNotFoundException {	
		File f = new File("readme.txt");
		Scanner input = new Scanner(f);
		int count = 0;
		while (input.hasNextInt()) {
			System.out.println("input: " + input.nextInt());
			count++;
		}
		System.out.println(count + " total");
	}
}
