
package Java_01;
import java.util.Scanner;
public class Currency_Converter {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to Cunverter \n");
        System.out.println("1. Indian Rupees to US Dollars.");
        System.out.println("2. US Dollars to Indian Rupees.");
        System.out.println("3. Indian Rupees to Euro.");
        System.out.println("4. Euro to Indian Rupees.");
        System.out.println("5. Indian Rupees to Pakistan Rupees.");
        System.out.println("6. Pakistan Rupees to Indian Rupees.\n");
        byte choice ;
        System.out.println("Enter your choice.");
        choice = scan.nextByte();
        double a,b;
        switch(choice){
            case 1:
                System.out.println("Enter Rupees :");
                a=scan.nextDouble();
                b=a*0.011;
                System.out.println("In US dollars : " + b);
                break;
            case 2:
                System.out.println("Enter Dollars :");
                a=scan.nextDouble();
                b=a/0.011;
                System.out.println("In Indian Rupees : " + b);
                break;
            case 3:
                System.out.println("Enter Rupees :");
                a=scan.nextDouble();
                b=a*0.0093;
                System.out.println("In Euro : " + b);
                break;
            case 4:
                System.out.println("Enter Euro :");
                a=scan.nextDouble();
                b=a/0.0093;
                System.out.println("In Indian Rupees : " + b);
                break;
            case 5:
                System.out.println("Enter Rupees : ");
                a=scan.nextDouble();
                b=a*2.95;
                System.out.println("In Pakistan Rupees : " + b);
                break;
            case 6:
                System.out.println("Enter Pakistan Rupees : ");
                a=scan.nextDouble();
                b=a/2.95;
                System.out.println("In Indian Rupees : " + b);
                break;
            default:
                System.out.println("Invalid choice.");
        }

    }
}
