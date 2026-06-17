package Java_01;
import java.util.Scanner;
class Cylinder {
    public double radious;
    public double height;

    public double Curved_Surface_area (){
        return 2*Math.PI*radious*height;
    }

    public double Total_Surface_area () {
        return 2* Math.PI*radious*radious + Curved_Surface_area();
    }
    
    public double Volume() {
        return Math.PI*radious*radious*height;
    }
}
public class Cylinder_Class {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Cylinder c = new Cylinder();
        System.out.println("Enter the radious of cylinder :");
        c.radious = input.nextDouble();
        System.out.println("Enter the height of cylinder :");
        c.height = input.nextDouble();
        System.out.println("Curved surface area : " + c.Curved_Surface_area());
        System.out.println("Total surface area : " + c.Total_Surface_area());
        System.out.println("Volume of cylinder : " + c.Volume());
    }
}
