import java.util.Scanner;

public class Errors3 { // added opening curly bracket
// public class Errors3

	public static void main(String[] args) {
		Scanner kbd = new Scanner(System.in); // enclosed "System.in" with parentheses
		// Scanner kbd = new Scanner System.in;
		
		int numerator; // changed "I" to "i" in "int"
		// Int numerator;
		
		int denominator; // changed "integer" to "int"
		// integer denominator;

		System.out.println("This program divides two numbers."); // added ".out" after "System"
		// System.println("This program divides two numbers.");
		
		System.out.print("Enter the numerator: "); // added ".out" after "System"
		// System.print("Enter the numerator: ");
		
		numerator = kbd.nextInt();
		System.out.print("Enter the denominator: ");
		
		denominator = kbd.nextInt(); // spelled "denominator" correctly
		// denomintaor = kbd.nextInt();

		System.out.print(numerator); // capitalized "s" in "System"
		// system.out.print(numerator);
		
		System.out.print("/");
		
		System.out.print(denominator); // capitalized "s" in "System"
									   // changed "P" to "p" in "print"
		// system.out.Print(denominator);
		
		System.out.print(" = ");
		
		System.out.println((double) numerator/denominator); // changed "P" to "p" in "println"
		// System.out.Println((double) numerator/denominator);
	}
} // added closing curly bracket
