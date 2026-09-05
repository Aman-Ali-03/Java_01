package Java_01;

public class Binary_Search
{
    public static void main(String[] args)
    {
        int[] array = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,50};
        int target = 60;
        int index = binary(array,target,0,array.length-1);
        System.out.println(index);
    }
    static int binary(int[] array,int target,int start,int end)
    {
        int mid = start + (end-start) / 2;
        if(start>end)
        {
            return -1;
        }
        if(array[mid]==target)
        {
            return mid;
        }
        else if (array[mid]<target)
        {
            return binary(array,target,mid+1,end);
        }
        else {
            return binary(array,target,start,mid-1);
        }
    }
}
