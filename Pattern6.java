package Java_01;

public class Pattern6 {
    public static void main(String args[]){
        for(int i=0; i<5 ; i++){
            for(int j=0; j<5; j++){
                if(i+j < 5){
                    System.out.print(j);
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
}
