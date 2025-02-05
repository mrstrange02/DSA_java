#include<bits/stdc++.h>
 using namespace std;


 //merge sort
void merge(int a[],int low,int mid,int high);

  void mergesort(int a[],int low,int high)
  {
   int mid;
     if(low<high)
     {
     
    mid=(low+high)/2;
    mergesort(a,low,mid);
    mergesort(a,mid+1,high);
    merge(a,low,mid,high);
    }

  }

  void merge(int a[],int low,int mid,int high)
  {

    int i,j,k,b[40];

    i=low;
    j=mid+1;
    k=low;

    while(i<=mid && j<=high)
    {
      if(a[i]<=a[j])
      {
        b[k++]=a[i++];
      }
      else
      {
        b[k++]=a[j++];
      }
    }
     
     

     while(i<=mid)
     {
      b[k++]=a[i++];
     }
     while(j<=high)
     {
      b[k++]=a[j++];
     }

     for(k=0;k<=high;k++)
     {
        a[k]=b[k];
     }
  }


//quick sort



  int main()
  {
    int n,i;
    cout<<"enter the array size";
    cin>>n;
    int a[n];
    for(i=0;i<n;i++)
    {
      cin>>a[i];
    }
    mergesort(a,0,n-1);
    for(i=0;i<n;i++)
    {
      cout<<a[i]<<" ";
    }
  }