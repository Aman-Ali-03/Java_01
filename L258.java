package Java_01;
import java.util.Scanner;
public class L258
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number to add digit :");
        int n = sc.nextInt();
        int digit = addDigits(n);
        System.out.println(digit);
    }
    static int addDigits(int num)
    {
        while(num>9)
        {
            int n = 0;
            while (num != 0)
            {
                n += num % 10;
                num /= 10;
            }
            num = n;
        }
        return num;
    }
}
