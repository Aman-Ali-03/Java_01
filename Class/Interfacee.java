package Java_01;
abstract class phone {
    abstract void call();
    abstract void sms();
}
interface camera {
    void click_photo();
    void make_video();
    void filter();
}
interface music {
    void play();
    void pause();
    void stop();
    void change();
}
class smart_phone extends phone implements camera,music {
    public void call(){
        System.out.println("Calling smart phone.");
    }
    public void sms(){
        System.out.println("Sending sms message.");
    }
    public void click_photo(){
        System.out.println("Clicking Photos.");
    }
    public void make_video(){
        System.out.println("Making video");
    }
    public void filter(){
        System.out.println("Beauty filter is edit.");
    }
    public void play(){
        System.out.println("Play the music.");
    }
    public void pause(){
        System.out.println("Pause the music.");
    }
    public void stop(){
        System.out.println("Stop the music.");
    }
    public void change(){
        System.out.println("Change the music.");
    }
}
public class Interfacee {
    public static void main(String[] args) {
        //smart_phone s = new smart_phone();
        //phone p = s;
        //music m = s;
        //camera c = s;
    }
}
