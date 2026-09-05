package Java_01;

public class Recursion_Shorted_Or_Not
{
    public static void main(String[] args)
    {
        int[] a = {1,2,3,4,5,6,87,8};
        System.out.println(ornot(a,0));
    }
    static boolean ornot(int[] a,int index)
    {
        if(index==a.length)
        {
            return true;
        }
        return a[index]<a[index+1] && ornot(a,index+1);
    }
}
