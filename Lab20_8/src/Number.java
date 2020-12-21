import java.util.Scanner;

public class Number {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter a number 1-26: ");
		int num = input.nextInt();
		
		System.out.println("You have entered " + num);
		
		if (num < 1 || num > 26) {
			System.out.println("Invalid Input! Number is outside of acceptable range.");
		} else {
			char letter = (char)(num + 64);
			System.out.println("Character " + num + " of the alphabet is " + letter);
		}
		
	}

}
