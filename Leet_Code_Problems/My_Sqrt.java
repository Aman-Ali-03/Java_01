package Java_01;

public class My_Sqrt
{
    public static void main(String[] args)
    {
        int a = 40;
        System.out.printf("%.3f",mysqrt(a));
    }
    static double mysqrt(int x)
    {
        int s = 0;
        int e = x;
        double r = 0;
        while(s<=e)
        {
            int m = s + (e - s) / 2;
            if(m*m==x)
            {
                r = m;
                return m;
            }
            if(m*m<x)
            {
                s = m + 1;
            }
            else
            {
                e = m - 1;
            }
        }
        float inc = 0.1f;
        for(int i=0; i<3; i++)
        {
            while(r*r<x)
            {
                r += inc;
            }
            r -= inc;
            inc /=10;
        }
        return r;
    }
}
