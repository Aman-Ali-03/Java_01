package Java_01;

public class SubArray {
    public static void main(String[] args) {
        int[] a = { 1, 2, 3, -6, 5, 4, 1, 8 };
        int sum = sub(a);
        System.out.println(sum);
    }

    static int sub(int[] a) {
        int temp = 0;
        for (int i = 0; i < a.length; i++) {
            if (temp < 0) {
                temp = 0;
            } else {
                temp += a[i];
            }
        }
        return temp;
    }
}
