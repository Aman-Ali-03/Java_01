package Java_01;
import java.util.Scanner;
import java.lang.String;
public class Compare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your first String : ");
        String str1 = sc.nextLine();
        System.out.println("Enter your second String : ");
        String str2 = sc.nextLine();
        int com = str1.compareTo(str2);
        if(com < 0){
            System.out.println("Your first string is less than the second string");
        }
        else if(com > 0){
            System.out.println("Your first string is greater than the second string");
        }
        else{
            System.out.println("Your first string is equal to the second string");
        }
    }
}
