package Java_01;

import java.util.Arrays;

public class sum {
    public static void main(String[] args) {
        int[] a = { 1, 1, 1, 1, 1, 1, 1, 1 };
        int[] n = sums(a);
        System.out.println(Arrays.toString(n));
    }

    static int[] sums(int[] a) {
        int[] n = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            n[i] = sum_Array(a, i);
        }
        return n;
    }

    static int sum_Array(int[] a, int i) {
        int sum = 0;
        for (int j = 0; j <= i; j++) {
            sum += a[j];
        }
        return sum;
    }
}
