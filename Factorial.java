package Java_01;

import java.util.Scanner;

public class Factorial {
    static void main() {
        System.out.println("Enter Number To Get Factorial :");
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int sum=1;
        for(int i=a; i>0; i--){
            sum = sum*i;
            
            //System.out.println(i);
        }
        System.out.println("There Is Your Factorial :");
        System.out.println(sum);

    }
}
