package Java_01;
import java.util.ArrayList;
import java.util.Scanner;
public class Array_List {
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println("Enter the size of the arraylist :");
        int size = in.nextInt();
        int sum = 0;
        System.out.println("Enter the elements of the arraylist :");
        for(int i=0; i<size; i++){
            list.add(in.nextInt());
            sum = sum + list.get(i);
        }
        System.out.println("The sum of the elements of the arraylist :" + sum);

    }
}
