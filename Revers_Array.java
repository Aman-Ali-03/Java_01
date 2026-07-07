package Java_01;
import java.util.Scanner;
import java.util.Arrays;
public class Revers_Array {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int a[] = {1,2,3,4,5,6,7,8,9};
        System.out.println(Arrays.toString(a));
        rev(a,0,8);
        System.out.println(Arrays.toString(a));
    }
    static void rev(int[] a, int start, int end){
        int temp;
        while(start<end){
            temp = a[start];
            a[start] = a[end];
            a[end] = temp;
            start++;
            end--;
        }
    }
}
