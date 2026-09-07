package Java_01;
import java.util.Arrays;
public class Leet_Code1 {
    public static void main(String[] args){
        int[] num = {2,2,2,2,3,3,3,3};
        int n=4;
        int[] c= mixer(num,n);
        System.out.println(Arrays.toString(c));
    }
    static int[] mixer(int[] num,int n){
        int[] a = new int[n],b = new int[n],c=new int[num.length];
        int j=0;
        for(byte i=0; i<num.length; i++){
            if(i<n){
                a[i]=num[i];
            }
            else{
                b[j]=num[i];
                j++;
            }
        }
        int l=0,k=0;
        for(byte i=0; i<num.length; i++){
            if(i%2==0){
                c[i]=a[l];
                l++;
            }
            else{
                c[i]=b[k];
                k++;
            }
        }
        return c;
    }
}
