package Java_01;

import java.util.Arrays;

public class L1920 {
    public static void main(String[] args) {
        int[] a = { 0, 2, 1, 5, 3, 4 };
        int[] b = permutation(a);
        System.out.println(Arrays.toString(b));
    }

    static int[] permutation(int[] a) {
        int[] c = new int[a.length];
        int temp;
        for (int i = 0; i < a.length; i++) {
            temp = a[i];
            c[i] = a[temp];
        }
        return c;
    }
}