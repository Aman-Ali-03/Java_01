package Java_01;
import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of term of fibonacci series");
        short n = input.nextShort();
        int a=0,b=1,c;
        System.out.print(a + " " + b + " ");
        for (int i = 1; i <= n; i++) {
            c=a+b;
            System.out.print(c + " ");
            a=b;
            b=c;
        }
        input.close();
    }
}
