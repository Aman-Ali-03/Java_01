package Java_01;
import java.util.Arrays;
public class F_and_L_index {
    public static void main(String[] args) {
        int[] a = {1};
        int target = 1;
        int[] b = inde(a, target);
        System.out.println(Arrays.toString(b));
    }

    static int[] inde(int[] nums, int tar) {
        int[] a = {-1,-1};
        int start = finding(nums,tar,true);
        int end = finding(nums,tar,false);
        a[0] = start;
        a[1] = end;
        return a;
    }
    static int finding(int[] a,int tar,boolean firstindex){
        int start = 0;
        int end = a.length-1;
        int ans = -1;
        while(start<=end){
            int mid = (start+end)/2;
            if(a[mid]==tar){
                ans = mid;
                if(firstindex){
                    end = mid -1;
                }
                else{
                    start = mid + 1;
                }
            }
            else if(a[mid]<tar){
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        return ans;
    }
}