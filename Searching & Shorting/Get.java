package Java_01;
class MyThread extends Thread{
    public MyThread(String name) {
        super(name);
    }
}
public class Get {
    public static void main(String[] args){
        MyThread t = new MyThread ("My thread");
        t.setPriority(3);
        System.out.println("Id: "+t.getId());
        System.out.println("Name: "+t.getName());
        System.out.println("Priority: "+t.getPriority());
        System.out.println("Alive: "+t.isAlive());
        System.out.println("State: "+t.getState());
    }
}
