package Java_01;
import java.util.Scanner;
public class Reverse_Number {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your number :");
        long num = input.nextLong();
        int reversed;
        int sum = 0;
        while(num != 0){
            reversed = (int) (num % 10);
            num = num/10;
            sum = (sum*10) + reversed;

        }
        System.out.println("The Reverse of your number is "+sum);
    }
}
