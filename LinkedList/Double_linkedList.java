import java.util.*;

class Node{

    public int data;
    public Node next;
    public Node back;

    Node(int data,Node next,Node back)
    {
        this.data=data;
        this.next=next;
        this.back=back;
    }

    Node(int data)
    {
        this.data=data;
        this.next=null;
        this.back=null;
    }


}



public class Double_linkedList {
    


    public static Node ConvertArr2Dll(int[] a)
    {
       Node head=new Node(a[0]);
       Node prev=head;

       for(int i=1;i<a.length;i++)
       {
         Node temp=new Node(a[i],null,prev); 
         prev.next=temp;
         prev=temp;
       }
       return head;
    }


    public static void print(Node head)
     {
        Node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
          System.out.println();
     }

     private static Node deleteHead(Node head)
     {
         if(head==null || head.next==null)
         {
            return null;
         }

         //Node prev=head;
         head=head.next;
         head.back=null;
         //prev.next=null; 

         return head;
     }

     private static Node deleteTail(Node head)
     {
         if(head==null || head.next==null)
         {
            return null;
         }
          Node tail=head;
          while(tail.next!=null)
          {
            tail=tail.next;

          }
          Node prev=tail.back;
          prev.next=null;
          //tail.back=null;

          return head;
        }


        private static Node removeK(Node head,int k)
        {
            if(head==null)
            {
                return null;
            }
            int count=0;
            Node temp=head;
            while(temp!=null)
            {
                count++;
                if(count==k) break;
                temp=temp.next;

            }

            Node prev=temp.back;
            Node front=temp.next;

            if(prev==null &&  front==null )
            {
                return null;
            }
            
            else if(prev==null)
            {
                return deleteHead(head);
            }

            else if(front==null)
            {
                return deleteTail(head);
            }

            prev.next=front;
            front.back=prev;

            return head;
        }


        static void deleteNode(Node temp)
        {
            Node prev=temp.back;
            Node front=temp.next;
            if(front==null)
            {
                prev.next=null;
                temp.back=null;
                return;
            }

            prev.next=front;
            front.back=prev;
            //temp.next=temp.back=null;
     

        }


    static Node insertBeforeHead(Node head,int val)

    {
        Node newhead=new Node(val,head,null);
        head.back=newhead;
        return newhead;

    }


    static Node insertBeforeTail(Node head,int val)
    {
        Node tail=head;

        while(tail.next!=null)
        {
            tail=tail.next;

        }

        Node prev=tail.back;
        Node newnode=new Node(val,tail,prev);
        prev.next=newnode;
        tail.back=newnode;

        return head;
    }


    static Node insertBeforeK(Node head,int k,int val)
    {

        if(k==1)
        {
            return insertBeforeHead(head, val);
        }
        int count=0;
        Node temp=head;
        while(temp!=null)
        {
            count++;

            if(count==k) break;
            temp=temp.next;
        }
        Node prev=temp.back;
        Node newNode=new Node(val,temp,prev);
        prev.next=newNode;
        temp.back=newNode;

        return head;

    }

    static void insertBeforeNode(Node node,int val)
    {
        Node prev=node.back;
        Node newNode=new Node(val,node,prev);
        prev.next=newNode;
        node.back=newNode;
    }


    //Reverse of a liinked list 
    //TC O(n)


    static Node reverseDll(Node head)
    {
        if(head==null ||head.next==null)
        {
            return head;
        }

        Node current=head;
        Node prev=null;

        while(current!=null)
        {
            prev=current.back;
            current.back=current.next;
            current.next=prev;
            current=current.back;
        }
        return prev.back;


    }


    //middle element in a linkedlist

    //Tc O(n+n/2)

    static Node middleNode(Node head)
    {
        Node temp=head;
        int count=0;
        while(temp!=null)
        {
            count++;
            temp=temp.next;

        }

        int mid=(count/2)+1;
        temp=head;
        while(temp!=null)
        {
            mid=mid-1;
            if(mid==0) break;

            temp=temp.next;
        }
        return temp;
    }

    //Tortise and hare approch

    static Node middleNode1(Node head)
    {
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    public static void main(String[] args)
     {
        int arr[]={12,6,7,9,10};
        Node head=ConvertArr2Dll(arr);

        //head=deleteHead(head);

        //head=deleteTail(head);

        // head=removeK(head, 5);
        // deleteHead(head.next);

        // head=insertBeforeHead(head, 11);
        // head=insertBeforeTail(head, 11);

        // head=insertBeforeK(head,2,20);

        // insertBeforeNode(head.next.next,30);

        //head=reverseDll(head);

        head=middleNode1(head);


        
        print(head);
     }

}
