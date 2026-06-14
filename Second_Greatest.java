package Java_01;
import java.util.Scanner;
public class Second_Greatest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 10 element of array :");
        short a[] = new short[10];
        for(int i=0; i<a.length; i++){
            a[i]=input.nextShort();
        }
        for(int i=0; i<a.length; i++){
            if(a[0]<a[i]){
                a[0]=a[i];
            }
        }
        for(int i=1; i<a.length; i++){
            if(a[1]<a[i] && a[i]<a[0]){
                a[1]=a[i];
            }
        }
        System.out.println("The second Greatest element of an array is :" + a[1]);
        input.close();
    }
}

