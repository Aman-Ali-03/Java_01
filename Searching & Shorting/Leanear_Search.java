package Java_01;
import java.util.Scanner;
public class Leanear_Search {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] a = new int[9];
        System.out.print("Enter element of Array :");
        for (int x : a) {
            x = in.nextInt();
        }
        System.out.println("Enter searching Element :");
        int se = in.nextInt();
        int r = search(a, se);
        if (r >= 0) {
            System.out.println("Element found at index : " + r);
        } else {
            System.out.println("Element not found.");
        }
    }

    static int search(int[] s, int se) {
        int r=0;
        for (int i = 0; i < s.length; i++) {
            if (s[i] == se) {
                r=i;
            }
        }
        return r;
    }
}
