package Java_01;
import java.util.Scanner;
public class Graade {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name :");
        String name = input.nextLine();
        System.out.println("Hello "+ name);
        System.out.println("Enter your five subject marks :");
        short m1 = input.nextShort();
        short m2 = input.nextShort();
        short m3 = input.nextShort();
        short m4 = input.nextShort();
        short m5 = input.nextShort();
        int sum =  m1+m2+m3+m4+m5;
        float score = (float)(sum/100);
        if(score>80){
            System.out.println("Grade is A");
        }
        else if(score<80 || score>60){
            System.out.println("Grade is B");
        }
        else if(score<60 || score>40){
            System.out.println("Grade is C");
        }
        else{
            System.out.println("Fail");
        }
        
    }
}
