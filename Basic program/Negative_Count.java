package Java_01;

public class Negative_Count
{
    public static void main(String[] args)
    {
        int[][] met = {
                {4,3,2,-1},
                {3,2,1,-1},
                {1,1,-1,-2},
                {-1,-1,-2,-3}
        };
        int count = counter(met);
        System.out.println("Total negative number :" + count);
    }
    static int counter(int[][] met)
    {
        int k=0;
        for(int i=met.length-1; i>=0; i--)
        {
            for(int j=met[i].length-1; j>=0; j--)
            {
                if(met[i][j]<0)
                    k++;
            }
        }
        return k;
    }
}