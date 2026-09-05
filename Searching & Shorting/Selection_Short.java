package Java_01;
import java.util.Arrays;
public class Selection_Short
{
    public static void main(String[] args)
    {
        int[] a = {5,3,1,2,4,-1,-9,8};
        sort(a);
        System.out.println(Arrays.toString(a));
    }
    static void sort(int[] a)
    {
        for(int i=0; i<a.length; i++){
            int last = a.length-i-1;
            int max = maxe(a,last);
            swaap(a,max,last);
        }
    }
    static void swaap(int[] a,int max,int last)
    {
        int temp = a[last];
        a[last]=a[max];
        a[max]=temp;
    }
    static int maxe(int[] a,int last)
    {
        int start = 0;
        int max = start;
        for(int i=0; i<=last; i++){
            if(a[max]<a[i])
                max=i;
        }
        return max;
    }
}
