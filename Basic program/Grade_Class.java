package Java_01;
import java.util.Scanner;
class Student {
    private String name ;
    private short marks[] = new short[5];

    public String getname(){
        return name;
    }
    public void setname(String name){
        this.name=name;
    }
    public short[] getmarks(){
        return marks;
    }
    public void inputmarks() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter " + marks.length + " integers:");
        for (int i = 0; i < marks.length; i++) {
            marks[i] = sc.nextShort();
        }
    }
    public byte grade(){
        byte grade=0;
        for(byte i=0; i<marks.length; i++){
            grade = (byte)(grade + marks[i]);
        }
        return grade;
    }
}
public class Grade_Class {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Student s1 = new Student();
        System.out.println("Enter Student name:");
        s1.setname(input.nextLine());
        System.out.println("Enter Student marks:");
        s1.inputmarks();
        byte grade = s1.grade();
        if(grade>90){
            System.out.println("Grade : A");
        }
        else if(grade<90 || grade>70){
            System.out.println("Grade : B");
        } 
        else if (grade<70 || grade>50) {
            System.out.println("Grade : C");
        }
        else {
            System.out.println("Grade : F");
        }
    }
}
