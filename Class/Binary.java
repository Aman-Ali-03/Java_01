package Java_01;
import java.util.Scanner;

public class Binary {
    public static void main(String[] args) {
        System.out.println("Enter Your Number :");
        Scanner s = new Scanner(System.in);
        int number = s .nextInt();
        System.out.print(number + "In Binary :");
        System.out.println(Integer.toBinaryString(number));
    }
}
