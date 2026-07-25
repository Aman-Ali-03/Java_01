package Java_01;

import java.util.Arrays;
import java.util.LinkedList;

public class L1389 {
    public static void main(String[] args) {
        int[] nums = { 1 };
        int[] index = { 0 };
        int[] now = swifter(nums, index);
        System.out.println(Arrays.toString(now));
    }

    static int[] swifter(int[] n, int[] i) {
        LinkedList<Integer> list = new LinkedList<>();
        int[] k = new int[n.length];
        for (int num = 0; num < n.length; num++) {
            list.add(i[num], n[num]);
        }
        for (int j = 0; j < n.length; j++) {
            k[j] = list.get(j);
        }
        return k;
    }
}
