import java.util.Scanner;

public class SumAll {

	public static void main(String[] args) {
		System.out.println("This program will find the sum of all numbers till a specified maximum.");
		
		Scanner sysIn = new Scanner(System.in);
		
		System.out.print("Please enter the max amount of numbers to add: ");
		int max = sysIn.nextInt();

		int num = 0;
		int sum = 0;
		
		while (num <= max) {
			System.out.println("Number " + num);
			sum += num;
			num++;
		}
		
		System.out.println("The sum of all numbers from 0 till " + max + " is: " + sum);
	}

}
