package Java_01;
// BUBBLE SHORT 
import java.util.Arrays;
public class Bubble_Short
{
    public static void main(String[] atgs)
    {
        int[] a = {3,1,5,4,2,9,7,6,8};
        shot(a);
        System.out.println(Arrays.toString(a));
    }
     static void shot(int[] a)
    {
        boolean swap;
        int temp=0;
        for(int i=a.length; i>0; i--)
        {
            swap=false;
            for(int j=0; j<i-1; j++)
            {
                if(a[j]>a[j+1]){
                    temp = a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                    swap=true;
                }
            }
            if(!swap){
                break;
            }
        }
    }
}
