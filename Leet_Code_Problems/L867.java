package Java_01;

import java.util.Arrays;

public class L867 {
    public static void main(String[] args) {
        int[][] m = {
                { 1, 2, 3, 7, 8 },
                { 4, 5, 6, 9, 10 }
        };
        int[][] tm = trans(m);
        for (int i = 0; i < tm.length; i++) {
            System.out.println(Arrays.toString(tm[i]));
        }
    }

    static int[][] trans(int[][] matrix) {
        int[][] tm = new int[matrix[0].length][matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                tm[j][i] = matrix[i][j];
            }
        }
        return tm;
    }
}
