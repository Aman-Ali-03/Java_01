package Java_01;
import java.util.Scanner;
public class Quadratic_Equation {
    static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.println("Enter the cofficent of a :");
        byte a = scan.nextByte();
        System.out.println("Enter the cofficent of b :");
        byte b = scan.nextByte();
        System.out.println("Enter the cofficent of c :");
        byte c = scan.nextByte();

        int d = b*b - 4*a*c;
        double root = Math.sqrt(d);
        if(root>0){
            double first = ((-b) + root)/(2*a);
            double second = ((-b) - root)/(2*a);
            System.out.println("First root is : " + first);
            System.out.println("Second root is : " + second);
        }
        else if(root<0){
            System.out.println("The roots are in complex form.");
        }
        else{
            double Same_roots= (-b)/(2*a);
            System.out.println("Both root are same :" + Same_roots);
        }

    }
}
