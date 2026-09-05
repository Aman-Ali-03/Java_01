package Java_01;
import java.util.Scanner;
public class Day {
    public static void main(String[] args) {
        System.out.println("Enter your number to get day name : ");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        switch (number){
            case 1:
                System.out.println("Day 1: Monday");
                break;
            case 2:
                System.out.println("Day 2: Tuesday");
                break;
            case 3:
                System.out.println("Day 3: Wednesday");
                break;
            case 4:
                System.out.println("Day 4: Thursday");
                break;
            case 5:
                System.out.println("Day 5: Friday");
                break; 
            case 6:
                System.out.println("Day 6: Saturday");
                break;
            case 7:
                System.out.println("Day 7: Sunday");
                break;
            default:
                System.out.println("Invalid input");
        }
    }
}
