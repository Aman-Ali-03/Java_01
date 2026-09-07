package Java_01;

public class L152 {
    public static void main(String[] args) {
        int[] a = { 2, 3, -1, 2 };
        int product = sub(a);
        System.out.println(product);
    }

    static int sub(int[] a) {
        int sum = 1;
        for (int i = 0; i < a.length; i++) {
            sum = sum * a[i];
            if (sum < 0) {
                sum = 1;
            }
        }
        return sum;
    }
}
