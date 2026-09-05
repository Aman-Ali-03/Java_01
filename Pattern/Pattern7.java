package Java_01;

public class Pattern7 {
    public static void main(String[] args) {
        for (byte i = 0; i < 5; i++) {
            for (int j = 5; j > i; j--) {
                System.out.print(" # ");
            }
            System.out.println("");
        }

    }
}