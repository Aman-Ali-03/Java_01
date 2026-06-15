package Java_01;
import java.util.Scanner;
public class Increase_Size {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a[] = new int[5];
        System.out.println("Enter five Element of array : ");
        for(int i=0;i<5;i++){
            a[i] = input.nextInt();
        }
        int b[] = new int[10];
        for(int i=0;i<5;i++){
            b[i] = a[i];
        }
        System.out.println("Now you have a more space.");
        for(int i=0;i<10;i++){
            System.out.println("Number store at index " + i + " : " + b[i]);
        }
        input.close();
    }
}
