package Java_01;
import java.util.Scanner;
public class Hexa {
    public static void main(String[] args) {
        System.out.println("Enter your Hexa-Decimal form :");
        Scanner scan = new Scanner(System.in);
        String hexa = scan.nextLine();
        if(hexa.matches("[0-9A-F]+")){
            System.out.println("Entered form is correct");
        }
        else{
            System.out.println("Entered form is incorrect");
        }
    }
}
