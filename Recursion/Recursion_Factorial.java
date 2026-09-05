package Java_01;
import java.util.Scanner;
public class Recursion_Factorial
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number to get your factorial: ");
        int num = sc.nextInt();
        int fact = factorial(num);
        System.out.println();
        System.out.println("Factorial: " + fact);
    }
    static int factorial(int num)
    {
        if(num==1)
        {
            return 1;
        }
        return num*factorial(num-1);
    }
}
