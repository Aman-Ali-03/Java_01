package Java_01;
import java.util.Scanner;
class circledetail {
    public double r;

    public double area (){
        return Math.PI * r *r;
    }
    public double perimeter (){
        return 2*Math.PI*r;
    }
    public double circumference(){
        return perimeter();
    }
}
public class Class_Circle {
    public static void main(String args[]){
        System.out.println("Enter the radius of the circle :");
        Scanner input = new Scanner(System.in);
        circledetail c = new circledetail();
        c.r = input.nextDouble();
        System.out.println("The Radius of the circle is : " + c.r);
        System.out.println("The area of the circle is : " + c.area());
        System.out.println("The perimeter of the circle is : " + c.perimeter());
        System.out.println("The circumference of the circle is : " + c.circumference());
        input.close();
    }
}
