import java.util.Scanner;

public class TenAverage {

	public static void main(String[] args) {
		System.out.println("This program will find the average of up to 10 numbers");
		
		Scanner input = new Scanner(System.in);

		int count, total;

		System.out.print("Please choose amount of numbers to average (0-10): ");
		count = input.nextInt();

		total = 0;
		
		for(int i = count; i > 0; i--) {
			System.out.print("Please enter " + (count - i) + " number: ");
			int num = input.nextInt();
			total += num;
		}

		if (count > 0) {
			System.out.println("Average is " + ((double)total/count));
		} else {
			System.out.println("There are no numbers to average.");
		}
	}

}
