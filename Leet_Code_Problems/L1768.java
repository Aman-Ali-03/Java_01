package Java_01.Leet_Code_Problems;

public class L1768
{
    public static void main(String[] args)
    {
        String first = "abc";
        String second = "defgh";
        System.out.println(mergeAlternately(first,second));
    }
    static String mergeAlternately(String first,String second)
    {
        int f = 0;
        int s = 0;
        String forre = "";
        while(f<first.length()&&s<second.length())
        {
            forre += first.charAt(f);
            forre += second.charAt(s);
            f++;
            s++;
        }
        if(f<first.length()){
            while(f<first.length())
            {
                forre += first.charAt(f);
                f++;
            }
        }
        else{
            while(s<second.length())
            {
                forre += second.charAt(s);
                s++;
            }
        }
        return forre;
    }
}