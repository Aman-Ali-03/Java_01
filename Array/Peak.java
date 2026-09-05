package Java_01;

public class Peak
{
    public static void main(String[] args)
    {
        int[] a = {0,1,2,3,4,5,6,7,9,5,3};
        int index = peakIndexInMountainArray(a);
        System.out.println(index);
    }
    static int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length-1;
        while(start<=end)
        {
            int mid = (start+end)/2;
            if(arr[mid]>arr[mid+1] && arr[mid]>arr[mid-1])
            {
                return mid;
            }
            else if (arr[mid]<arr[mid+1]){
                start = mid + 1;
            }
            else{
                end = mid -1;
            }
        }
        return -1;
    }
}
