import java.util.*;
public class basic_maths
{
    
 public static int digits_in_num(int n)
 {
     int count=0;
     while(n>0)
     {
        n=n/10;
        count++;
     }
     return count;
 }

 public static int reverse(int n)
 {
   int rev=0;
   while(n>0)
   {
    int ld=n%10;
    rev=(rev*10)+ld;
    n=n/10;
   }
   return rev;
 }
 
 public static void palindrome(int n)
 {
    int m=n;
    int rev=0;
    while(n>0)
    {
      int ld=n%10;
      rev=(rev*10)+ld;
      n=n/10;

      
    }
    if(m==rev)
    {
      System.out.println("palindrome");
    }
    else{
      System.out.println("Not palindrome");
    }
 }

 public static void armstrong(int n)
 {
   int count=0;
   int ld,dub=n,temp=n;
   double sum=0;

   while(n>0)
   {
      n=n/10;
      count++;

   }

   while(temp>0)
   {
     ld=temp%10;
     sum=sum+Math.pow(ld,count);
     temp=temp/10;
   }

   if(dub==sum)
   {
    System.out.println("Armstrong");

   }
   else
   {
    System.out.println("not Armstrong");
   }
 }

 public static void prime(int n)
 {
  int count=0;
     for(int i=1;i<=n;i++)
     {
           if(n%i==0)
           {
             count++;
           }
     }
     if(count==2)
     {
       System.out.println("Prime Number");

     }
     else{
      System.out.println(" not Prime Number");
     }

   }

   
 
      public static void main(String []args)
      {
        //int n=reverse(123);
        //System.out.println("No of digits "+n);
        prime(11);
      }
}
