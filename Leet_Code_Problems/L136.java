package Java_01;

public class L136
{
    public static void main(String[] args)
    {
        int[] n = {1,3,1,9,3};
        int single = singleNumber(n);
        System.out.println(single);
    }
    static int singleNumber(int[] nums)
    {
        int num=0;
        if(nums.length==1)
        {
            return nums[0];
        }
        else {
            for (int i = 0; i < nums.length; i++) {
                for (int j = i+1; j < nums.length; j++) {
                    if (nums[i] == nums[j]) {
                        nums[i] = nums[j] = -10;
                    }
                }
            }
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] != -10) {
                    num = nums[i];
                }
            }
            return num;
        }
    }
}
