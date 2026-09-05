package Java_01;
import java.util.Scanner;
public class Largest_Digit {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number :");
        long a = input.nextLong();
        long temp;
        long largest=0;
        do{
            temp = a%10;
            if(temp>largest){
                largest = temp;
            }
            a = a/10;
        }while(a!=0);
        System.out.println("The largest digit of entered number : " + largest);
    }
}
