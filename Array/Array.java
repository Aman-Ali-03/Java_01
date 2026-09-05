package Java_01;
import java.util.Scanner;
public class Array {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a[] = new int[5];
        System.out.println("Enter five Element of array : ");
        for(int i=0;i<5;i++){
            a[i] = input.nextInt();
        }
        int temp = a[0];
        for(int i=0;i<5;i++){
            if(i==4){
                a[i] = temp;
            }
            else{
                a[i] = a[i+1];
            }
        }
        System.out.println("After Rotation of array :");
        for(int i=0;i<5;i++){
            System.out.println("At  Indax " + i + " " + a[i]);
        }
        input.close();
    }
}
