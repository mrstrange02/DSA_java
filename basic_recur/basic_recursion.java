package basic_recur;

public class basic_recursion {


    //print name n times
    //tc O(n)
    //sc O(n)

    static void f1(int i,int n)
    {
        if(i>n)
        {
            return;
        }
        System.out.println("SPK");
        f1(i+1,n);
    }

    //print 1-N; like 1 2 3 4....

    static void f2(int i,int n)
    {
        if(i>n)
        {
            return;
        }
        
        System.out.println(i);
        f2(i+1,n);
    }

    //print n terms of N-1
    static void f3(int i)
    {
        if(i<1)
        {
            return;
        }
        
        System.out.println(i);
        f3(i-1);
    }


    //factorial

    static int f4(int n)
    {
        if(n==0)
        {
            return 1;

        }
        return n*f4(n-1);
    }

    //sum of numbers
    static int f5(int n)
    {
        if(n==0)
        {
            return 0;

        }
        return n+f5(n-1);
    }






    public static void main(String []args)
    {
         System.out.println(f5(2));
        
    }
    
}
