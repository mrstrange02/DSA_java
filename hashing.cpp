#include<bits/stdc++.h>
using namespace std;

int main()
{
    int n;
    cout<<"enter the array size";
    cin>>n;
    int a[n];

    for(int i=0;i<n;i++)
    {
        cin>>a[i];
    }
           //10^6 inside main 
           //10^7 if it declares globally
    int hash[13]={0};
    for(int i=0;i<n;i++)
    {
        hash[a[i]]+=1;
    }

    int number;
    cout<<"enter the number";
    cin>>number;
    cout<<hash[number]<<endl;

}


