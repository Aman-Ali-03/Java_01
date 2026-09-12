package Java_01.Leet_Code_Problems;

public class L240
{
    public static void main(String[] args)
    {
        int[][] a = {{1,4,7,11,15},{2,5,8,12,19},{3,6,9,16,22},{10,13,14,17,24},{18,21,23,26,30}};
        System.out.println(searchMatrix(a,20));
    }
    static boolean searchMatrix(int[][] matrix, int target)
    {
        for(int i=0; i<matrix.length; i++)
        {
            int start = 0;
            int end = matrix[i].length-1;
            while(start<=end)
            {
                int mid = (start+end)/2;
                if((start==end)&&(matrix[i][start]!=target))
                {
                    break;
                }
                if(matrix[i][mid]<target)
                {
                    start = mid+1;
                }
                else if(matrix[i][mid]==target)
                {
                    return true;
                }
                else {
                    end = mid-1;
                }
            }
        }
        return false;
    }
}
