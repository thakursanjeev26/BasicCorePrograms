package CoreProgram;
import java.util.*;
public class ComputeQuoAndRem {
	static void findQuoandRem(int dividend,int divisor) {
		int quotient = dividend/divisor;
		int reminder = dividend%divisor;
		System.out.println("Quotient is:"+quotient);
		System.out.println("Reminder is:"+reminder);
	}
	public static void main(String[]args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the Dividend:");
		int dividend = sc.nextInt();
		System.out.println("Enter the Divisor:");
		int divisor=sc.nextInt();
		sc.close();
		findQuoandRem(dividend,divisor);
	}
}
