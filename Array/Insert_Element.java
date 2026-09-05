package Java_01;
import java.util.Scanner;
public class Insert_Element {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a[] = new int[10];
        System.out.println("Enter five Element of array : ");
        for(int i=0;i<5;i++){
            a[i] = input.nextInt();
        }
        System.out.println("Enter your number :");
        int num = input.nextInt();
        System.out.println("Enter index :");
        int index = input.nextInt();
        for(int i=9; i>= index; i--){
            if(i==index){
                a[i] = num;
            }
            else{
                a[i] = a[i-1];
            }
        }
        for(int i=0;i<10;i++){
            System.out.println("Number store at index " + i + " : " + a[i]);
        }
        input.close();
    }
}
