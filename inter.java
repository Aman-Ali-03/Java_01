package Java_01;
class MyData {
    int value;
    boolean flag = true;
    synchronized public void set(int v){
        while(flag!=true)
            try{
                wait();
            }
            catch(InterruptedException e){
                System.out.println(e);
            }
            value = v;
            flag = false;
            notify();
    }
    synchronized public int get(){
        while(flag==true)
            try{
                wait();
            }catch(InterruptedException e){
                System.out.println(e);
            }
            flag = true;
            notify();
        return value;
    }
}
class Producer extends Thread{
    MyData d;
    public Producer (MyData dat){
        d=dat;
    }
    int i=0;
    public void run(){
        while(true){
            d.set(i);
            System.out.println("Producer " + i);
            i++;
        }
    }
}
class Consumer extends Thread{
    MyData data;
    public Consumer (MyData da){
        data=da;
    }
    int i;
    public void run(){
        while(true){
            i=data.get();
            System.out.println("Consumer " + i);
        }
    }
}
public class inter {
    public static void main(String[] args){
        MyData d = new MyData();
        Producer p = new Producer(d);
        Consumer c = new Consumer(d);
        p.start();
        c.start();
    }
}
