package Java_01;
import java.util.Scanner;

public class Calculator{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your first number :");
        short first = scan.nextShort();
        System.out.print("Enter your second number :");
        short second = scan.nextShort();
        System.out.print("Enter your operator :");
        char operator = scan.next().charAt(0);
        switch(operator){
            case '+':
                System.out.println("Addition of your number : " + (first+second));
                break;
            case '-':
                System.out.println("Subtraction first-second : " + (first-second));
                break;
            case '*':
                System.out.println("Multiplication of your number : " + (first*second));
                break;
            case '/':
                System.out.println("Division first/second : " + (first/second));
                break;
            default:
                System.out.println("Invalid operator");
        }
    }
}