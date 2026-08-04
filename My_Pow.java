package Java_01;

public class My_Pow {
    public static void main(String[] args) {
        double pow = myPow(2, 9);
        System.out.println(pow);
    }

    static double myPow(double x, int n) {
        if(x==1){
            return 1;
        }
        else {
            if (n == 0) {
                return 1;
            } else if (n > 0) {
                double sum = 1;
                for (int i = 0; i < n; i++) {
                    sum *= x;
                }
                return sum;
            } else {
                if(n<-1111111111)
                {
                    return 0;
                }
                else {
                    double sum = 1;
                    for (int i = 0; i < (-n); i++) {
                        sum *= x;
                    }
                    double s = 1 / sum;
                    return s;
                }
            }
        }
    }
}
