package Java_01;
import java.util.Scanner;
public class Count_Digits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your number :");
        long num = input.nextLong();
        byte count = 0;
        while(num != 0){
            num = num/10;
            count++;
        }
        System.out.println("The number of your digit is "+count);
    }
}
