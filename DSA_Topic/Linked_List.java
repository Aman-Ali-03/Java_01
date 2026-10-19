package Java_01.DSA_Topic;
import java.util.Scanner;

class node{
    int data;
    node next;

    node (int data)
    {
        this.data = data;
        this.next = null;
    }
}
public class Linked_List
{
    static Scanner sc = new Scanner(System.in);
    static node head = null;
    static node last = null;

    static void insert_Front(){
        System.out.println("Enter your element: ");
        int data = sc.nextInt();
        node newnode = new node(data);

        if(head == null)
        {
            head = newnode;
            last = newnode;
        }
        else
        {
            newnode.next = head;
            head = newnode;
        }
    }

    static void insert_Back(){}
    static void insert_Perticular_Location(){}
    static void delete_Front(){}
    static void delete_Back(){}
    static void delete_Perticular_Location(){}
    static void display(){
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
    static void count_Node(){}
    static void search_Node(){}

    public static void main(String[] args)
    {
        int choice;
        do{
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
            System.out.println("Enter Your Choice: ");
            choice = sc.nextInt();
            switch(choice)
            {
                case 1:
                    insert_Front();
                    break;
                case 2:
                    insert_Back();
                    break;
                case 3:
                    insert_Perticular_Location();
                    break;
                case 4:
                    delete_Front();
                    break;
                case 5:
                    delete_Back();
                    break;
                case 6:
                    delete_Perticular_Location();
                    break;
                case 7:
                    display();
                    break;

                case 8:
                    count_Node();
                    break;

                case 9:
                    search_Node();
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
