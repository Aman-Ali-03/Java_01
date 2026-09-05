package Java_01;
import java.util.Scanner;
public class Area {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the height of the triangle :");
        int height = scan.nextInt();
        System.out.print("Enter the base of the triagle :");
        int base = scan.nextInt();
        double area = 0.5*height*base;
        System.out.println("Area of triangle is " + area);
    }
}
