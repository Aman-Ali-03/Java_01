package Java_01;
class MThread extends Thread{
    public void run(){
        int i=0;
        while(true){
            System.out.println(i++);
            try{
                Thread.sleep(1000);
            }
            catch(InterruptedException e){
                System.out.println(e.getMessage());
            }
        }

    }
}
public class Sleep {
    public static void main(String[] args) {
        MThread t1=new MThread();
        t1.start();
    }
}
