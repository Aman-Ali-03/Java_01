package Java_01;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
public class L412
{
    public static void main(String[] args)
    {
        int n = 15;
        List<String> fb = fizzBuzz(n);
        System.out.println(Arrays.toString(fb.toArray()));
    }
    static List<String> fizzBuzz(int n)
    {
        List<String> fb = new ArrayList<>();
        for(int i=1; i<=n; i++)
        {
            if(i%3==0 && i%5 == 0)
            {
                fb.add("FizzBuzz");
            } else if (i%3==0)
            {
                fb.add("Fizz");
            } else if (i%5==0) {
                fb.add("Buzz");
            }
            else {
                fb.add(i+"");
            }
        }
        return fb;
    }
}
