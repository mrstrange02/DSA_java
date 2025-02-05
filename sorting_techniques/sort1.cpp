#include<bits/stdc++.h>
using namespace std;

//selection sort
//select min and swap to first place

/*swap at 0 and min index
  swap at 1 and min*/


  //time complexity O(n2)
  
  void selection(int a[],int n){
     for(int i=0;i<=n-2;i++)
     {
      int mini=i;
      for(int j=i;j<=n-1;j++)
      {
         if(a[j]<a[mini])
         {
          mini=j;
         }
      }
      int temp=a[mini];
      a[mini]=a[i];
      a[i]=temp;

     }
  }

 //bubble sort
 //adjacent swaps, push mAX TO LAST
 //time c O(n2)

 void bubble(int a[],int n)
 {
  for(int i=n-1;i>=0;i--)
  {
     for(int j=0;j<=i-1;j++)
     {
       if(a[j]>a[j+1])
       {
        int temp=a[j+1];
        a[j+1]=a[j];
        a[j]=temp;
       }
     }
  }

 }

 //insertion sort
 //takes an element and places its currect position
// time complexity 

void insertion(int a[],int n)
{
   for(int i=0;i<=n-1;i++)
   {
     int j=i;
     while(j>0 && a[j-1]>a[j])
     {
       int temp=a[j-1];
       a[j-1]=a[j];
       a[j]=temp;

       j--;


     }
   }
}


 



    int main()
    {
      int n;
     cin>>n;
     int a[n];
     for(int i=0;i<n;i++)
     {
      cin>>a[i];
     }
     bubble(a,n);
     for(int i=0;i<n;i++)
     {
      cout<<a[i]<<" ";
     }



    }