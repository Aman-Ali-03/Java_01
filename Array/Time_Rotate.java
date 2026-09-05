package Java_01;

public class Time_Rotate
{
    public static void main(String[] args)
    {
        int[] a = {0,1,2,4,5,6,7};
        int time = timer(a);
        System.out.println(time);
    }
    static int timer(int[] arr) {
        int start = 0;
        int end = arr.length-1;
        int ans=-1;
        while(start<=end)
        {
            int mid = (start+end)/2;
            if(arr[mid]>arr[mid+1] && arr[mid]>arr[mid-1])
            {
                ans=mid;
                break;
            }
            else if (arr[mid]<arr[mid+1]){
                start = mid + 1;
            }
            else{
                end = mid -1;
            }
        }
        if(ans!=-1){
            return ans+1;
        }
        else{
            return ans+1;
        }
    }
}
