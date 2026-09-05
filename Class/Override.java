package Java_01;
class tv {
    public void method1(){
        System.out.println("method1");
    }  
    public void method2(){
        System.out.println("method2");
    }
}
class tv2 extends tv{
    public void method2(){
        System.out.println("Second tv method2");
    }
    public void method3(){
        System.out.println("Second tv method3");
    }
}
public class Override {
    public static void main(String[] args){
        tv t1 = new tv();
        t1.method1();
        t1.method2();
        
        tv2 t2 = new tv2();
        t2.method2();
        t2.method3();
        
        tv t3 = new tv();
        t3.method2();
    }
}
