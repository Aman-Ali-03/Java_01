package Java_01;

import java.util.Scanner;
public class Even_Odd {
    public static void main(String[] args) {
        System.out.println("Enter your number :");
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        if(num%2==0){
            System.out.println("Enter number is even.");
        }
        else if(num%2 != 0){
            System.out.println("enter number is odd.");
        }
        else{
            System.out.println("Enter number is zero.");
        }

    }
}
