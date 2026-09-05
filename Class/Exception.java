package Java_01;
import java.util.Scanner;
public class Exception {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int a,b,c;
        System.out.println("Enter numerator or denominator : ");
        a = input.nextInt();
        b = input.nextInt();
        try {
            c = a / b;
            System.out.println("Answer is : " + c);
        }
        catch(ArithmeticException e){
            System.out.println("The denominator should not be zero.");
        }
    }

}
