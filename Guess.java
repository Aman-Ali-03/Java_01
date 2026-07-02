package Java_01;
import java.util.Scanner;
public class Guess {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("This is the simple number guessing game.\n");
        double num = Math.random()*100 ;
        int n = (int) num;
        byte turn = 0;
        while(true){
            turn++;
            System.out.println("Enter your guess :");
            int guess = sc.nextInt();
            if(guess<n){
                System.out.println("Guess higer number.");
            }
            else if(guess>n){
                System.out.println("Guess lower number.");
            }
            else{
                System.out.println("Guess correct.");
                break;
            }
        }
        System.out.println("You guess the number in " + turn + " Chance.");
    }
}
