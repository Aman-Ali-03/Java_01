package Java_01;
class glace <T>
{
    private T k;
    public void setk(T l){
        k=l;
    }
    public T getk(){
        return k;
    }
}
class gl <T>
{
    T[] arr = (T[]) new Object();
}
public class Generic
{
    public static void main(String[] args)
    {
        //MAke a object of Generic object
        //glace<String> ok =new glace();
        //ok.setk("Hello");
        //
        //LEarning generic method
        //show(new String[]{"Hello","Aman","How Are You"});
        //show(new Integer[] {1,2,3,4,5,6,7});
        //Array of Generic

    }
    static <T extends String> void show (T[] o){
        for(T X:o){
            System.out.println(X);
        }
    }

}
