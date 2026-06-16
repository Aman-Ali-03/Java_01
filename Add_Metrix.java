package Java_01;
import java.util.Scanner;
public class Add_Metrix {

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
        System.out.println("After Adding both metrix :");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                c[i][j] = a[i][j] + b[i][j];
            }
        }
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(c[i][j]+" ");
            }
            System.out.println(" ");
        }
        input.close();
    }
}

    

