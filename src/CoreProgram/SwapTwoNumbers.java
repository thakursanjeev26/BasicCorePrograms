package CoreProgram;
import java.util.*;
public class SwapTwoNumbers {
	static void swap(int num1,int num2) {
		int temp=num1;
		num1=num2;
		num2=temp;
		System.out.println(num1+ " Number after Swapping : "+num1);
		System.out.println(num2+ " Number after Swapping : "+num2);
	}
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number1:");
		int num1=sc.nextInt();
		System.out.println("Enter NUmber2:");
		int num2=sc.nextInt();
		sc.close();
		swap(num1,num2);
	}
}
