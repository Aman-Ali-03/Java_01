package Java_01;
import java.util.Scanner;

public class Class {
    static double area(double a, double b){
        return a*b;
    }

    static double area (double r){
        return Math.PI*r*r;
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the radius of the circle :");
        double r = input.nextDouble();
        System.out.println("Area of the cirle :" + area(r));
        System.out.println("Enter the length and breath : ");
        double length = input.nextDouble();
        double breath = input.nextDouble();
        System.out.println("Area of rectangle :" + area(length,breath));
        input.close();
    }
}



