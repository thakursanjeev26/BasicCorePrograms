package CoreProgram;
import java.util.*;

public class LeapYear {
	public static boolean Isleap(int year) {
        int count = digitcount(year);
        if (count != 4) {
            System.out.println("Year must be a four-digit number.");
            return false;
        }
        if (year <= 1582) {
            System.out.println("The Gregorian calendar starts from 1582.");
            return false;
        } else if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println("The year is a leap year.");
            return true;
        } else {
            System.out.println("The year is not a leap year.");
            return false;
        }
    }

    public static int digitcount(int year) {
        int count = 0;
        while (year != 0) {
            year /= 10;
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a year:");
        int year = sc.nextInt();
        sc.close();
        boolean result = Isleap(year);
        System.out.println("Leap year: " + result);
    }
	}
