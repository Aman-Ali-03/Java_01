package Java_01;
import java.util.Scanner;
public class ATM {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        long balance=0;
        long cash;
        while(true){
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.println("Enter your choice : ");
            byte choice = input.nextByte();
            switch(choice){
                case 1:
                    System.out.println("Enter amount to deposit : ");
                    cash = input.nextLong();
                    balance = balance + cash;
                    break;
                case 2:
                    System.out.println("Enter amount to withdraw : ");
                    cash = input.nextLong();
                    if(balance<cash){
                        System.out.println("Insufficient balance");
                        break;
                    }
                    else{
                        balance = balance - cash;
                    }
                    break;
                case 3:
                    System.out.println("your remaining amount : " + balance);
                    break;
                case 4:
                    System.exit(0);
            }

        }
    }
}
