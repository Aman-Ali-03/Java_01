package Java_01;
import java.util.Scanner;
public class Binary_searching {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int[] a = new int[9];
        System.out.print("Enter the element of array :");
        for(byte i=0; i<a.length; i++){
            a[i]=in.nextInt();
        }
        System.out.println("Enter the target Element :");
        int ter = in.nextInt();
        int index = Binary_Search(a,0,a.length,ter);
        if(index != -1){
            System.out.println("Element found at index : " + index);
        }
        else{
            System.out.println("Element not found.");
        }
    }
    static int Binary_Search(int[] a,int start,int end,int ter){
        if(start>end) {
            return -1;
        }
        int mid = (start+end)/2;
        if (a[mid]==ter){
            return mid;
        }
        else if (a[mid]<ter){
            return Binary_Search(a,mid+1,end,ter);
        }
        else{
            return Binary_Search(a,start,mid-1,ter);
        }
    }
}
