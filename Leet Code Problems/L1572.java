package Java_01;

public class L1572
{
    public static void main(String[] args)
    {
        int[][] a = {
                {1,1,1,1},
                {1,1,1,1},
                {1,1,1,1},
                {1,1,1,1}
        };
        int sum =diagonalSum(a);
        System.out.println(sum);
    }
    static int diagonalSum(int[][] mat)
    {
        int sum = 0;
        for(int i=0; i<mat.length; i++)
        {
            for(int j=0; j<mat[i].length; j++)
            {
                if(i==j)
                {
                    sum += mat[i][j];
                }
            }
        }
        for(int i=mat.length-1; i>=0; i--)
        {
            sum += mat[i][mat.length-1-i];
        }
        if(mat.length%2!=0)
        {
            sum -= mat[mat.length/2][mat.length/2];
        }
        return sum;
    }
}
