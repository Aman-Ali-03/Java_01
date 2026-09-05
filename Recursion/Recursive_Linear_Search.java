package Java_01;

public class Recursive_Linear_Search
{
    public static void main(String[] args)
    {
        int[] a = {12,14,15,19,20,13,1,21,31,41};
        int find = 31;
        System.out.println(linear(a,0,find));
    }
    static int linear(int[] a,int i,int tar)
    {
        if(i==a.length)
        {
            return -1;
        }
        if(a[i]==tar)
        {
            return i;
        }
        return linear(a,i+1,tar);
    }
}
