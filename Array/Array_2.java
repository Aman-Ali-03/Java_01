package Java_01;
import java.util.Arrays;
public class Array_2
{
    public static void main(String[] args)
    {
        int[][] metrix = {
                {1,2,3},{4,5,6},{7,8,9}
        };
        int target = 9;
        int[] index = indexes(metrix,target);
        System.out.println(Arrays.toString(index));
    }
    static int[] indexes(int[][] met,int target)
    {
        int r = 0;
        int c = met.length-1;
        int[] ans = {-1,-1};
        while(r<met.length && c>=0){
            if(target == met[r][c])
            {
                ans[0]=r;ans[1]=c;
                break;
            }
            else if(target>met[r][c])
            {
                r++;
            }
            else{
                c--;
            }
        }
        return ans;
    }
}
