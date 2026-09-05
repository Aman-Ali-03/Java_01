package Java_01;
import java.util.Scanner;
class rectangleA {
    public int length;
    public int breath;

    public int area(){
        return length * breath;
    }
    public int perimeter(){
        return 2*(length+breath);
    }
    public boolean check(){
        if(length == breath){
            return true;
        }
        else{
            return false;
        }
    }
}
public class Rectangle {
    public static void main(String[] args) {
        rectangleA r = new rectangleA();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length of the rectangle : ");
        r.length = input.nextInt();
        System.out.println("Enter the breath of the rectangle : ");
        r.breath = input.nextInt();
        System.out.println("Length : " + r.length);
        System.out.println("Breath : " + r.breath);
        System.out.println("Area : " + r.area());
        System.out.println("Perimeter : " + r.perimeter());
        System.out.println("It is a square : " + r.check());
        input.close();
    }
}
