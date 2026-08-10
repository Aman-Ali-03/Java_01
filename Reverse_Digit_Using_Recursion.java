package Java_01;
import java.util.Scanner;
public class Reverse_Digit_Using_Recursion
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number: ");
        int num = sc.nextInt();
        System.out.println(reverser(num));
    }
    static int sum = 0;
    static int reverser(int num)
    {
        if(num==0)
        {
            return 0;
        }
        int temp = num/10,k=1;
        while(temp!=0)
        {
            k*=10;
            temp /= 10;
        }
        return (num%10)*k + reverser(num/10);
    }
}
