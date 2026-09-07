package Java_01;

import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

public class L989 {
    public static void main(String[] args) {
        int[] n = { 9, 9, 9, 9, 9, 9, 9, 9, 9, 9 };
        int a = 1;
        List<Integer> m = adder(n, a);
        for (int l = 0; l < m.toArray().length; l++) {
            System.out.println(m.get(l));
        }
    }

    static List<Integer> adder(int[] num, int k) {
        List<Integer> result = new ArrayList<>();
        int i = num.length - 1;
        while (i >= 0 || k > 0) {
            if (i >= 0) {
                k += num[i];
                i--;
            }
            result.add(k % 10);
            k /= 10;
        }
        Collections.reverse(result);
        return result;
    }
}
