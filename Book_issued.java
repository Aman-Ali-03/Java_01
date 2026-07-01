package Java_01;
class data {
    boolean flag = true;
    public synchronized void display (String name){
        while(flag != true){
            try{wait();}catch(InterruptedException e){}
        }
        System.out.println(name + " is issuing the book...");
        try{Thread.sleep(1000);}catch(InterruptedException e){}
        System.out.println("Book issued to "+ name);
        flag = true;
        notify();
        try{Thread.sleep(1000);}catch(InterruptedException e){}
    }
}
class student extends Thread{
    data da;
    String name;
    public student (String name, data dat){
        this.name = name;
        da=dat;
    }
    public void running (){
        da.display(name);
    }
    public void run(){
        running();
    }
}
public class Book_issued {
    public static void main(String[] args){
        data d = new data();
        student s1 = new student ("John",d);
        student s2 = new student ("Mary",d);
        s1.start();
        s2.start();
    }
}
