import java.util.Scanner;

public class Manipulate {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Input two integers:");
		
		int n1 = kb.nextInt();
		int n2 = kb.nextInt();
		
		int sum12 = n1 + n2;
		int diff12 = n1 - n2;
		int prod12 = n1 * n2;
		int div12 = n1 / n2;
		int mod12 = n1 % n2;
		
		System.out.println("Sum of " + n1 + " and " + n2 + " is " + sum12);
		System.out.println("Difference of " + n1 + " and " + n2 + " is " + diff12);
		System.out.println("Product of " + n1 + " and " + n2 + " is " + prod12);
		System.out.println("Integer cast of (" + n1 + " / " + n2 + ") is " + div12);
		System.out.println("Integer cast of (" + n1 + " % " + n2 + ") is " + mod12);
		
		System.out.println("\nInput two shorts (-32,768 to 32,767):");
		
		short n3 = kb.nextShort();
		short n4 = kb.nextShort();
		
		short sum34 = (short)(n3 + n4);
		short diff34 = (short)(n3 - n4);
		short prod34 = (short)(n3 * n4);
		short div34 = (short)(n3 / n4);
		short mod34 = (short)(n3 % n4);
		
		System.out.println("Sum of " + n3 + " and " + n4 + " is " + sum34);
		System.out.println("Difference of " + n3 + " and " + n4 + " is " + diff34);
		System.out.println("Product of " + n3 + " and " + n4 + " is " + prod34);
		System.out.println("Short cast of (" + n3 + " / " + n4 + ") is " + div34);
		System.out.println("Short cast of (" + n3 + " % " + n4 + ") is " + mod34);
		
		System.out.println("\nInput two floating points:");
		
		float n5 = kb.nextFloat();
		float n6 = kb.nextFloat();
		
		float sum56 = n5 + n6;
		float diff56 = n5 - n6;
		float prod56 = n5 * n6;
		float div56 = n5 / n6;
		float mod56 = n5 % n6;
		
		System.out.println("Sum of " + n5 + " and " + n6 + " is " + sum56);
		System.out.println("Difference of " + n5 + " and " + n6 + " is " + diff56);
		System.out.println("Product of " + n5 + " and " + n6 + " is " + prod56);
		System.out.println("FLoat cast of (" + n5 + " / " + n6 + ") is " + div56);
		System.out.println("Float cast of (" + n5 + " % " + n6 + ") is " + mod56);
		
		System.out.println("\nInput two doubles:");
		
		double n7 = kb.nextDouble();
		double n8 = kb.nextDouble();
		
		double sum78 = n7 + n8;
		double diff78 = n7 - n8;
		double prod78 = n7 * n8;
		double div78 = n7 / n8;
		double mod78 = n7 % n8;
		
		System.out.println("Sum of " + n7 + " and " + n8 + " is " + sum78);
		System.out.println("Difference of " + n7 + " and " + n8 + " is " + diff78);
		System.out.println("Product of " + n7 + " and " + n8 + " is " + prod78);
		System.out.println("Double cast of (" + n7 + " / " + n8 + ") is " + div78);
		System.out.println("Double cast of (" + n7 + " % " + n8 + ") is " + mod78);
		
		kb.close();
	}

}
