package Java_01;
import java.util.Scanner;
public class HCF {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter two number");
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c;
        while(b!=0){
            c=b;
            b=a%b;
            a=c;
        }
        System.out.println("H.C.F is : " + a);
    }
}
