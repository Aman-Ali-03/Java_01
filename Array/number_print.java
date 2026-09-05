package Java_01;
class monitor {
        public void runner ( int i,int j){
            synchronized (this) {
                for (int n = i; n <= j; n++) {
                    System.out.print(n + " ");
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                    }
                }
            }
    }
}
class thread extends Thread{
    monitor m;
    thread (monitor mat){
        m = mat;
    }
    public void run(){
        m.runner(1,10);
    }
}
class thread1 extends Thread{
    monitor mo;
    thread1 (monitor mat){
        mo = mat;
    }
    public void run(){
        mo.runner(11,20);
    }
}
public class number_print {
    public static void main(String[] args){
        monitor m = new monitor();
        thread t = new thread(m);
        thread1 t1 = new thread1(m);
        t.start();
        t1.start();
    }
}
