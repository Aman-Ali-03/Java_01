package Java_01;
import java.util.Arrays;
public class L88
{
    public static void main(String[] args)
    {
        int[] a ={-1,0,0,0,2,7,0,0,0};
        int[] b = {4,5,6};
        int m=6;
        int n=3;
        merge(a,m,b,n);
        System.out.println(Arrays.toString(a));
    }
    static void merge(int[] nums1,int m,int[] nums2,int n)
    {
        int j=m;
        for(int i=0; i<n; i++)
        {
            nums1[j]=nums2[i];
            j++;
        }
        for(int i=0; i<nums1.length; i++)
        {
            for(int k=i+1; k<nums1.length; k++)
            {
                if(nums1[i]>nums1[k])
                {
                    int t = nums1[i];
                    nums1[i]=nums1[k];
                    nums1[k]=t;
                }
            }
        }
    }
}
