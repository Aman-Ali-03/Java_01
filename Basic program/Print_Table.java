package Java_01;
import java.util.Scanner;
public class Print_Table {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter You Number To Print Table :");
        int a = s.nextInt();
        int b = 1;
        while(b<=10){
            int c= a*b;
            System.out.print(a + "x" + b );
            System.out.print("=" + c);
            System.out.println(" ");
            b++;
        }
    }
}
