package CoreProgram;
import java.util.*;
public class PowerOf2 {
	
	public static int power(int p) {
		if(0<=p && p<=31) {
			int val=1;
			for(int i=1;i<=p;i++) {
				val*=2;
				System.out.println(2+"^"+ i +" = "+val);
			}
			return val;
		}
		else {
			System.out.println("2^31 overflows an int");
		}
		return p;
	}
	public static void main(String[]args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter value of power ");
		int p=sc.nextInt();
		sc.close();
		int result=power(p);
		System.out.println(result);
		
	}
}
    