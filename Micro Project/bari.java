package Java_01;
class MyThread extends Thread{
    public void run(){
        int i=1;
        while(true){
            System.out.print(i + "Hello ");
            i++;
        }
    }
}
public class bari{
    public static void main(String[] args) {
        MyThread t1=new MyThread();
        t1.start();
        int i=1;
        while(true){
            System.out.println(i + "World.");
            i++;
        }
    }
}
