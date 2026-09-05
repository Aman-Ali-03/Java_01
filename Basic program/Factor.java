package Java_01;
import java.util.Scanner;
public class Factor {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter tnumber o get the Factors :");
        int a = sc.nextInt();
        int c=2;
        int d=1;
        while(a!=0){
            if(a%c==0 ){
                a/=c;
                System.out.print(c + " ");
            }
            else{
                c++;
            }
        }
    }
}
