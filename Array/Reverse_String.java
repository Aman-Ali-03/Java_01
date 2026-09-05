package Java_01;
import java.util.Scanner;
public class Reverse_String {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = scan.nextLine();
        String rev = "";
        for(int i = str.length() - 1; i >= 0; i--){
            rev = rev + str.charAt(i);
        }
        System.out.println("The reverse of the string is: " + rev);
    }
}