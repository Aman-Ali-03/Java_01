package Java_01;

public class L1800
{
    public static void main(String[] args)
    {
        int[] nums = {100,10,1};
        int subsum = summer(nums);
        System.out.println(subsum);
    }
    static int summer(int[] nums)
    {
        int Sum = nums[0];
        int max = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[i - 1]) {
                Sum += nums[i];
            } else {
                Sum = nums[i];
            }
            max = Math.max(max, Sum);
        }
        return max;
    }
}
