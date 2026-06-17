package Java_01;
import java.util.Scanner;
public class Pattern_Option {
    static void square (){
        for(int i=0; i<5; i++){
            for(byte j=0; j<5; j++){
                System.out.print("# ");
            }
            System.out.println("");
        }
    }
    static void triangle() {
        for(byte i=0; i<5; i++){
            for(byte j=0; j<5; j++){
                if((i+j)>3){
                    System.out.print("# ");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
    public static void main(){
        Scanner input = new Scanner(System.in);
        System.out.println("You have two pattern:-");
        System.out.println("1. Square");
        System.out.println("2. Trinagle");
        System.out.print("Enter your choice : ");
        byte choice = input.nextByte();
        switch(choice){
            case 1:
                square();
                break;
            case 2:
                triangle();
                break;
            default:
                System.out.println("Invalid choice");
                main();
        }
    }
}
