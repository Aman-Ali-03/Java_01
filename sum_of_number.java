package Java_01;
import java.util.Scanner;
public class sum_of_number {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number :");
        short range = scan.nextShort();
        short i = 0;
        int sum = 0;
        while(i<=range){
            sum=sum+i;
            i++;
        }
        System.out.print("Sum of natural number from 1 to " + range + " is " + sum );   
    }
}
