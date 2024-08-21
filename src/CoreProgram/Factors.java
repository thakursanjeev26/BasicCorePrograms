package CoreProgram;
import java.util.*;

public class Factors {
	static void getfactors(int num) {
		for(int i=1;i*i<=num;i++) {
			if(num%i==0) {
				System.out.println(i+" ");
				
			}
		}
	}
	
	public static void main(String[]args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter The Number:");
		int num = sc.nextInt();
		sc.close();
		getfactors(num);
	}
}
