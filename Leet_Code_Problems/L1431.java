package Java_01;

import java.util.ArrayList;
import java.util.List;

public class L1431 {
    public static void main(String[] args) {
        int[] a = { 1, 1, 1, 1, 1, 5 };
        int extra = 1;
        List<Boolean> b = Candy(a, extra);
        for (int i = 0; i < b.toArray().length; i++) {
            System.out.println(b.get(i));
        }
    }

    static List<Boolean> Candy(int[] a, int e) {
        List<Boolean> k = new ArrayList<>();
        int s = 0;
        for (int i = 0; i < a.length; i++) {
            if (s < a[i])
                s = a[i];
        }
        for (int j = 0; j < a.length; j++) {
            if ((a[j] + e) < s) {
                k.add(j, false);
            } else {
                k.add(j, true);
            }
        }
        return k;
    }
}
