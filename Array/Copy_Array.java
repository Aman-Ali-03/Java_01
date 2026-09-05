package Java_01;
import java.util.Scanner;
public class Copy_Array {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a[] = new int[5];
        System.out.println("Enter five Element of array : ");
        for(int i=0;i<5;i++){
            a[i] = input.nextInt();
        }
        int b[] = new int[5];
        for(int i=0;i<5;i++){
            b[i] = a[i];
        }
        System.out.println("First Array :-");
        for(int i=0;i<5;i++){
            System.out.println("Number store at index " + i + " : " + a[i]);
        }
        System.out.println("Copyed Array :-");
        for(int i=0;i<5;i++){
            System.out.println("Number store at copyed array index " + i + " : " + b[i]);
        }
        input.close();
    }
}
