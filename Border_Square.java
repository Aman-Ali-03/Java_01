package Java_01;

public class Border_Square
{
    public static void main(String[] args)
    {
        print(5);
    }
    static void print(int n)
    {
        int N = 2*n;
        for(int i=1; i<2*n; i++)
        {
            for(int j=1; j<2*n; j++)
            {
                int num = Math.min(Math.min(i,j),Math.min(N-i,N-j));
                System.out.print(n-num + " ");
            }
            System.out.println();
        }
    }
}
