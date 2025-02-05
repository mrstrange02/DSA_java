 
 import java.util.Stack;
 import java.util.HashMap;
 import java.util.Map;


 
 class Node
{
    int data;
    Node next;

    Node(int data1,Node next1)
    {
        this.data=data1;
        this.next=next1;  
    }
    Node(int data1)
    {
        this.data=data1;
        this.next=null; 
    }
}

 //convert Array to Linked List
 
public class array_to_ll
{

    //TC O(N)
    private static Node convertArr2LL(int a[])
    {
        Node head=new Node(a[0]);
        Node mover=head;

        for(int i=1;i<a.length;i++)
        {
            Node temp=new Node(a[i]);
            mover.next=temp;
            mover=temp;

        }
        return head;
    }





    private static int lengthOfLL(Node head)
     {
        int count=0;
        Node temp=head;
        while(temp!=null)
        {
            temp=temp.next;
            count++;
        }
        return count;
     }




     private static int checkIfPresent(Node head,int val)
     {
        Node temp=head;
        while(temp!=null)
        {
            if(temp.data==val) return 1;
            temp=temp.next;
        
        }
        return 0;
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
  

     private static Node removeHead(Node head)
     {
        if(head==null) return head;
        
         head=head.next;
         return head;
        
     }




     public static Node removeTailNode(Node head)
     {
         if(head==null || head.next==null) return null;

         Node temp=head;
         while(temp.next.next!=null)
         {
              temp=temp.next;
         }

         temp.next=null;
         return head;
     }


  // delete by position
     public static Node removeK(Node head,int k)
     {
            if(head==null) return head;
            if(k==1)
            {
              head=head.next;
              return head;
    
            }

            int count=0;
            Node temp=head;
            Node prev=null;
            while(temp!=null)
            {
                count++;
                if(count==k)
                {
                    prev.next=prev.next.next;
                    break;
                }

                prev=temp;
                temp=temp.next;
            }
            return head;


     }

      //remove element by value

     public static Node removeEl(Node head,int el)
     {
            if(head==null) return head;
            if(head.data==el)
            {
                head=head.next;
                return head;
    
            }

            Node temp=head;
            Node prev=null;
            while(temp!=null)
            {
                
                if(temp.data==el)
                {
                    prev.next=prev.next.next;
                    break;
                }

                prev=temp;
                temp=temp.next;
            }
            return head;


      }

     //insert element at head
     public static Node insertHead(Node head,int val)
     {
         Node temp=new Node(val,head);
         return temp;
     }


//insert element at tail

     public static Node insertTail(Node head,int val)
     {
        if(head==null)
        {
            return new Node(val);
        }

        Node temp=head;
        while(temp.next!=null)
        {
            temp=temp.next;
        }

        Node newNode=new Node(val);
        temp.next=newNode;

        return head;
     }



//insert at position

   public static Node insertPos(Node head,int val,int k)
   {
      if(head==null)
      {
        if(k==1)
        {
            return new Node(val);
        }
        else{
            return head;
        }
      }

      if(k==1)
      {
         return new Node(val,head);
      }

      int count=0;
      Node temp=head;
      while(temp!=null)
      {
        count++;
        if(count==(k-1))
        { 
            Node x=new Node(val,temp.next);
            temp.next=x;
            break;
        }
        temp=temp.next;

      }
      return head;

   }



   //by value

   public static Node insertBeforeVal(Node head,int el,int val)
   {
      if(head==null)
      {
        return null;
      }

      if(head.data==val)
      {
         return new Node(el,head);
      }

      
      Node temp=head;
      while(temp.next!=null)
      {
      
        if(temp.next.data==val)
        { 
            Node x=new Node(val,temp.next);
            temp.next=x;
            break;
        }
        temp=temp.next;

      }
      return head;

   }

   //reverse of a linked list
   //TC O(2N)
   //SC O(N)

   public static Node reverse(Node head)
   {
      Stack<Integer> st=new Stack<>();
      Node temp=head;
      while(temp!=null)
      {
        st.push(temp.data);
        temp=temp.next;

      }

      temp=head;
      while(temp!=null)
      {
        temp.data=st.pop();
        temp=temp.next;
      }
      return head;

   }

   //optimal solution

   public static Node reverseOptimal(Node head)
   {

     Node temp=head;
     Node prev=null;


    while(temp!=null)
    {
      Node front=temp.next;
        temp.next=prev;
        prev=temp;
        temp=front;

    }
      return prev;
   }

   //in recursive

   public static Node reverseRecursion(Node head)
   {
   
    if(head==null || head.next==null)
    {
        return head;
    }
      Node newhead=reverseRecursion(head.next);
      Node front=head.next;
      front.next=head;
      head.next=null;
      return newhead;
   }

   //Detect a loop in the ll

   public static boolean detectLoop(Node head)
   {
     Node temp=head;
     Map <Node, Integer> mp=new HashMap<>();
     while(temp!=null)
     {
        if(mp.containsKey(temp))
        {
            return true;
        }
        mp.put(temp,1);
        temp=temp.next;
     }
     return false;
   }


   //optimal solution  using tortoise and hare

   public static boolean detectCycle(Node head)
   {
    Node slow=head;
    Node fast=head;

    while(fast!=null && fast.next!=null)
    {
         slow=slow.next;
         fast=fast.next.next;

         if(slow==fast)
         {
            return true;
         }
    }
    return false;
   }




    public static void main(String []args)
    {
        int arr[]={12,3,4,5,4,9};
        Node head= convertArr2LL(arr);
        //System.out.println(head.data);

        // Node temp=head;
        // while(temp!=null)
        // {
        //     System.out.print(temp.data+" ");
        //     temp=temp.next;
        // }


        // System.out.println(lengthOfLL(head));

        // System.out.println(checkIfPresent(head,6));

        // head=removeHead(head);

        //head=removeTailNode(head);

        // head=removeK(head,1);

        // head=removeEl(head,5);
        //head=insertHead(head,100);
       // head=insertTail(head,101);

    // head=reverseOptimal(head);

    // head=reverseRecursion(head);
  // System.out.println( detectCycle(head));
        
        print(head);

    }   
}
    

