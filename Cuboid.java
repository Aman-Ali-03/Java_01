package Java_01;
import java.util.Scanner;
public class Cuboid {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the length of cuboid :");
        short len = scan.nextShort();
        System.out.println("Enter the breath of cuboid :");
        short bre = scan.nextShort();
        System.out.println("Enter the height of cuboid : ");
        short hei = scan.nextShort();
        int area = 2*(len*bre+bre*hei+hei*len);
        int volume = len*hei*bre;
        System.out.println("Area of your cuboid : " + area);
        System.out.println("Volume of your cuboid : " + volume);
    }
}
