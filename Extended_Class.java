package Java_01;
import java.util.Scanner;
class circle {
    public double radious;

    public double area(){
        return Math.PI*radious*radious;
    }
    public double circumference(){
        return 2*Math.PI*radious;
    }
}
class cylinder extends circle{
    public double height;

    public double volume(){
        return area()*height;
    }
}
public class Extended_Class {
    public static void main(String[] args){
        System.out.println("Enter the radius and height of the cylinder : ");
        cylinder c = new cylinder();
        Scanner input = new Scanner(System.in);
        c.radious = input.nextDouble();
        c.height = input.nextDouble();

        System.out.println("Volume of the cylinder : " + c.volume());
        System.out.println("Area of circle : " + c.area());
        System.out.println("Circumference of the circle : " + c.circumference());
    }
}
