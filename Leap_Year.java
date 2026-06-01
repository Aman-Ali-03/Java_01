package Java_01;

import java.util.Scanner;

public class Leap_Year {
    public static void main(String[] args) {
        System.out.print("Enter Your Year :");
        Scanner Scan = new Scanner(System.in);
        short year = Scan.nextShort();
        if (year % 4 == 0) {
            if (year % 400 == 0 || year % 100 != 0) {
                System.out.println(year + "is leap year.");
            }
        } else {
            System.out.println(year + "is not a leap year.");
        }
    }
}
