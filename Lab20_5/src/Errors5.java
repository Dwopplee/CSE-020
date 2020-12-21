import java.util.Scanner;

public class Errors5 {

	public static void main(String[] args) {
		Scanner keyboard; // Moved up from farther down the program
		int weight, age; // Moved up from farther down the program

		System.out.print("What is your weight in kg? " );
		keyboard = new Scanner(System.in);
		weight = keyboard.nextInt();

		// Moved the following two lines to beginning of program
		// Scanner keyboard;
		// int weight, age;

		System.out.print("What is your age? ");
		age = keyboard.nextInt();

		System.out.println("Wow! You are " + (int) (age * 6.9) + " in dog years.");
		System.out.println("Your weight in lbs is " + (int) (weight * 2.2) + " with no decimal point");
		// Type casted the full operation, rather than just weight
		// System.out.println("Your weight in lbs is " + (int) weight * 2.2 + " with no decimal point");
	}

}