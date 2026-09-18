package Java_01.Leet_Code_Problems;
import java.lang.Math;
public class L231
{
    public static void main()
    {
        int num = 128;
        System.out.println("It is a perfect square :" + isPowerOfTwo(num));
    }
    static boolean isPowerOfTwo(int n)
    {
        for(int i=0; i<Math.sqrt(n)+1; i++)
        {
            if(Math.pow(2,i)==n)
            {
                return true;
            }
        }
        return false;
    }
}