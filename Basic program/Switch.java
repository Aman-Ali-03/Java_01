package Java_01;
import java.util.Scanner;
public class Switch {
    public static void main(String[] args) {
        System.out.println("Enter your Number :");
        Scanner scan = new Scanner(System.in);
        short num = scan.nextShort();
        switch(num%2){
            case 0:
                System.out.println("Enter number is even.");
                break;
            default:
                System.out.println("Enter number is odd.");
        }
    }
}
