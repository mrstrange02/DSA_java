public class LinkedList_by_apna {

    
    public static class Node
    {
        int data;
        Node next;

        public Node(int data)
        {
            this.data=data;
            this.next=null;
        }

    }

    public static Node head;
    public static Node tail;
    public static int size;
    
    public void addFirst(int data) //O(1)
    {
        //create new node
        Node newNode=new Node(data);
        size++;

        if(head==null)
        {
            head=tail=newNode;
            return;
        }

        //newNode next=head

        newNode.next=head;

        //head=newNode

        head=newNode;
    }


    public void addLast(int data) //O(1)
    {
        Node newNode=new Node(data);
        size++;
          
        if(head==null)
        {
            head=tail=newNode;
            return;
        }

        tail.next=newNode;
        tail=newNode;

    }

    public void display()  //O(N);
    {
        if(head==null)
        {
            System.out.println("LL is empty");
            return;

        }
        Node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
     System.out.println("null");
        

    }

    //add at Position


    public void addatPos(int ind,int data)
    {
        if(ind==0)
        {
            addFirst(data);
            return;
        }
        size++;
        Node newNode=new Node(data);
        Node temp=head;
        int i=0;

        while(i<ind-1)
        {
             temp=temp.next;
             i++; 
        }

        //i=ind-1; temp->prev
        newNode.next=temp.next;
        temp.next=newNode;
    }


    public int removeFirst()

    {
        if(size==0)
        {
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        }
        else if(size==1)
        {
            int val=head.data;
           head=tail=null;
           size=0;
           return val;
        }
          int val=head.data;
        head=head.next;
        size--;
        return val;
    }

    public int removeLast()
    {
        if(size==0)
        {
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        }
        else if(size==1)
        {
            head=tail=null;
            int val=head.data;
            size=0;
            return val;
            
        }
        Node prev=head;
        int i=0;
        for(i=0;i<size-2;i++)
        {
            prev=prev.next;
        }
        int val=prev.next.data;
        prev.next=null;
        tail=prev;
        size--;
        return val;
    }


    public int search_iterate(int key)
    {
        Node temp=head;
        int i=0;
        while(temp!=null)
        {
            if(temp.data==key)
            {
                return i;
            }
            temp=temp.next;
            i++;
        }
        return -1;

    }


    public int helper(Node head,int key)
    {
        if(head==null)
        {
            return -1;
        }
        if(head.data==key)
        {
            return 0;
        }
        int ind=helper(head.next,key);
        if(ind==-1)
        {
            return -1;
        }
        return ind+1;
    }
    public int search_recur(int key)
    {
        return helper(head,key);
    }

  // reverse of linked list
    //3 variables 4 steps
    public void reverse()
    {
        Node prev=null;
        Node curr=tail=head;
        Node next;

        while(curr!=null)
        {
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        head=prev;
    }


    public void deleteNthfromEnd(int n)
    {
        int sz=0;
        Node temp=head;
        while(temp!=null)
        {
            temp=temp.next;
            sz++;
        }

        if(sz==n)
        {
            head=head.next;
            return;
        }

        int i=1;
        Node prev=head;
        int ind=sz-n;
        while(i<ind)
        {
            prev=prev.next;
            i++;

        }
        prev.next=prev.next.next;
        return;

        
    }


    //check ll is palindrome or not

    //slow-fast approch   1.find minnode 2. 2nd half reverse  3.check if 1st half=2nd half
    


    public Node findMid(Node head)
    {
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null)
        {
            slow=slow.next; //+1
            fast=fast.next.next; //+  

        }
        return slow; //mid
    }

    public boolean checkPalindrome()
    {
        if(head==null || head.next==null)
        {
            return true;
        }

        Node mid=findMid(head);
         
        Node prev=null;
        Node curr=mid;
        Node next;
        while(curr!=null)
        {
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;

        }

        Node right=prev;
        Node left=head;

        //check id equal

        while(right!=null)
        {
            if(left.data !=right.data)
            {
                return false;
            }

            left=left.next;
            right=right.next;

        }
        return true;
    }
    public static void main(String[] args) {
        LinkedList_by_apna ll=new LinkedList_by_apna();
        
       // ll.addFirst(2);
        ll.addLast(1);
        ll.addLast(3);
        ll.addLast(4);
       // ll.addatPos(2,9);
       ll.addLast(1);
        ll.display();

        System.out.println(ll.checkPalindrome());

        //ll.deleteNthfromEnd(3);
        //ll.display();
        /*System.out.println("linkedlist size is "+ll.size);
        ll.removeFirst();
        ll.display();
        System.out.println("linkedlist size is "+ll.size);
        ll.removeLast();
        ll.display();
        System.out.println("linkedlist size is "+ll.size);
        //System.out.println("index at "+ll.search_iterate(6)); 
        System.out.println("index at "+ll.search_recur(3)); 
        ll.addLast(5);
        ll.display();
        ll.reverse()*/
        

        



    
    }
    
}
