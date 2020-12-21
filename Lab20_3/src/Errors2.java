import java.util.Scanner;

public class Errors2 {

	public static void main(String[] args) {
		Scanner kbd = new Scanner(System.in);
		int number = 0;
		int theSquare = 0;

		System.out.print("Enter a number and I will "); // added semicolon at end of line
													   // added space at end of string
		// System.out.print("Enter a number and I will")
		
		System.out.print("square it for you: "); // terminated string with double quote
		// System.out.print("square it for you:  );
		
		number =  kbd.nextInt(); // changed "keyboard" to "kbd"
								 // added "()" after "nextInt"
		// number =  keyboard.nextInt;

		theSquare = number * number; // capitalized "s" in "thesquare"
									 // uncommented line
		// // thesquare = number * number;

		System.out.print(number + " squared = "); // added closing parenthesis
		// System.out.print(number + " squared = ";
		
		System.out.println(theSquare); // removed quotation marks around "theSquare"
		// System.out.println("theSquare");
	}
}