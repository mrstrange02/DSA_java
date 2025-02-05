/*
Brute-> Better -> Optimal

*/

//1. Largest element in an array
//time complexity-- O(n)

#include<bits/stdc++.h>
using namespace std;

int largest(int a[],int n)
{
   int largest=a[0];
   for(int i=0;i<n;i++)
   {
     if(a[i]>largest)
     {
        largest=a[i];
     }
   }
   return largest;
}

//Second largest Element in an array
//TC--O(n)

int secondLargest(int a[],int n)
{
     int largest=a[0];
     int slargest=-1;
     for(int i=1;i<n;i++)
     {
        if(a[i]>largest)
        {
            slargest=largest;
            largest=a[i];
        }
        else if(a[i]<largest && a[i]>slargest)
        {
            slargest=a[i];
        }
     }
     return slargest;

}

//Second Smallest Element in an Array
int secoundSmallest(int a[],int n)
{
    int smallest=a[0];
    int ssmallest=INT_MAX;
    for(int i=1;i<n;i++)
    {
        if(a[i]<smallest)
        {
        ssmallest=smallest;
        smallest=a[i];
    }
    else if(a[i]!=smallest && a[i]<ssmallest)
    {
        ssmallest=a[i];
    }
    
}
return ssmallest;
}

//Check if array is Sorted or Not
//TC--O(n);

int checkArraySort(int a[],int n)
{
    for(int i=1;i<n;i++)
    {
        if(a[i]>a[i-1])
        {

        }
        else
        {
            return false;
        }
    }
    return true;
}


//Remove duplicates in place from sorted array
 //TC-- O(n)
 //SC-- O(1)

 int removeDuplicate(int a[],int n)
 {
    int i=0;
    for(int j=1;j<n;j++)
    {
        if(a[i]!=a[j])
        {
            a[i+1]=a[j];
            i++;
        }
    }

    return i+1;
 }

//left Rotate the array by one place
//SC--O(1)  1 2 3 4 5 -->2 3 4 5 1

int rotateArray(int a[],int n)
{
    int temp=a[0];
    for(int i=1;i<n;i++)
    {
        a[i-1]=a[i];
    }
    a[n-1]=temp;
}


//left rotate the array  by D places
//TC--O(n+d)
//SC--O(d)

void leftRotate(int a[],int n,int d)
{
    d=d%n;
    int temp[d];
    
    for(int i=0;i<d;i++)
    {
        temp[i]=a[i];
    }
    
    for(int i=d;i<n;i++)
    {
        a[i-d]=a[i];
    }

    for(int i=n-d;i<n;i++)
    {
        a[i]=temp[i-(n-d)];
    }

}

//another way

void leftRotates(int a[],int n,int d)
{
     reverse(a,a+d);
     reverse(a+d,a+n);
     reverse(a,a+n);
}

//Move all zeroes to the end of the array
//Tc O(n)

int moveZeroes(int n,int a[])
{
    int j=-1;
    for(int i=0;i<n;i++)
    {
        if(a[i]==0)
        {
            j=i;
            break;
        }
    }

    if(j==-1) return;

    for(int i=j+1;i<n;i++)
    {
        if(a[i]!=0)
        {
            swap(a[i],a[j]);
            j++;
        }
    }

}

//Union of two sorted arrays


 

int main()
{
    int n,d;
    cout<<"enter the array size";
    cin>>n;
    //cout<<"enter the d";
   // cin>>d;
    int a[n];
    for(int i=0;i<n;i++)
    {
          cin>>a[i];
    }

  moveZeroes(n,a);
  for(int i=0;i<n;i++)
    {
          cout<<a[i]<<endl;
    }
  
    
} 
