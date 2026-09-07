package Java_01;

public class L832 {
    public static void main(String[] args) {
        int[][] a = {
                { 1, 1, 0 },
                { 1, 0, 1 },
                { 0, 0, 0 }
        };
        int[][] b = imager(a);
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[i].length; j++) {
                System.out.print(b[i][j]);
            }
            System.out.println();
        }
    }

    static int[][] imager(int[][] a) {
        for (int i = 0; i < a.length; i++) {
            int[] b = new int[a[i].length];
            for (int j = 0, p = a[i].length - 1; j < a[i].length; j++, p--) {
                b[j] = a[i][p];
            }
            for (int k = 0; k < a[i].length; k++) {
                a[i][k] = b[k];
            }
            for (int j = 0; j < a.length; j++) {
                if (a[i][j] == 1) {
                    a[i][j] = 0;
                } else {
                    a[i][j] = 1;
                }
            }
        }
        return a;
    }
}
