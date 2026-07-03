package Java_01;
import java.io.FileNotFoundException;
import java.io.FileInputStream;
import java.io.IOException;

public class Read_File {
    public static void main(String[] args) {
        try{
            FileInputStream fil = new FileInputStream("D:/test.txt");

            byte[] b = new byte[fil.available()];

            fil.read(b);

            String re = new String(b);

            System.out.println(re);
        }
        catch(FileNotFoundException e){
            System.out.println(e.getMessage());
        }
        catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
