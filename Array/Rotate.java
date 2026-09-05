package Java_01;

public class Rotate
{
    public static void main(String[] args)
    {
        int[] nums = {4,5,6,7,0,1,2};
        int target = 0;
        int index = search(nums,target);
        System.out.println(index);
    }
    static int search(int[] nums, int target) {
        int start=0;
        int end = peakIndexInMountainArray(nums);
        int index = Binary_Search(nums,start,end,target);
        if(index!=-1){
            return index;
        }
        else{
            index = Binary_Search(nums,end+1,nums.length,target);
        }
        return index;
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
    static int Binary_Search(int[] a, int start, int end, int ter) {
        int ans = -1;
        if(a[start]>ter)
        {
            return ans;
        }
        else {
            while (start <= end) {
                int mid = (start + end) / 2;
                if (a[mid] < ter) {
                    start = mid + 1;
                } else if (a[mid] > ter) {
                    end = mid - 1;
                } else {
                    ans = mid;
                    break;
                }
            }
        }
        return ans;
    }
}
