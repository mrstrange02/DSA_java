import java.io.*;

class bitma 
{
     
 //(7)10-------(111)2   decimal to binary
 
      public static String covert2Binary(int n)
      {
         StringBuilder res=new StringBuilder();
         while(n>0)
         {
            if(n%2==1)  res.append('1');
            else  res.append('0');
            n=n/2;

        
         }
         return res.reverse().toString();

      }


      //binary to decimal 

      public static int binary2Decimal(String x)
      {
           int len=x.length();
           int p2=1;
           int num=0;

           for(int i=len-1;i>=0;i--)
           {
              if(x.charAt(i)=='1')
               num=num+p2;
               
               p2=p2*2;
           }
           return num;

      }


      public static void swap2(int a,int b)
      {
         a=a^b;
         b=a^b;
         a=a^b;
         System.out.println("a is "+a+"\n b is "+b);
      }

      //check if the ith bit is set or not

      public static void Ibit(int x,int i)
      {
          if((x&(1<<i))!=0)
          {
            System.out.println("true");
          }
          else
          {
          System.out.println("False");
      }
   }


   //set the iTh  bit  1001(9),i=2----- 1101(13)
      public static void setIth(int x,int i)
      {
            
         int n=(x|(1<<i));
         System.out.println(n);
      }

      //clear the iThbit  1101,i=2-----1001(9)

      public static void clearI(int x,int i)
      {
         int n=(x&~(1<<i));
         System.out.println(n);
      }

      //toggle


      public static void toggle(int x,int i)
      {
         int n=x^(1<<i);
         System.out.println(n);
      }

      //remove the last set bit(right most)

      public static void removeL(int x)
      {
         int n=x&x-1;
         System.out.println(n);
      }

      //check if the number is a power of 2

      public static void check(int x)
      {
         if((x & x-1)==0)
          System.out.println("true");
          else
          System.out.println("false");
      }

      //count the number of set bit

      public static int countset(int n)
      {
         int count=0;
         while(n>0)
         {
            if(n%2==1)
            {
               count+=1;
            }
            n=n/2;
            
         }
         return count;
      }
      
         //another method

         public static int counts(int n)
         {
            int count=0;
            while(n>0)
            {
               n=n&(n-1);
               count++;
            }
            return count;
         }


         //count total no. of bits 1 to N
         public static int countSetBits(int n)
         {
    
            
            int count=0;
            for(int i=1;i<=n;i++)
            {
               int num=i; 
            while(num>0)
            {
                 if(num%2==1)
                 {
                   count++;
                 }
                  num=num/2;
                 
            }
            
            }
            return count;
        }
    

    //dive two integers without opeartors
    //Tc- O(divident)

    public static void Divide(int dividend,int divisor)
    {
      int sum=0;
      int count=0;
      while(sum+divisor<=dividend)
      {
           count++;
           sum+=divisor;
      }
      System.out.println(count);
    }
   

    //optimal solution 
    //Diide two Integers

    public static int divide(int divident,int divisor)
    {
      if(divident==divisor) return 1;
      boolean sign=true;

      if(divident>=0 && divisor<=0) sign=false;
      else if(divident<=0 && divisor>0) sign=false;

      long n=Math.abs((long)divident);
      long d=Math.abs((long)divisor);
      
      long quotient=0;

      while(n>=d)
      {
         int count=0;
         while(n>=(d<<(count+1)))
         {
            count++;
         }
         quotient+=1<<count;
         n=n-(d<<count);

      }
      if(quotient==(1<<31) && sign)
      {
         return Integer.MAX_VALUE;
      }
      if(quotient==(1<<31) && !sign)
      {
         return Integer.MIN_VALUE;
      }

      return sign ? (int)quotient:(int)-quotient;
    }



   



    //interview Questions
    // start=10 goal=7   1010   0111 ans=3;
    
    public int minBitFlips(int start, int goal) {
      int ans=start ^ goal;
      int count=0;
      for(int i=0;i<31;i++)
      {
          if((ans & (1<<i))!=0)
          {
              count++;
          }
      }
      return count;
      
  }


  //Single number [1,2,2] --1

  static int singleV(int a[])
  {
     HashMap<Int,Int> hm=new HashMap<>();

     for(int i=0;i<a.length-1;i++)
     {
        hm[a[i]]++;
     }

     for(auto it:hm)
     {
      if(it.value==1)
      {
         return it.key;
      }
     }

  }

      

      
      public static void main(String []args)
      {
      
         //System.out.println(binary2Decimal("1101"));
         //swap2(2,1);

         //Ibit(6,0);
        // setIth(9,2);

        //clearI(13,2);

       // toggle(13,1);

       //removeL(16);
       //check(14);
      // System.out.println(countset(13));
      //System.out.println(counts(13));
     // System.out.println(countSetBits(4));
     //Divide(22,4);
     //System.out.println(divide(22,-3));
     int a[]={1,2,2};
     singleV(a);
    }
   }

    
