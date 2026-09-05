package Java_01;
public class Pattern_04 {
    public static void main(String[] args) {
        for(short i=1 ; i<=5 ; i++){
            for(short j=1 ; j<=5 ; j++){
                if(i<3 || j<3){
                    System.out.print("  ");
                }
                else{
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
}
