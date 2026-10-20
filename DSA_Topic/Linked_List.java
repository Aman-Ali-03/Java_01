package Java_01.DSA_Topic;
import java.util.Scanner;
class node
{
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

    static void insert_Back(){
        System.out.print("Enter your element: ");
        int data = sc.nextInt();
        node newnode = new node(data);
        if(last==null)
        {
            last = newnode;
            head = newnode;
        }
        else
        {
            last.next = newnode;
            last = newnode;
        }
    }

    static void insert_Perticular_Location()
    {
        System.out.print("Enter the element: ");
        int data = sc.nextInt();
        node newnode = new node(data);
        System.out.print("Enter position: ");
        int position = sc.nextInt();
        node temp = head;
        for(int i=1; i<position-1; i++)
        {
            temp = temp.next;
        }
        newnode.next = temp.next;
        temp.next = newnode;
    }

    static void delete_Front()
    {
        if(head == null)
        {
            System.out.println("Linked list doen't have any node.");
        }
        else{
            System.out.println(head.data + " is deleted from the linked list.");
            head = head.next;
        }
    }

    static void delete_Back()
    {
        if(last == null)
        {
            System.out.println("Linked list does't have any node.");
        }
        else{
            System.out.print(last.data + " is deleted from the linked list.");
            node temp = head;
            while(temp.next != last)
            {
                temp = temp.next;
            }
            temp.next = null;
            last = temp;
        }
    }

    static void delete_Perticular_Location()
    {
        if(head == null)
        {
            System.out.println("Linked list does't have any node.");
        }
        else
        {
            System.out.print("Enter Position: ");
            int position = sc.nextInt();
            node temp = head;
            for(int i=1; i<position-1; i++)
            {
                temp = temp.next;
            }
            temp.next = temp.next.next;
        }
    }

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

    static void count_Node()
    {
        node temp = head;
        int counter = 0;
        while(temp != null)
        {
            temp = temp.next;
            counter += 1;
        }
        System.out.print(counter + " Node at Linked list.\n");
    }

    static void search_Node()
    {
        System.out.print("Enter the element to search the node.");
        int search_for = sc.nextInt();
        node temp = head;
        int Node_position = 0;
        while(temp != null)
        {
            Node_position += 1;
            temp = temp.next;
            if(temp.data == search_for)
            {
                System.out.print("At node NO. " + Node_position);
                return;
            }
        }
        System.out.print("Element not found at Linked List.");
    }

    public static void main(String[] args)
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