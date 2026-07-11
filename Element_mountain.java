package Java_01;

public class Element_mountain
{
    public static void main(String[] args)
    {
        int[] a = {0,1,2,3,4,5,6,7,9,5,3};
        int target = 3;
        int index = peakIndexInMountainArray(a,target);
        System.out.println(index);
    }
    static int peakIndexInMountainArray(int[] arr,int target) {
        int start = 0;
        int end = arr.length-1;
        while(start<=end)
        {
            int mid = (start+end)/2;
            if(arr[mid]==target){
                return mid;
            }
            else if(arr[mid]>target)
            {
                end = mid-1;
            }
            else{
                start = mid + 1;
            }
        }
        return -1;
    }
}
