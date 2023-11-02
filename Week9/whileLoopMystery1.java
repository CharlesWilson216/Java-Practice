import java.util.*;

public class whileLoopMystery1 {
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);

		int a = console.nextInt();
		mystery(a);
	}
	public static void mystery(int x) {
		int y = 1; 
		int z = 0;
		while (2 * y <= x) {
			y = y * 2;
			++z;
		}
		System.out.println(y + " " + z);
	}
}
