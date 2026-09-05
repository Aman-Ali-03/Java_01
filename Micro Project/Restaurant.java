package Java_01;
class server {
    public void serve (String name){
        synchronized(this) {
            System.out.println("Preparing Food for " + name);
            try {
                Thread.sleep(1900);
            } catch (InterruptedException e) {
            }
            System.out.println("Food is Served to " + name + "\n\n");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
            }
        }
    }
}
class waiter extends Thread{
    server se;
    String name;
    public waiter (String name,server s){
        this.name = name;
        se = s;
    }
    void caller(){
        se.serve(name);
    }
    public void run(){
        caller();
    }
}
public class Restaurant {
    public static void main(String[] args){
        server so = new server();
        waiter w1 = new waiter("Aman",so);
        waiter w2 = new waiter("Sonu",so);
        waiter w3 = new waiter("Sammer",so);
        waiter w4 = new waiter("Abdul",so);
        waiter w5 = new waiter("Asad",so);
        waiter w6 = new waiter("Faiz",so);
        w1.start();
        w2.start();
        w3.start();
        w4.start();
        w5.start();
        w6.start();
    }
}
