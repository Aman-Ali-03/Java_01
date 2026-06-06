package Java_01;
import java.util.Scanner;
public class Sum_of_Digit {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = scan.nextInt();
        int sum = 0;
        while(num > 0){
            int rem = num % 10;
            sum = sum + rem;
            num = num / 10;
        }
        
        System.out.println("The sum of the digits is: " + sum);
    }
}

