import java.util.*;
public class Colors {
	public static void main(String[] args) {

Scanner console = new Scanner(System.in);
System.out.print("What color do you want? ");
String c = console.next();
if(c.equalsIgnoreCase("R")) {
    System.out.println("You have chosen Red.");
} else if(c.equalsIgnoreCase("B")) {
    System.out.println("You have chosen Blue.");
} else if(c.equalsIgnoreCase("G")) {
    System.out.println("You have chosen Green.");
} else {
    System.out.println("Unknown color: " + c);
}
}
}
