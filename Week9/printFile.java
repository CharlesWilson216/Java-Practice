import java.util.*;
import java.io.*;

public class printFile {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner console = new Scanner(System.in);

		System.out.print("Type a file name: ");
		String filename = console.nextLine();
//		filename = "\"" + filename + "\"";

		Scanner readme = new Scanner(new File(filename));

		while (readme.hasNextLine()) {
			System.out.println(readme.nextLine());
		}
	//	System.out.println(filename);
	}
}
