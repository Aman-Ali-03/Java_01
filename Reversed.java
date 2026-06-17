package Java_01;
import java.util.Scanner;
public class Reversed {
    static long rev(long n){
        long sum =0 ;
        int temp;
        while(n!=0){
            temp = (int)n %10;
            sum = (sum*10) + temp;
            n = n/10;
        }
        return sum;
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your minimum 2 digit or more number : ");
        long a = input.nextLong();
        System.out.println("Reversed of your number : " + rev(a));
    }
}
