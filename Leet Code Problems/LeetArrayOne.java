package Java_01;

import java.util.Arrays;

public class LeetArrayOne {
    public static void main(String[] args) {
        int[] a = { 9, 8, 9 };
        int[] b = increase(a);
        System.out.println(Arrays.toString(b));
    }

    static int[] increase(int[] a) {
        if (a[0] == 9 && a[a.length - 1] == 9) {
            int[] arr = new int[a.length + 1];
            return added(a, arr);
        } else {
            int[] arr = new int[a.length];
            return added(a, arr);
        }
    }

    static int[] added(int[] a, int[] arr) {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum = (sum * 10) + a[i];
        }
        sum++;
        for (int j = arr.length - 1; j >= 0; j--) {
            arr[j] = sum % 10;
            sum = sum / 10;
        }
        return arr;
    }
}
