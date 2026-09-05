package Java_01;
public class indexes
{
    public static void main(String[] args)
    {
        int[] a = {1,2,4,7};
        int target = 3;
        int index = inde(a,target);
        System.out.println(index);
    }
    static int inde(int[] nums,int target)
    {
        int start = 0;
        int end = nums.length-1;
        int ans=-1;
        while(start<=end)
        {
            int mid = (start+end)/2;
            if(nums[mid]<target)
            {
                ans=mid;
                start = mid + 1;
            }
            else if(nums[mid]>target)
            {
                end = mid - 1;
            }
            else{
                return mid;
            }
        }
        return ans+1;
    }
}
