package Java_01;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class L26 {
    public static void main(String[] args) {
        int[] a = { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };
        int[] b = remover(a);
        System.out.println(Arrays.toString(b));
    }

    static int[] remover(int[] a) {
        List<Integer> l = new ArrayList<>();
        for (int i = 0; i < a.length; i++) {
            int temp = a[i];
            for (int j = i + 1; j < a.length - 1; j++) {
                if (temp == a[j]) {
                    break;
                } else {
                    l.add(j, temp);
                }
            }
        }
        for (int i = 0; i < a.length; i++) {
            a[i] = 0;
            a[i] = l.get(i);
        }
        return a;
    }
}
