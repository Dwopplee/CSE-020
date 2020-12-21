import java.util.Scanner;

public class AnyAverage {

	public static void main(String[] args) {
		System.out.println("This program will find the average of as many numbers as you like.");
		
		Scanner sysIn = new Scanner(System.in);
		
		System.out.print("Please choose the number of values to average: ");
		int max = sysIn.nextInt();

		int count = 1;
		int sum = 0;
		
		while (count <= max) {
			System.out.print("Please enter the " + count + " number: ");
			sum += sysIn.nextInt();
			count++;
		}
		
		System.out.println("The average of all the numbers is: " + (double) sum / max);
	}

}
