package Java_01;
import java.util.Scanner;
public class Bank {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        long balance =0;
        long cash;
        while(true) {
            System.out.println("Select your language (Hindi/English):");
            String language = input.nextLine();

            if (language.equalsIgnoreCase("Hindi")) {
                System.out.println("1. पैसा जमा करें.");
                System.out.println("2. पैसा निकालें.");
                System.out.println("3. बैलेंस देखें.");
                System.out.println("अपना विकल्प दर्ज करें:");
                byte choice = input.nextByte();

                switch (choice) {
                    case 1:
                        System.out.println("अपनी जमा राशि दर्ज करें :");
                        cash = input.nextLong();
                        if (cash < 0) {
                            System.out.println("अमान्य राशि ");
                            break;
                        } else {
                            balance += cash;
                        }
                        break;
                    case 2:
                        System.out.println("अपनी निकासी राशि दर्ज करें");
                        cash = input.nextLong();
                        if (cash < balance) {
                            System.out.println("पर्याप्त राशि उपलब्ध नहीं है ");
                            break;
                        } else {
                            balance -= cash;
                        }
                        break;
                    case 3:
                        System.out.println("आपका वर्तमान बैलेंस है : " + balance);
                        break;
                    default:
                        System.out.println("अमान्य विकल्प");
                }
            } else {
                System.out.println("1. Deposit money.");
                System.out.println("2. Withdraw money.");
                System.out.println("3. Check Balance.");
                System.out.println("Enter your choice:");
                byte choice = input.nextByte();
                switch (choice) {
                    case 1:
                        System.out.println("Enter amount to deposit on your account :");
                        cash = input.nextLong();
                        if (cash < 0) {
                            System.out.println("Invalid Amount");
                            break;
                        } else {
                            balance += cash;
                        }
                        break;
                    case 2:
                        System.out.println("Enter your withdraw money :");
                        cash = input.nextLong();
                        if (cash < balance) {
                            System.out.println("Insufficient balance ");
                            break;
                        } else {
                            balance -= cash;
                        }
                        break;
                    case 3:
                        System.out.println("Your current balance : " + balance);
                        break;
                    default:
                        System.out.println("Invalid choice.");
                }
            }
        }
    }
}
