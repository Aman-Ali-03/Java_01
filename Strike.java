package Java_01;
import java.util.Scanner;
public class Strike {
    static double strike_rate (int ball, int run){
        return (run*100)/ball;
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter player name :");
        String name = input.nextLine();
        System.out.println("Enter number of runs :");
        int runs = input.nextInt();
        System.out.println("Enter how many balls :");
        int balls = input.nextInt();
        System.out.println("Strike rate of "+ name + " Is " + strike_rate(balls,runs));
    }
}