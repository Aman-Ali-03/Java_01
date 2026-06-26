package Java_01;
import java.util.Scanner;
public class Movie_Ticket {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("1. Avengers: Endgame. (Ticket = 350)");
        System.out.println("2. Interstellar. (Ticket = 300)");
        System.out.println("3. The Dark Knight. (Ticket = 280)");
        System.out.println("4. Spider-Man: No Way Home. (Ticket = 500)");
        System.out.println("5. Inception. (Ticket = 290)");
        System.out.println("Which movie would you like to play? Enter option :");
        byte choice = input.nextByte();
        System.out.println("How much ticket you want :");
        byte qty = input.nextByte();
        switch (choice) {
            case 1:
                System.out.println("Your payable amount : " + (350*qty));
                break;
            case 2:
                System.out.println("Your payable amount : " + (300*qty));
                break;
            case 3:
                System.out.println("Your payable amount : " + (280*qty));
                break;
            case 4:
                System.out.println("Your payable amount : " + (500*qty));
                break;
            case 5:
                System.out.println("Your payable amount : " + (290*qty));
                break;
            default:
                System.out.println("Invalid choice.");
        }
    }
}
