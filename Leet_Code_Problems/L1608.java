package Java_01.Leet_Code_Problems;
public class L1608
{
    public static void main(String[] args)
    {
        int[]a = {3,9,7,8,3,8,6,6};
        System.out.println(specialArray(a));
    }
    static int specialArray(int[] nums) {
        for (int i = 1; i <=nums.length ; i++) {
            if(i==greater_count(nums,i))
            {
                return i;
            }
        }
        return -1;
    }
    static int greater_count(int[] nums,int i)
    {
        int count=0;
        for(int j=0; j<nums.length; j++)
        {
            if(i<=nums[j]){
                count++;
            }
        }
        return count;
    }
}
