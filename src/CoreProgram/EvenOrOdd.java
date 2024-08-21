package CoreProgram;
import java.util.*;
public class EvenOrOdd {
	static void evenOrOdd(int num) {
		if(num%2==0) {
			System.out.println(num+" Is a Even Number");
		}
		else {
			System.out.println(num+" Is a Odd Number");
		}
	}
	
	public static void main(String[]args) {
		Scanner sc= new Scanner (System.in);
		System.out.println("Enter a Number:");
		int num=sc.nextInt();
		sc.close();
		evenOrOdd(num);
	}
}
