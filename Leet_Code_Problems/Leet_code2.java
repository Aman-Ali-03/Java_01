package Java_01;
import java.util.Arrays;
public class Leet_code2 {
    public static void main(String[] args){
        int[] num = {1,2,3,1};
        int[] n=copy(num);
        System.out.println(Arrays.toString(n));
    }
    static int[] copy(int[] n){
        int a=n.length;
        int[] s = new int[a*2];
        for(int i=0; i<a; i++){
            s[i]=n[i];
        }
        last(s,n);
        return s;
    }
    static void last(int[] s, int[] n){
        int a=n.length;
        int o=0;
        for(int j=(s.length/2); j<s.length; j++){
            s[j]=s[o];
            o++;
        }
    }
}
