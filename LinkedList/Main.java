import java.util.*;


class Node 
{
    int data;
    Node next;

    
    public Node(int data, Node next) 
    {
        this.data = data;
        this.next = next;
    }


    public Node(int data)
    {
        this.data = data;
        next = null;
    }
}


public class Main 
{
    // Function to print the linked list
    public static void printLL(Node head) 
    {
        while (head != null)
         {
            System.out.print(head.data + " ");
            head = head.next;
         }
    }

    // Function to insert a new node at the head of the linked list
    public static Node insertHead(Node head, int val)
     {
        Node temp = new Node(val, head);
        return temp;
     }

    public static void main(String[] args) 
    {
        // Sample array and value for insertion
        List<Integer> arr = Arrays.asList(12, 8, 5, 7);
        int val = 100;

        // Creating a linked list with initial elements from the array

        Node head = new Node(arr.get(0));
        head.next = new Node(arr.get(1));
        head.next.next = new Node(arr.get(2));
        head.next.next.next = new Node(arr.get(3));

        // Inserting a new node at the head of the linked list
        
        head = insertHead(head, val);

        // Printing the linked list
        printLL(head);
    }
}