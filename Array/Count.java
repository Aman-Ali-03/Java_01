package Java_01;
public class Count
{
    public static void main(String[] args)
    {
        int[] a = {1,0,1,1,1,0,1,1,1,1,1,0,1,0,1,1,1,1,1,1};
        int n = counter(a);
        System.out.println(n);
    }
    static int counter(int[] nums)
    {
        int sum1=0,temp=0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]==1){
                sum1++;
                if(temp<sum1)
                {
                    temp=sum1;
                }
            }
            else{

                sum1=0;
            }
        }
        return temp;
    }
}