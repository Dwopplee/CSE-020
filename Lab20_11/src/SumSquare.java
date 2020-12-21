import java.util.Scanner;

public class SumSquare {

	public static void main(String[] args) {
		Scanner sysIn = new Scanner(System.in);
		
		System.out.print("Please enter the maximum number: ");
		int max = sysIn.nextInt();
		
		int sum = 0;
		
		for (int i = 1; i <= max; i++) {
			int sqr = i * i;
			System.out.println("Number " + i + " squared is " + sqr);
			
			sum += sqr;
		}
		
		System.out.println("The sum of squares of all numbers from 1 till 3 is: " + sum);
		
		sysIn.close();
	}

}
