package Java_01;
public class Duplicate
{
    public static void main(String[] args)
    {
        int[] a = {1,1,1,2,2,2,4};
        int r = removeDuplicates(a);
        System.out.println(r);
    }
    static int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;
        int k = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }
}