import java.util.*;

public class Name {
	public static void main(String[] args) {
		lastfirst("Marla Singer");
	}
	public static void lastfirst(String name) {
		String last = name.substring(1 + name.indexOf(" "));
		char first = name.charAt(0);

		System.out.println(last + ", " + first + ".");
	}
}


