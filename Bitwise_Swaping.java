package Java_01;

public class Bitwise_Swaping {
    
    public static void main(String[] args) {
        int a=10,b=20;
        System.out.println("Before swapping a= " + a + " b= " + b);
        a=a^b; //a=30(11110)
        b=a^b; //b=10(01010)
        a=a^b; //a=20(10100)
        System.out.println("After swapping a= " + a + " b= " + b);
    }
}
