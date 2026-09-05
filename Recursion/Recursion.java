package Java_01;

public class Recursion {
    public static void main(String[] args) {
        int n = 1;
        msg(n);
    }

    static void msg(int a) {
        if (a < 6) {
            System.out.println(a++);
            msg(a);
        }
    }
}
