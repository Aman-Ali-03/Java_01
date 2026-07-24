package Java_01;

import java.util.Arrays;

public class L1929 {
    public static void main(String[] args) {
        int[] a = { 1, 2, 10 };
        int[] b = multiply(a);
        System.out.println(Arrays.toString(b));
    }

    static int[] multiply(int[] a) {
        int sum = 0;
        int Sum = 0;
        int[] n = new int[a.length * 2];
        for (int i = 0; i < a.length; i++) {
            sum = (sum * 10) + a[i];
        }
        Sum = sum;
        for (int j = 0; j < a.length; j++) {
            Sum = Sum * 10;
        }
        Sum = Sum + sum;
        for (int k = n.length - 1; k >= 0; k--) {
            n[k] = Sum % 10;
            Sum = Sum / 10;
        }
        return n;
    }
}
