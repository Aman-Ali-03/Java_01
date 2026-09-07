package Java_01;
import java.util.Scanner;
public class L9
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int num = sc.nextInt();
        boolean p = palin(num);
        System.out.println(p);
    }
    static boolean palin(int x)
    {
        if(x>=0) {
            int temp = x;
            int d = 0;
            while (x != 0) {
                d = (d * 10) + (x % 10);
                x /= 10;
            }
            if (temp == d) {
                return true;
            } else {
                return false;
            }
        }
        else{
            return false;
        }
    }
}
