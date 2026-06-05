package Java_01;
import java.util.Scanner;
import java.lang.String;
public class Count_Vowel {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = scan.nextLine();
        int sum = 0;
        for(int i = 0; i < str.length(); i++){
            char ch= str.charAt(i);
            if(ch=='a'){
                sum++;
            }
            else if(ch=='e'){
                sum++;
            }
            else if(ch == 'i'){
                sum++;
            }
            else if(ch == 'o'){
                sum++;
            }
            else if(ch=='u'){
                sum++;
            }
        }
        System.out.println("The total vowels in the string is: " + sum );
    }
}
