package Java_01.Basic_program;

public class Even {
    public static void main(String[] args){
        short num= 1;
        while(num<=100){
            if(num%2==0){
                System.out.println(num);
            }
            num++;
        }
    }
}
