import java.util.Scanner;

public class MultiplesFor {

	public static void main(String[] args) {
		System.out.println("This program prints out multiples of a base number till a specified maximum.");
		
		Scanner sysIn = new Scanner(System.in);
		
		System.out.print("Please enter the maximum number: ");
		int max = sysIn.nextInt();
		
		System.out.print("Please enter the base number whose multiples to print: ");
		int base = sysIn.nextInt();
		
		System.out.println("Multiples of " + base + " from 1 till " + 25 + " are:");
		for(int i = base; i < max; i++) {
			if (i % base == 0) {
				System.out.println("Number " + i);
			}
		}
	
		sysIn.close();
	}

}
