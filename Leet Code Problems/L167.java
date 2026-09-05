package Java_01;
import java.util.Arrays;
public class L167
{
    public static void main(String[] args)
    {
        int[] num = {3,2,4,5,8,9};
        int ter = 17;
        int[] n = inde(num,ter);
        System.out.println(Arrays.toString(n));
    }
    static int[] inde (int[] numbers,int target)
    {
        for(int i=0; i<numbers.length; i++)
        {
            for(int j=(i+1); j<numbers.length; j++)
            {
                if((numbers[i]+numbers[j])==target)
                {
                    int[] a = {i+1,j+1};
                    return a;
                }
            }
        }
        return numbers;
    }
}
