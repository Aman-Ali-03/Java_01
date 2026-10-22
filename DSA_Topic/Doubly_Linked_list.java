package Java_01.DSA_Topic;
import java.util.Scanner;

class node
{
    int data;
    node next;
    node previous;

    node(int data)
    {
        this.data = data;
        this.next = null;
        this.previous = null;
    }
}
public class Doubly_Linked_list
{
    static Scanner sc = new Scanner(System.in);
    static node head,last;

    static void Add_start()
    {
        System.out.print("Enter your element: ");
        int data = sc.nextInt();
        node newnode = new node(data);

        if(head == null)
        {
            head = newnode;
            last = newnode;
        }
        else
        {
            head.next = newnode;
            newnode.previous = head;
            head = newnode;
        }
    }

    static void Add_last()
    {
        
    }
    
    static void Add_per_loc(){}
    static void delete_start(){}
    static void delete_end(){}
    static void delete_per_loc(){}

    static void display()
    {
        if(head==null)
        {
            System.out.println("Your Linked List Does't Have Node.");
        }
        else
        {
            node temp = head;
            System.out.println("===============================================================================");
            System.out.println("\t\tLinked List Node.");
            System.out.println("===============================================================================");
            while(temp!=null)
            {
                System.out.print(temp.data + "  ");
                temp = temp.next;
            }
            System.out.println("\n===============================================================================");
        }
    }

    static void count(){}
    static void search(){}

    static void main(String[] args)
    {
        int choice;
        do {
            System.out.println("===============================================================================");
            System.out.println("1. Add Node At Start.");
            System.out.println("2. Add Node At Last.");
            System.out.println("3. Add Node At Given Location.");
            System.out.println("4. Delete Start Node.");
            System.out.println("5. Delete Last Node.");
            System.out.println("6. Delete Specific Node.");
            System.out.println("7. Display.");
            System.out.println("8. Count Node.");
            System.out.println("9. Search Node.");
            System.out.println("10. Exit.");
            System.out.println("===============================================================================");
            System.out.println("Enter your Choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    Add_start();
                    break;
                case 2:
                    Add_last();
                    break;
                case 3:
                    Add_per_loc();
                    break;
                case 4:
                    delete_start();
                    break;
                case 5:
                    delete_end();
                    break;
                case 6:
                    delete_per_loc();
                    break;
                case 7:
                    display();
                    break;
                case 8:
                    count();
                    break;
                case 9:
                    search();
                    break;
                case 10:
                    System.out.println("Exiting Program...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid Choice!");
            }
        }while(choice!=10);
    }
}
