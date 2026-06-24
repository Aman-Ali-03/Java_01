package Java_01;
import java.util.Scanner;
public class Average {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int a[] = new int[10];
        System.out.println("Please enter 10 numbers : ");
        for(int i=0; i<a.length; i++){
            a[i]=input.nextInt();
        }
        int sum=0;
        for(int i=0; i<a.length; i++){
            sum+=a[i];
        }
        sum = sum/a.length;
        System.out.println("The average of "+a.length+" numbers is : "+sum);
    }
}
