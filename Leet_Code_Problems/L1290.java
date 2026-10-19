package Leet_Code;
import java.util.Scanner;

class Node
{
    int data;
    Node next;

    Node(int data)
    {
        this.data = data;
        this.next = null;
    }
}
public class L1290
{
    static Scanner sc = new Scanner(System.in);
    static Node head=null;

    static void insert()
    {
        System.out.println("Enter your node element: ");
        int data = sc.nextInt();
        Node newnode = new Node(data);

        if (head == null) {
            head = newnode;
        } else {
            Node temp = head;

            while (temp.next != null) {
                temp = temp.next;
            }

            temp.next = newnode;
        }
    }

    static void display()
    {
        if(head==null)
        {
            System.out.println("Linked list does't have any node.");
        }
        else
        {
            System.out.println("===================================================================");
            Node temp = head;
            while(temp!=null)
            {
                System.out.print(temp.data + "\t");
                temp = temp.next;
            }
            System.out.println("\n===================================================================");
        }
    }

    static int getDecimalValue(Node heead) {
        Node temp = heead;
        int counter = -1;
        int decimal = 0;
        while(temp!=null)
        {
            counter++;
            temp = temp.next;
        }
        temp = heead;
        while(temp!=null)
        {
            if(temp.data==1)
            {
                decimal += 1 << counter;   // bitwise shift;
            }
            counter--;
            temp = temp.next;
        }
        return decimal;
    }
    public static void main(String[] args)
    {
        int choice;
        do{
            System.out.println("==================================");
            System.out.println("1. Add node.");
            System.out.println("2. Display Linked List.");
            System.out.println("3. Get the Decimal Number.");
            System.out.println("4. Exit.");
            System.out.println("==================================");
            System.out.println("Enter your choice: ");
            choice = sc.nextInt();
            switch (choice)
            {
                case 1:
                    insert();
                    break;
                case 2:
                    display();
                    break;
                case 3:
                    System.out.println(getDecimalValue(head));
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Invalid Choice.");
            }
        }while(choice!=4);
    }
}
