package Java_01;
import java.util.Scanner;
public class Sum_of_Array{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a[] = new int[10];
        System.out.println("Enter 10 numbers: ");
        for (int i = 0; i < a.length; i++)
            a[i] = input.nextInt();
        int sum = 0;
        for(int i=0; i<a.length; i++){
            sum = sum + a[i];
        }
        System.out.println("The sum of all array elements is :" + sum);
        input.close();
    }
}
