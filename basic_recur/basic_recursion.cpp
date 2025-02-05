#include<bits/stdc++.h>
using namespace std;
//demo recursion

void fun(int count)
{
    if(count==3)
    {
      return;
    }
  cout<< count<<endl;
  

  fun(count + 1);

}

//print name  n times 

//time complexity O(n) 
//space complexity O(n)

void f1(int i,int n)
{
   if(i>n)
   {
    return;
   }

   cout<< "SPK"<<endl;
   f1(i+1,n);
}

//print 1-N; like 1 2 3 4....
void f2(int i,int n)
{
   if(i>n)
   {
    return;
   }

   cout<< i<<endl;
   f2(i+1,n);
}

//print n terms of N-1

 void f3(int i,int n)
 {
    if(i<1)
    {
      return;
    }

    cout<<i<<endl;
   f3(i-1,n);

 }


void f4(int i,int sum)
{
  if(i<1)
  {
    cout<<sum;
    return;
  }

  f4(i-1,sum+i);
}

//other way

int fun4(int n)
{
  if(n==0)
  {
    return 1;
  }
  return n+fun4(n-1);
  }

//factorial

int f5(int n)
{
  if(n==0)
  {
    return 1;
  }
  return n*f5(n-1);
  }


//reverse an array

void f6(int l,int r,int a[])
{
    if(l>=r)
    {
      return;
    }

    swap(a[l],a[r]);
    f6(l+1,r-1,a);
}

//another way

void fun6(int i,int n,int a[])
{
  if(i>=n/2)
  {
    return;
  }
  swap(a[i],a[n-i-1]);
  fun6(i+1,n,a);
}

//string is palindrome or not


bool f7(int i,string &s)
{
  if(i>=s.size()/2)
  {
    return true;
  }

    if(s[i]!=s[s.size()-i-1])
    {
      return false;
    }

    return f7(i+1,s);
  } 


    /*boolean isPalindrome(String s) {
       s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        for(int i=0;i<s.length()/2;i++)
        {
            if(s.charAt(i)!=s.charAt(s.length()-i-1))
            {
                return false;
        
            }
              
        }
        return true;
        
  }*/




  //fibonacci 

   int f8(int n)
   {
    if(n<=1)
    {
      return n;
    }
    return f8(n-1)+f8(n-2);
   }



  


int main()
{
  
 /* int a[]={1,3,2,5,4};
  int n=sizeof(a)/sizeof(a[0]);


  f6(0,n-1,a);
  for(int i=0;i<n;i++)
  {
    cout<<a[i]<<" ";
  }
  */

  //string s="madoam";
  //cout<<f7(0,s);

  cout<<f8(6);
  

 
  

}