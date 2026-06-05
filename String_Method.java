package Java_01;
import java.util.Scanner;
import java.lang.String;
public class String_Method {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your String :");
        String str = scan.nextLine();
        String str1 = str.toLowerCase();
        String str2 = str.toUpperCase();
        int len = str.length();
        String Replaced = str.replace('a','s');
        System.out.println("You enter : " + str);
        System.out.println("Length of your string : " + len);
        System.out.println("String in lower case : " + str1);
        System.out.println("String in upper case : " + str2);
        System.out.println("Replace string (a replace by s) : " + Replaced);
    }
}
