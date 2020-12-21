import java.lang.String;
import java.util.Scanner;

public class Interviewer {

	public static void main(String[] args) {
		Scanner sysIn = new Scanner(System.in);
		String name;
		String home;
		String major;
		int year;
		float height;
		
		System.out.print("What is your name? ");
		name = sysIn.nextLine();
		
		System.out.print("What is your hometown? ");
		home = sysIn.nextLine();
		
		System.out.print("What is your major? ");
		major = sysIn.nextLine();
		
		System.out.print("What year are you in? ");
		year = sysIn.nextInt();
		
		System.out.print("What is your height in inches? ");
		height = sysIn.nextFloat();
		height = height * 2.54f;
		
		System.out.print("So your name is " + name + ". ");
		System.out.print("You are from " + home + ". ");
		System.out.print("You are a " + major + " major in year " + year + ". ");
		System.out.print("Your height in centimeters is " + height + " cm.");
		
		sysIn.close();
	}

}