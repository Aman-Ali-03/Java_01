package Java_01;
import java.util.Arrays;
public class Merge_Short
{
    public static void main(String[] args)
    {
        int[] a = {1,2,3,0,0,0};
        int[] b = {2,5,6};
        int m = 3,n = 3;
        merger(a,m,b,n);
        System.out.println(Arrays.toString(a));
    }
    static void merger(int[] nums1,int m,int[] nums2,int n)
    {
        int temp = 0;
        int temp1 = 0,j=nums1.length-1;
        for (int i=0; i<nums2.length; i++)
        {
            temp = (temp*10)+nums2[i];
        }
        for(int i=0; i<nums1.length; i++)
        {
            temp1 = (temp1*10)+nums1[i];
        }
        temp1 += temp;
        while(temp1!=0)
        {
            nums1[j] = temp1%10;
            temp1 /= 10;
            j--;
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
