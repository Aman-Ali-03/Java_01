package Java_01;
import java.util.Scanner;
public class Recursion_Sum
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number: ");
        int num = sc.nextInt();
        int sum = digi(num);
        System.out.println(sum);
    }
    static int digi(int num)
    {
        if(num==0)
        {
            return 0;
        }

        return num%10 + digi(num/10);
    }
}
