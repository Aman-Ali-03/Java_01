package Java_01;

public class Celling {
    public static void main(String[] args) {
        int[] nums = {10,12,13,14,17,18,21,34};
        int ter = 15;
        int n = Cell(nums, 0, nums.length - 1, ter);
        System.out.println(n);
    }

    static int Cell(int[] a, int start, int end, int ter) {
        int ans = -1;
        while (start <= end) {
            int mid = (start + end) / 2;

            if (a[mid] == ter) {
                return a[mid];
            } else if (a[mid] < ter) {
                ans = a[mid];
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return ans;
    }
}
