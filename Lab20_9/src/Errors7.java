import java.util.Scanner;

public class Errors7 {

	public static void main(String[] args) {

		System.out.println("*** This program will find the average of 5 numbers ***");

		Scanner input = new Scanner(System.in);

		int n0 = 0, n1 = 0, n2 = 0, n3 = 0, n4 = 0;

		System.out.print("Please enter the 0th number: ");
		n0 = input.nextInt();

		System.out.print("Please enter the 1st number: ");
		n1 = input.nextInt();
		
		// Changed all following assignments to match number
		System.out.print("Please enter the 2nd number: ");
		// n1 = input.nextInt();
		n2 = input.nextInt();

		System.out.print("Please enter the 3rd number: ");
		// n1 = input.nextInt();
		n3 = input.nextInt();

		System.out.print("Please enter the 4th number: ");
		// n1 = input.nextInt();
		n4 = input.nextInt();

		System.out.println("The average of 5 numbers is " + (double)(n0 + n1 + n2 + n3 + n4)/5);
		
		// Only add up positive numbers and take the average
		int total = 0, count = 0;
		
		// There's a lot wrong with this; I'll just rewrite it.
		/*
		if (n0 > 0) {
			total = n0;
			count = 1;
		} else if (n1 > 0) {
			total = n1;
			count = 1;
		} else if (n2 > 0) {
			total = total + n2;
			count = 1;
		} else if (n3 > 0) {
			total = total + n3;
			count += 1;
		} else {
			total = total + n4;
			count++;
		}
		*/
		
		if (n0 > 0) {
			total += n0;
			count++;
		}
		if (n1 > 0) {
			total += n1;
			count++;
		}
		if (n2 > 0) {
			total += n2;
			count++;
		}
		if (n3 > 0) {
			total += n3;
			count++;
		}
		if (n4 > 0) {
			total += n4;
			count++;
		}
		
		// Created if statement and moved exisiting print into it.
		if (total != 0) {
			System.out.println("Average of the positive numbers is " + (double)total/count);
		} else {
			System.out.println("None of the numbers were positive.");
		}
		
		
	}
}
