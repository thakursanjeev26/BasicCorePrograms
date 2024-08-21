package CoreProgram;
import java.util.*;

public class HeasVsTail {
	
	public static void flip(int num) {
		/* Created a random variable to generate value*/
		Random random = new Random();
		/*initalize the head and tail=0*/
		int head=0;
		int tail=0;
		/*Checks whther input is not negative number*/
		if(num<=0) {
			System.out.println("number cannto be negative");
		}
		
		/*Iteration the loop till the number of time to be flip */
		for(int i=1;i<=num;i++) {
			double flipCoin = random.nextDouble();/*initialize a flipcon to double to grnerate random values between 0 and 1*/
			/*Check whether the coin is head or tail*/
			if(flipCoin<=0.5) {
				tail++;
				/*if the coin is =0.5 we increment the tail*/
			}
			else {
				head++;
				/*else the head is get incemnrted*/
			}
		}
			/*initiazlze a Headpercentage and Tail percentage to double for calculating percentage*/
		  double headPercentage = ((double) head / num) * 100;
	      double tailPercentage = ((double) tail / num) * 100;
	      /*Displaying result*/
		System.out.println("head percentage:"+headPercentage);
		System.out.println("Tail percentage:"+tailPercentage);
	}
	
	/*Main method*/
	public static void main(String[]args) {
		/*Initailize a Scnner*/
		Scanner sc = new Scanner(System.in);
		/*Prompted user to get input*/
		System.out.println("Enter The Number Of Time You Nedd To Flip a Coin:");
		/*initalize num to int to store and read the value*/
		int num = sc.nextInt();
		sc.close();
		/*Called the function*/
		flip(num);
	}
}
