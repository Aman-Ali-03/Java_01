package Java_01;
interface animal {
    void sound ();
}
class Cat implements animal {
    public void sound(){
        System.out.println("Cat: Meow");
    }
}
class dog implements animal {
    public void sound(){
        System.out.println("Dog: Bark");
    }
}
class cow implements animal {
    public void sound(){
        System.out.println("Cow: Moo");
    }
}
public class Animal {
    public static void main(String[] args){
        Cat c = new Cat();
        dog d = new dog();
        cow C = new cow();
        c.sound();
        d.sound();
        C.sound();

    }
}
