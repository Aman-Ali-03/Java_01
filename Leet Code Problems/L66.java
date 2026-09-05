package Java_01;
import java.util.Arrays;
public class L66
{
    public static void main(String[] args)
    {
        int[] a = {9};
        int[] b = increase(a);
        System.out.println(Arrays.toString(b));
    }
    static int[] increase(int[] digits)
    {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        int[] result = new int[digits.length + 1];
        result[0] = 1;
        return result;
    }
}