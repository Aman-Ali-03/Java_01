package Java_01;
import java.util.Scanner;
public class Remove_Index {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a[] = new int[5];
        System.out.println("Enter five Element of array : ");
        for(int i=0;i<5;i++){
            a[i] = input.nextInt();
        }
        System.out.println("Enter index you want to remove :");
        int index = input.nextInt();
        for(int i=index; i<5; i++) {
            if(i!=4){
                a[i]= a[i+1];
            }
            else{
                a[i] = 0;
            }
        }
        for(int i=0;i<5;i++){
            System.out.println("Number store at index " + i + " : " + a[i]);
        }
        input.close();
    }
}
