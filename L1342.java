package Java_01;

public class L1342
{
    public static void main(String[] args)
    {
        int n = 59;
        System.out.println(numberOfSteps(n));
    }
    static int numberOfSteps(int num)
    {
        if(num==0)
        {
            return 0;
        }
        if(num%2==0)
        {
            num /= 2;
            return 1 + numberOfSteps(num);
        }
        else
        {
            num -= 1;
            return 1 + numberOfSteps(num);
        }
    }
}
