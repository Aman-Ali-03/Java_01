package Java_01;
import java.util.Scanner;
public class Even_Range {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter you range :");
        short range = input.nextShort();
        short start = 1;
        short count = 0;

        while(start<=range){
            if(start%2==0){
                System.out.println(start);
                count++;
            }
            start++;
        }
        System.out.println("Total \"" + count + "\" even number from range 1 to " + range + " ." );
    }
}
