package Java_01;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
public class Get_Indexes_Of_Target_Using_Recursion
{
    public static void main(String[] args)
    {
        int[] array = {1,2,3,4,5,5,5,5,6,7};
        int target = 5;
        List<Integer> list = new ArrayList<>();
        list=get_it(array,target,0,list);
        System.out.println(Arrays.toString(list.toArray()));
    }
    static List<Integer> get_it(int[] array,int target,int index,List<Integer> list)
    {
        if(index==array.length)
        {
            return list;
        }
        if(array[index]==target)
        {
            list.add(index);
        }
        return get_it(array,target,index+1,list);
    }
}
