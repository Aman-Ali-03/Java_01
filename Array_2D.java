package Java_01;
import java.util.Scanner;
public class Array_2D {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int[][] a = new int[3][3];
        System.out.println("Enter your metrix :");
        for(byte i=0; i<3; i++)
            for(byte j=0; j<3; j++)
                a[i][j] = in.nextInt();
        for(byte i=0; i<3; i++){
            for(byte j=0; j<3; j++)
                System.out.print(a[i][j]+" ");
            System.out.println("");
        }
        int[][] b =  {
                {1,2,3,4},
                {1,2},
                {1,2,3,4,5,6}
        };
        System.out.println("\n");
        for(byte i=0; i<b.length; i++){
            for(byte j=0; j<b[i].length; j++)
                System.out.print(b[i][j] + " ");
            System.out.println("");
        }
    }
}
