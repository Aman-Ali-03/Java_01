package Java_01;
import java.util.Scanner;
import java.util.Arrays;
public class Digit_Even {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
        System.out.println("Enter the element of array :");
        for(byte i=0; i<5; i++){
            arr[i] = in.nextInt();
        }
       // System.out.println(Arrays.toString(arr));
        int[] b=new int[arr.length];
        for(byte i=0; i< arr.length; i++){
            b[i]= checkd(arr[i]);
        }
        System.out.println("Even no digit Element :");
        System.out.println(Arrays.toString(b));
    }
    static int checkd(int a){
        int temp=0;
        int c=a;
        while(a>0){
            a=a/10;
            ++temp;
        }
        if(temp%2==0){
            return c;
        }else{
            return 0;
        }
    }
}
