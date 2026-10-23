package Java_01.File;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Write_File {
    public static void main(String[] args) {
        try{
            FileOutputStream file = new FileOutputStream("D:/test.txt");
            String str = "Hello There is your File.";
            file.write(str.getBytes());
            file.close();
        }
        catch(FileNotFoundException e){
            System.out.println(e.getMessage());
        }
        catch (IOException e){
            System.out.println(e.getMessage());
        }
        
   }
}
