package Java_01;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class L27 {
    public static void main(String[] args) {
        int[] a = { 3, 2, 2, 3 };
        int rem = 3;
        int b = Remover(a, rem);
        System.out.println(b);
    }

    static int Remover(int[] nums, int val) {
        List<Integer> l = new ArrayList<>();
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == val) {
                nums[i] = 0;
            }
            if (nums[i] != 0) {
                l.add(k, nums[i]);
                k++;
            }
        }
        int[] b = new int[l.toArray().length];
        for (int j = 0; j < l.toArray().length; j++) {
            b[j] = l.get(j);
        }
        System.out.println(Arrays.toString(b));
        return k;
    }
}
