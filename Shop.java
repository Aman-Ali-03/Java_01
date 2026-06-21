package Java_01;
interface member{
    void callback();
}
class store {
    member memb[] = new member[100];
    int count=0;
    void register(member m){
        memb[count++]=m;
    }
    void invitesale(){
        for(int i=0; i<count; i++){
            memb[i].callback();
        }
    }
}
class customer implements member {
    String name;
    customer(String n){
        name=n;
    }
    public void callback(){
        System.out.println("ok, I will visit " + name);
    }
}
public class Shop {
    public static void main(String[] args){
        store s = new store();
        customer c1=new customer("Amaan");
        customer c2 = new customer("Arman");
        customer c3 = new customer("Asad");
        s.register(c1);
        s.register(c2);
        s.register(c3);
        s.invitesale();
    }
}
