package Java_01.Leet_Code_Problems;
public class L153
{
    public static void main(String[] args)
    {
        int[] a = {3,4,5,1,2};
        int least = findMin(a);
        System.out.println(least);
    }
    static int findMin(int[] nums) {
        for(int i=0; i<nums.length-1; i++)
        {
            if(nums[i]>nums[i+1])
                return nums[i+1];
        }
        return nums[0];
    }
}