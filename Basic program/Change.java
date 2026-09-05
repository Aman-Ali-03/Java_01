package Java_01;
import java.util.Scanner;
public class Change {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your first number :");
        int first = scan.nextInt();
        System.out.print("Enter your second number :");
        int second = scan.nextInt();
        System.out.println("Before Swap ");
        System.out.println("first = " + first);
        System.out.println("Second = " + second );
        System.out.println("After swap ");
        first = first+second;
        second = first - second ;
        first = first - second ;
        System.out.println("First = " + first);
        System.out.println("Second = " + second);

    }
}
