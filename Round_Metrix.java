package Java_01;

import java.util.Arrays;

public class Round_Metrix {
    public static void main(String[] args) {
        int[][] a = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };
        int round = 3;
        mid(a, round);
        for (int i = 0; i < a.length; i++)
            System.out.println(Arrays.toString(a[i]));
    }

    static void mid(int[][] a, int round) {
        for (int i = 0; i < round; i++) {
            swaper(a);
        }
    }

    static void swaper(int[][] a) {
        int temp = a[a.length - 1][a.length - 1];
        for (int r = a.length - 1; r >= 0; r--) {
            for (int c = a.length - 1; c >= 0; c--) {
                if (r == 0 && c == 0) {
                    a[r][c] = temp;
                } else if (c == 0) {
                    a[r][c] = a[r - 1][a.length - 1];
                } else {
                    a[r][c] = a[r][c - 1];
                }
            }
        }
    }
}
