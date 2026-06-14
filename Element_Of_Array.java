package Java_01;
import java.util.Scanner;
public class Element_Of_Array{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 10 element of array :");
        short a[] = new short[10];
        for(int i=0; i<a.length; i++){
            a[i]=input.nextShort();
        }
        short search;
        System.out.print("Enter searching element :");
        search = input.nextShort();
        for(int i=0; i<a.length; i++){
            if(a[i]==search){
                System.out.println("Element found at index " + i);
            }
        }
        input.close();
    }
}
