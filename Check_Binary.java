package Java_01;
import java.util.Scanner;
public class Check_Binary {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your binary number :");
        String str = scan.next();
        if(str.matches("[01]*")){
            System.out.println("It is in binary form");
        }
        else{
            System.out.println("It is not in binary form");
        }
    }
}
