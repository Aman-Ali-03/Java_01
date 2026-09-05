package Java_01;
import java.util.Scanner;
class student{
    public int rollno;
    public String name;
    public String course;
    public int marks[]= new int[5];

    public int total(){
        return marks[0]+marks[1]+marks[2]+marks[3]+marks[4];
    }
    public double average(){
        return total()/5;
    }
    public void grade(){
        if(average()>90){
            System.out.println("Grade : A");
        }
        else if(average()<90 || average() >70){
            System.out.println("Grade : B");
        }
        else{
            System.out.println("Grade : C");
        }
    }
}
public class Student_Class {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        student s1 = new student();
        System.out.println("Enter Roll No:");
        s1.rollno = input.nextInt();
        System.out.println("Enter Course:");
        s1.course = input.next();
        System.out.println("Enter Five Subject Marks:");
        s1.marks[0]=input.nextInt();
        s1.marks[1]=input.nextInt();
        s1.marks[2]=input.nextInt();
        s1.marks[3]=input.nextInt();
        s1.marks[4]=input.nextInt();
        System.out.println("Enter Name:");
        s1.name = input.nextLine();

        System.out.println("Hlw " + s1.name);
        System.out.println("Your roll no : " + s1.rollno);
        System.out.println("This is your course : " + s1.course);
        System.out.println("Total marks : " + s1.total());
        System.out.println("Average marks : " + s1.average());
        System.out.print("You have " );
        s1.grade();
    }
}
