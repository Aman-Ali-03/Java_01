package Java_01;
import java.util.Scanner;
public class salary {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Your name :");
        String name = input.nextLine();
        System.out.println("Please enter your basic salary : ");
        double salary = input.nextDouble();
        double HRA=salary*0.2;
        double DA=salary*0.1;
        double total=salary+HRA+DA;
        System.out.println("Hlw "+name+" your salary is : "+ total);
    }
}
