package Java_01;

public class L1295 {
    public static void main(String[] args) {
        int[] nums = { 1, 345, 2, 6, 1234 };
        int s = checker(nums);
        System.out.println(s);
    }

    static int checker(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            int temp = nums[i], j = 0;
            while (temp != 0) {
                temp = temp / 10;
                j++;
            }
            if (j % 2 == 0) {
                count++;
            }
        }
        return count;
    }
}
