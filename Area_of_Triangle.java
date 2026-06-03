package Java_01;
import java.util.Scanner;
public class Area_of_Triangle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a,b,c;
        double area;
        float h;
        System.out.println("Enter three sides of triangle :");
        a=scan.nextInt();
        b=scan.nextInt();
        c=scan.nextInt();
        h=(a+b+c)/2f;
        area=Math.sqrt(h*(h-a)*(h-b)*(h-c));
        System.out.println("Area = " + area);
    }
}
