package Java_01;
import java.util.Scanner;
public class Array_Sum {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n[] = new int[5];
        System.out.println("Enter five element of array :");
        for(byte i=0; i<5; i++){
            n[i] = in.nextInt();
        }
        System.out.println("Enter target :");
        int target = in.nextInt();
        for(byte i=0; i<5; i++){
            for(byte j=4; j>=i; j--)
                if ((n[i] + n[j]) == target) {
                    System.out.println(n[i] + " " + n[j]);
                }
        }
    }
}
