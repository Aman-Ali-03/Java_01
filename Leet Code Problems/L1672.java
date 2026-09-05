package Java_01;

public class L1672 {
    public static void main(String[] args) {
        int[][] a = {
                { 1, 2, 3 },
                { 2, 3, 4, 1, 5 },
                { 3, 4, 5 }
        };
        int q = Wealth(a);
        System.out.println(q);
    }

    static int Wealth(int[][] a) {
        int[] d = new int[a.length];
        int s = 0;
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                sum = sum + a[i][j];
            }
            d[s] = sum;
            sum = 0;
            s++;
        }
        for (int k = 0; k < d.length; k++) {
            if (d[0] < d[k]) {
                d[0] = d[k];
            }
        }
        return d[0];
    }
}
