package Java_01;
public class L2011
{
    public static void main(String[] args)
    {
        String[] operator = {"--X","X++","X++"};
        System.out.println(finalValueAfterOperations(operator));
    }
    static int finalValueAfterOperations(String[] operations)
    {
        int x=0;
        for(int i=0; i<operations.length; i++)
        {
            if(operations[i].equals("X++") || operations[i].equals("++X"))
            {
                x++;
            }
            else{
                x--;
            }
        }
        return x;
    }
}