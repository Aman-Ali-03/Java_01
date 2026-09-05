package Java_01;
import java.util.Scanner;
public class Multiply_Metrix {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        int a[][] = new int [3][3];
        int b[][] = new int [3][3];
        int c[][] = new int [3][3];
        System.out.println("Enter Element of first metrix :");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                a[i][j] = input.nextInt();
            }
        }
        System.out.println("Enter Element of second metrix :");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                b[i][j] = input.nextInt();
            }
        }
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                c[i][j] = 0;

                for(int k=0;k<3;k++){
                    c[i][j] = c[i][j] + a[i][k]*b[k][j];
                }
            }
        }
        System.out.println("After Multiply metrix :");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(c[i][j]+" ");
            }
            System.out.println(" ");
        }
        input.close();
    }
}
