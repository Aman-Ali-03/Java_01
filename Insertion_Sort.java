package Java_01;
import java.util.Arrays;
public class Insertion_Sort
{
    public static void main(String[] args)
    {
        int[] a = {5,4,2,1,3};
        sort(a);
        System.out.println(Arrays.toString(a));
    }
    static void sort (int[] arr)
    {
        for(int i=0; i<arr.length-1; i++)
        {
            for(int j=i+1; j>0; j--) {
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
                else {
                    break;
                }
            }
        }
    }
}
