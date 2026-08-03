package Java_01;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import static java.lang.Math.pow;
public class Binary_to_Decimal
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter you binary number: ");
        long binary = sc.nextLong();
        int decimal = BtoD(binary);
        System.out.println(decimal);
    }
    static int BtoD(long a)
    {
        int sum=0;
        List<Integer> l = new ArrayList<>();
        while(a!=0)
        {
            l.add((int)a%10);
            a /=10;
        }
        for(int i=0; i<l.toArray().length; i++)
        {
            if(l.get(i)==1)
            {
                sum += pow(2,i);
            }
        }
        return sum;
    }
}
