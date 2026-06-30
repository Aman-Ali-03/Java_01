package Java_01;
class MyData {
    synchronized void Display (String str){
    //void Display (String str){
        //synchronized (this) {
            for (byte i = 0; i < str.length(); i++) {
                System.out.print(str.charAt(i));
            }
        //}
    }
}
class Mythread1 extends Thread{
    MyData d;
    Mythread1(MyData dat){d=dat;}
    public void run(){
        d.Display("Hello World ");
    }
}
class MyThread2 extends Thread {
    MyData Data;
    MyThread2(MyData dat){Data=dat;}
    public void run(){
        Data.Display("Welcome");
    }
}
public class Synchronized {
    public static void main(String[] args){
        MyData d=new MyData();
        Mythread1 t1=new Mythread1(d);
        MyThread2 t2 = new MyThread2(d);
        t1.start();
        t2.start();
    }
}
