package Java_01;
import java.util.Scanner;
public class mail {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your email Id :");
        String email = scan.nextLine();
        if(email.matches(".*gmail.*")){
            int i = email.indexOf("@");
            String user = email.substring(0, i);
            String domain = email.substring(i+1);
            System.out.println("Username : "+user);
            System.out.println("Domain : "+domain);
        }
        else{
            System.out.println("Invalid email Id");
        }
    }
}
