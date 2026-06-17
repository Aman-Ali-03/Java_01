package Java_01;
import java.util.Scanner;
public class Reversed_Method {
    static void reversed (int a[]){
        int temp[] = new int[10];
        int j=a.length-1;
        for(int i=0; i<a.length; i++){
            temp[i] = a[i];
        }
        byte i=0;
        for(;j>=0;j--){
            a[j] = temp[i];
            i++;
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a[] = new int[10];
        System.out.println("Enter 10 numbers : ");
        for(int i=0; i<a.length; i++){
            a[i] = input.nextInt();
        }
        reversed(a);
        System.out.println("Reversed useing method : ");
        for(int i=0; i<a.length; i++){
            System.out.print(a[i] + ", ");
        }
    }
}