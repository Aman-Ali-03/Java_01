package Java_01;
import java.util.Scanner;
public class Option_Calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your first number :");
        short first = scan.nextShort();
        System.out.print("Enter your second number :");
        short second = scan.nextShort();
        System.out.println("1. Add your Numbers.");
        System.out.println("2. Subtract your Numbers.");
        System.out.println("3. Multiply your Numbers.");
        System.out.println("4. Divide your Numbers.");
        System.out.print("Enter your option :");
        int option = scan.nextInt();
        switch(option){
            case 1:
                System.out.println("Addition of your number : " + (first+second));
                break;
            case 2:
                System.out.println("Subtraction first-second : " + (first-second));
                break;
            case 3:
                System.out.println("Multiplication of your number : " + (first*second));
                break;
            case 4:
                System.out.println("Division first/second : " + (first/second));
                break;
            default:
                System.out.println("Invalid option");
        }
        
    }

}
