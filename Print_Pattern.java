package Java_01;


public class Print_Pattern {
    public static void main(String[] args) {
        System.out.println("There is your pattern.");
        int j;
        int k;
        for(int i=0; i<6; i++){
            for(k=i; k<6; k++){
                System.out.print("&");
            }
            for(j=i; j>0; j--){
                System.out.print(" ");
            }
            System.out.println("");
        }
    }
}
