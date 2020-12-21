import java.util.Scanner;

public class Multiples {

	public static void main(String[] args) {
		System.out.println("This program prints out multiples of a given number till a specified maximum.");

		Scanner sysIn = new Scanner(System.in);
		
		System.out.print("Please enter the maximum number: ");
		int max = sysIn.nextInt();
		
		System.out.print("Please enter the number whose multiples to print: ");
		int mul = sysIn.nextInt();
		
		System.out.println("Multiples of " + mul + " from 1 till " + max + " are:");
		
		int num = mul;
		
		while (num <= max) {
			if (num % mul == 0) {
				System.out.println("Number " + num);
			}
			num++;
		}
		
		sysIn.close();
	}

}
