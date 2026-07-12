package Java_01;
import java.util.Arrays;
//[[1,3,5,7],[10,11,16,20],[23,30,34,60]]
public class Binary_2D_Array
{
    public static void main(String[] args) {
        int[][] met = {
                {1,3,5,7},{10,11,16,20},{23,30,34,60}
        };
        int target = 7;
        int[] inde = indexes(met,target);
        System.out.println(Arrays.toString(inde));
    }
    static int[] indexes(int[][] met,int target)
    {
        int rs = 0;
        int re = met.length-1;
        int ce = met.length-1;
        int[] ans = {-1,-1};
        while(rs<=re)
        {
            int mid = rs + (re-rs)/2;
            if(met[mid][0]<=target && met[mid][ce]>=target)
            {
                ans[0]=mid;
                ans[1] = Search(met,mid,target);
                break;
            }
            else if(met[mid][0]<target)
            {
                rs = mid + 1;
            }
            else{
                re = mid - 1;
            }
        }
        return ans;
    }
    static int Search(int[][] met,int mid,int target)
    {
        int start = 0;
        int end = met[mid].length-1;
        while(start<=end){
            int mi = start + (end-start)/2;
            if(met[mid][mi]==target){
                return mi;
            }
            else if(met[mid][mi]<target)
            {
                start = mi + 1;
            }
            else{
                end = mi - 1;
            }
        }
        return -1;
    }
}
