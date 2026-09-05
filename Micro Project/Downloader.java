package Java_01;
class down {
    public synchronized void display (String app){
        for(byte b=10; b<=100; b+=10){
            System.out.println(app + " Downloading..." + b +"%");
            try{Thread.sleep(500);}catch(InterruptedException e){}
        }
        System.out.println("");
        System.out.println("Download complete.");
        try{Thread.sleep(900);}catch(InterruptedException e){}
    }
}
class ThreadD extends Thread {
    down d;
    String app;
    public ThreadD (String app, down dow){
        this.app = app;
        d=dow;
    }
    public void caller(){
        d.display(app);
    }
    public void run(){
        caller();
    }
}
public class Downloader {
    public static void main(String[] args){
        down d = new down();
        ThreadD t1 = new ThreadD("Whatsapp",d);
        ThreadD t2 = new ThreadD("Instagram",d);
        ThreadD t3 = new ThreadD("Facebook",d);
        t1.start();
        t2.start();
        t3.start();
    }
}
