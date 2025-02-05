#include <bits/stdc++.h>
using namespace std;

//no of digits in a number 
int countdigit(int n)
{
      int count=0;
      while(n>0)
      {
            n=n/10;
            count++;
      }
      return count;
}

//another way of count of digits

int countdigi(int n)
{
       int count=(int)(log10(n)+1);
       return count;
}


//reverse of a number

int reverse(int n)
{
      int rev=0;
      while(n>0)
      {
            int lastdigit=n%10;
            rev=(rev*10)+lastdigit;
            n=n/10;
      }
      return rev;

}

//palindrome number
void palindrome(int n)
{
      int rev=0;
      int m=n;
      while(n>0)
      {
            int lastdigit=n%10;
            rev=(rev*10)+lastdigit;
            n=n/10;
      }

      if(m==rev)
      {
            cout<< "palindrome";
      }
      else
      {
            cout<< "not palindrome";
      }
  

}


//armstrong numbers


void  armstrong(int n)
{
      int sum=0,count=0;
      int ld;
      int dub=n;
      int temp=n;
      while(n>0)
      {
            n=n/10;
            count++;
      }

      while(temp>0)
      {
         ld=temp%10;
         sum=sum+(pow(ld,count));
         temp=temp/10;
      }
      if(sum==dub)
      {
            cout<<"armstrong";
      }
      else
      {
            cout<<"not";
      }

}

//Print all divisors

  void factors(int n)
  {
      //squareroot n
      //i*i<=n
      for(int i=1;i<=n;i++)
      {
            if(n%i==0)
            {
                  cout<<i<<" ";
            }
      
      }
  }


  //prime numbers
  void prime(int n)
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
            cout<<"prime";
      }
      else
      {
            cout<<"not prime";
      }
  }


  //gcd/hcf

  void gcd(int n1,int n2)
  {
      int hcf=1;
      for(int i=1;i<=min(n1,n2);i++)
      {
            if(n1%i==0 && n2%i==0)
            {
                  hcf=i;
            }
      }
      cout<<hcf;
  }
   

   //another way

   void hcf(int n1,int n2)
   {
      for(int i=min(n1,n2);i>=1;i--)
      {
            if(n1%i==0 && n2%i==0)
            {
                  cout<< i;
                  break;
            }
      }
   }

   //euclidean algorithm gcd 

   void gcd1(int a,int b)
   {
      while(a>0 && b>0)
      {
          if(a>b)
          {
            a=a%b;
          }
            else
            {
              b=b%a;
            }
      }
      if(a==0)
      {
       cout<<b;
      }
       else
       {
            cout<<a;
       }
   }




int main()
{
      
 factors(4);
}
