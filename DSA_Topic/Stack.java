package Java_01.DSA_Topic;
import java.util.Scanner;
class Element
{
    int data;
    Element previous;

    Element(int data)
    {
        this.data = data;
        previous = null;
    }
}
public class Stack
{
    static Scanner sc = new Scanner(System.in);
    static Element top=null;

    static void insert()
    {
        System.out.print("Enter your element: ");
        int data = sc.nextInt();
        Element newnode = new Element(data);
        if(top == null)
        {
            top = newnode;
        }
        else
        {
            newnode.previous = top;
            top = newnode;
        }
    }

    static void display()
    {
        if(top == null)
        {
            System.out.println("Stack Is Empty.");
        }
        else
        {
            Element temp = top;
            System.out.println("==========================================");
            while(temp != null)
            {
                System.out.print(temp.data + "\t");
                temp = temp.previous;
            }
            System.out.println("\n==========================================");
        }
    }

    static void pop()
    {
        if(top == null)
        {
            System.out.println("Stack Is Empty.");
        }
        else
        {
            System.out.println(top.data + " is deleted from the stack.");
            top = top.previous;
        }
    }

    public static void main(String[] args)
    {
        int choice;
        do
        {
            System.out.println("==========================================");
            System.out.println("1. Insert Element.");
            System.out.println("2. Display Stack.");
            System.out.println("3. Pop Element.");
            System.out.println("4. Exit.");
            System.out.println("==========================================");
            System.out.println("Enter your choice: ");
            choice = sc.nextInt();
            switch(choice)
            {
                case 1:
                    insert();
                    break;
                case 2:
                    display();
                    break;
                case 3:
                    pop();
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Invalid Choice.");
            }
        }while(choice!=4);
    }
}
