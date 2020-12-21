import java.util.Scanner;

public class Errors6 {

	public static void main(String[] args) {
		System.out.println("This program will ask the user for three sets of two numbers and will calculate the average of each set.");

		Scanner input = new Scanner(System.in);

		int n1, n2;

		System.out.print("Please enter the first number: ");
		n1 = input.nextInt();

		System.out.print("Please enter the second number: ");
		n2 = input.nextInt();

		int average;
		average = (n1 + n2) / 2;
		System.out.println("The average of the numbers is " + average); // Changed to println
		// System.out.print("The average of the numbers is " + average);

		// Removed second initalization
		// Scanner input = new Scanner(System.in);

		float f1, f2; // Changed variable names to not conflict with ints
		// float n1, n2;

		System.out.print("Please enter the first number: "); // Added space after prompt
		// System.out.print("Please enter the first number:");
		f1 = input.nextFloat(); // Changed variable names to match previous change
		// n1 = input.nextFloat();

		System.out.print("Please enter the second number: ");
		f2 = input.nextFloat(); // Changed variable names to match previous change
		// n2 = input.nextFloat(); 

		float floatAvg; // Changed variable names to not conflict with ints
		// float average;
		floatAvg = (f1 + f2) / 2; // Changed variable names to match previous change
		// average = (n1 + n2) / 2;
		System.out.println("The average of the numbers is " + floatAvg); // Changed variable names
																		 // to match previous
																		 // change. 
																		 // Changed to println
		
		// System.out.print("The average of the numbers is " + average);

		short s1, s2;

		System.out.print("Please enter the first number: ");
		s1 = input.nextShort();

		System.out.print("Please enter the second number: ");
		s2 = input.nextShort();

		short shortAvg;
		shortAvg = (short)((s1 + s2) / 2); // Typecast the full operation, change to match names
		// shortAvg = (short)(n1 + n2) / 2;
		System.out.println("The average of the numbers is " + shortAvg); // Changed to println
		// System.out.print("The average of the numbers is " + shortAvg);
	}

}
