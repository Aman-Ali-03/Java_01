package Java_01;
import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your number :");
        long num = input.nextLong();
        int reversed;
        int sum = 0;
        long Temp = num;
        while(num != 0){
            reversed = (int) (num % 10);
            num = num/10;
            sum = (sum*10) + reversed;

        }
        if(sum == Temp){
            System.out.println("Enter number is Palindrome number :" + Temp);
        }
        else{
            System.out.println("Enter number is Not Palindrome number :" + Temp);
        }
    }
}
