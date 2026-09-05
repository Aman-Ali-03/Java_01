package Java_01;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
public class Decimal_To_Binary
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your decimal number :");
        int dec = sc.nextInt();
        ArrayList al = DtoB(dec);
        System.out.println(Arrays.toString(al.reversed().toArray()));
    }
    static ArrayList DtoB(int d)
    {
        ArrayList<Integer> al = new ArrayList<>();
        while(d!=0 &&d!=1)
        {
            al.add(d%2);
            d = d/2;
            switch (d)
            {
                case 0:
                    al.add(0);
                    break;
                case 1:
                    al.add(1);
                    break;
            }
        }
        return al;
    }
}
