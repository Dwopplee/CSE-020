import java.util.Scanner; // added import

public class Errors1 {

	public static void main(String[] args) { // added opening curly bracket
	// public static void main(String[] args)
		
		System.out.println("Can you spot and fix the errors?"); // changed single quote to double
																// quote at end of string
		// System.out.println("Can you spot and fix the errors?');

		System.out.print("Enter two numbers and I will "); // changed "println" to "print"
		// System.out.println("Enter two numbers and I will ");
		
		System.out.println("add them for you");

		int n1, n2;

		Scanner keyboard = new Scanner(System.in); // added semicolon at end of line
		// Scanner keyboard = new Scanner(System.in)
		
		n1 = keyboard.nextInt(); // added "keyboard." before "nextInt()"
		// n1 = nextInt();
		
		n2 = keyboard.nextInt(); // added "keyboard." before "nextInt()"
		// n2 = nextint();

		System.out.println("The sum of the numbers is"); // added ".out" after "System"
		// System.println("The sum of the numbers is");
		
		System.out.println(n1 + n2); // changed minus to plus
		// System.out.println(n1 - n2);
	}
}