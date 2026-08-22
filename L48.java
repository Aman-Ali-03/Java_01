package Java_01;
public class L48 
{
    public static void main(String[] args)
    {
        int[][] matrix = {
            { 1, 2, 3, 4},
            { 5, 6, 7, 8},
            { 9,10,11,12},
            {13,14,15,16}
        };
        rotate(matrix);
        for(int i=0; i<matrix.length; i++)
        {
            for(int j=0; j<matrix[i].length; j++)
            {
                System.out.print(" "+matrix[i][j]);
            }
            System.out.println();
        }
    }
    static void rotate(int[][] matrix)
    {
        int length = matrix.length;
        int[][] metrix2 = new int[length][length];
        for(int i=0; i<length; i++)
        {
            for(int j=length-1; j>-1; j--)
            {
                metrix2[i][j] = matrix[length-1-j][i];
            }
        }
        for(int i=0; i<length; i++)
        {
            for(int j=0; j<length; j++)
            {
                matrix[i][j] = metrix2[i][j];
            }
        }
    }
}