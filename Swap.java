package Java_01;
import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your first number :");
        byte first = scan.nextByte();
        System.out.println("Enter your second number :");
        byte second = scan.nextByte();
        System.out.println("Before swaping");
        System.out.println("first = " + first );
        System.out.println("Second = " + second);
        System.out.println("After swaping");
        byte temp = first;
        first = second ;
        second = temp;
        System.out.println("First = " + first);
        System.out.println("Second = " + second);
    }
    
}
