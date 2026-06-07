package Java_01;
import java.util.Scanner;
public class Grade {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter five Subject marks :");
        short a1 = scan.nextShort();
        short a2 = scan.nextShort();
        short a3 = scan.nextShort();
        short a4 = scan.nextShort();
        short a5 = scan.nextShort();
        int sum = a1 + a2 + a3 + a4 + a5;
        float per = sum / 5;
        if (per > 90) {
            System.out.println("You are the Excelent student.");
            System.out.println("You achieve " + per + "percentage");
        }
        else if (per < 90 || per >= 80) {
            System.out.println("You are a good student.");
            System.out.println("You achieve " + per + "percentage");
        }
        else if (per < 80 || per >= 60) {
            System.out.println("You are a average student.");
            System.out.println("You achieve only " + per + "percentage");
        }
        else if (per < 60 || per >= 40) {
            System.out.println("You are achieve only " + per + "percentage");
        }
        else {
            System.out.println("You are a dumb student.");
        }
    }
}
