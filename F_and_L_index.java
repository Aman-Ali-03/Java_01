package Java_01;
import java.util.Arrays;
public class F_and_L_index {
    public static void main(String[] args) {
        int[] a = {2, 3, 4, 7,7, 7, 7, 7, 8, 9};
        int target = 12;
        int[] b = inde(a, target);
        System.out.println(Arrays.toString(b));
    }

    static int[] inde(int[] nums, int tar) {
        int start = 0, end = nums.length - 1;
        int[] a = new int[2];
        int[] u = {-1,-1};
        if(start>=end){
            return u;
        }
        while (start <= end) {
            int mid = (start + end) / 2;
            if (nums[mid] == tar) {
                start = mid + 1;
                a[1]=mid;
            } else if (nums[mid] < tar) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        int e=nums.length-1,s=0;
        while(s<=e)
        {
            int mid = (s+e)/2;
            if(nums[mid]==tar)
            {
                if(nums[mid-1]==tar)
                {
                    e = mid - 1;
                }else {
                    a[0] = mid;
                    break;
                }
            }
            else if(nums[mid]<tar)
            {
                s = mid + 1;
            }
            else
            {
                e = mid -1;
            }
        }
        if(a[0]!=0 || a[1]!=0){
            return a;
        }
        else if(a[0]==0 || a[1]==0){
            return a;
        }
        else{
            return u;
        }
    }
}