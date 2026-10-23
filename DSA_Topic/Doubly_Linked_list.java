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
public class Doubly_Linked_List
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

    static void Add_last() {
        System.out.print("Enter your element: ");
        int data = sc.nextInt();
        node newnode = new node(data);
        if (last == null) {
            head = newnode;
            last = newnode;
        }
        else
        {
            newnode.next = last;
            last.previous = newnode;
            last = newnode;
        }
    }

    static void Add_per_loc()
    {
        System.out.print("Enter the position: ");
        int pos = sc.nextInt();
        System.out.print("Enter your element: ");
        int data = sc.nextInt();
        node newnode = new node(data);
        node temp = head;
        for(int i=1; i<pos-1; i++)
        {
            temp = temp.previous;
        }
        newnode.next = temp;
        newnode.previous = temp.previous;
        temp.previous.next = newnode;
        temp.previous = newnode;
    }

    static void delete_start()
    {
        if(head == null)
        {
            System.out.print("Empty Linked List.");
        }
        else
        {
            head.previous.next = null;
            head = head.previous;
        }
    }

    static void delete_end()
    {
        if(last == null)
        {
            System.out.print("Empty Linked List.");
        }
        else
        {
            last.next.previous = null;
            last = last.next;

        }
    }

    static void delete_per_loc()
    {
        if(head == null)
        {
            System.out.println("Linked List doesn't have node.");
        }
        else
        {
            System.out.print("Enter the position: ");
            int pos = sc.nextInt();
            node temp = head;
            for(int i=2; i<pos; i++)
            {
                temp = temp.previous;
            }
            temp.previous = temp.previous.previous;
            temp.previous.next = temp;
        }
    }

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
                temp = temp.previous;
            }
            System.out.println("\n===============================================================================");
        }
    }

    static void count()
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

    static void search()
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
