package Java_01;
import java.util.Scanner;
public class Bill {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int unit;
        long balance;
        System.out.println("Please enter the used unit :");
        unit = input.nextInt();
        if(unit <= 100 ){
            balance = unit * 5;
            System.out.println("Your payable balance is : "+balance);
        }
        else if(unit > 100 && unit <=200){
            int temp = unit -100 ;
            System.out.println("Your payable balance is : "+(500+(temp*7)));
        }
        else {
            int temp = unit - 200;
            balance = 1200 + (temp*10);
            System.out.println("Your payable balance is : "+balance);
        }
    }
}
