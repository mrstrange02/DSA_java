#include<bits/stdc++.h>
using namespace std;

void pat1(int n)
{
    for(int i=0;i<n;i++)
    {
        for(int j=0;j<n;j++)
        {
            cout<< "*";
        }
        cout<<"\n";
    }
    }

    void pat2(int n)
    {
        for(int i=0;i<n;i++)
    {
        for(int j=0;j<=i;j++)
        {
            cout<< "*";
        }
        cout<<"\n";
    }
    }

    void pat3(int n)
    {
        for(int i=1;i<=n;i++)
       {
        for(int j=1;j<=i;j++)
        {
            cout<< j;
        }
        cout<<"\n";
    }
    }

     void pat4(int n)
    {
        for(int i=1;i<=n;i++)
       {
        for(int j=1;j<=i;j++)
        {
            cout<< i;
        }
        cout<<"\n";
    }
    }

    void pat5(int n)
     {
    for(int i=n;i>0;i--)
    {
        for(int j=0;j<i;j++)
        {
            cout<< "*";
        }
        cout<<"\n";
    }
    }

    void pat6(int n)
     {
    for(int i=n;i>0;i--)
    {
        for(int j=1;j<=i;j++)
        {
            cout<< j;
        }
        cout<<"\n";
    }
    }

    void pat7(int n)
    {
         for(int i=0;i<n;i++)
         {
            for(int j=0;j<n-i-1;j++)
            {
                cout<<" ";
            
            }

            for(int j=0;j<2*i+1;j++)
            {
               cout<<"*";
            }
            for(int j=0;j<n-i-1;j++)
            {
                cout<<" ";
            
            }
            cout<<"\n";

         }
    }

    void pat8(int n)
    {
         for(int i=0;i<n;i++)
         {
            for(int j=0;j<i;j++)
            {
                cout<<" ";
            
            }

            for(int j=0;j<2*n-(2*i+1);j++)
            {
               cout<<"*";
            }
            for(int j=0;j<i;j++)
            {
                cout<<" ";
            
            }
            cout<<"\n";

         }
    }


    void pat9(int n)
    {
         for(int i=0;i<n;i++)
         {
            for(int j=0;j<n-i-1;j++)
            {
                cout<<" ";
            
            }

            for(int j=0;j<2*i+1;j++)
            {
               cout<<"*";
            }
            for(int j=0;j<n-i-1;j++)
            {
                cout<<" ";
            
            }
            cout<<"\n";

         }

         for(int i=0;i<n;i++)
         {
            for(int j=0;j<i;j++)
            {
                cout<<" ";
            
            }

            for(int j=0;j<2*n-(2*i+1);j++)
            {
               cout<<"*";
            }
            for(int j=0;j<i;j++)
            {
                cout<<" ";
            
            }
            cout<<"\n";

         }
    }


    void pat10(int n)
    {
        for(int i=1;i<=2*n-1;i++)
        {
            int stars=i;
            if(i>n)
            stars=2*n-i;
            
            for(int j=1;j<=stars;j++)
            {
                cout <<"*";
            }
            cout <<"\n";
            
        }
    }

 void pat11(int n)
 {
    for(int i=1;i<=n;i++)
    {
      for(int j=1;j<=i;j++)
      {
         if((i+j)%2==0)
         {
            cout <<"1 ";
         }
         else
         {
            cout << "0 ";
         }
      }
    cout <<"\n";
    }
 }


 void pat12(int n)
 {
    for(int i=1;i<=n;i++)
    {
        for(int j=1;j<=i;j++)
        {
            cout <<j;
        }


     for(int j=1;j<=2*n-2*i;j++)
     {
        cout <<" ";
     }
        for(int j=i;j>=1;j--)
        {

            cout <<j;
        }

        cout<< "\n";
    }
 }

 void pat13(int n)
 {
    int m=1;
    for(int i=1;i<=n;i++)
    {
        for(int j=1;j<=i;j++)
        {
            cout<<m<<+" ";
            m++;
        }
        cout<<"\n";
    }
 }

void pat14(int n)
{
     for(int i=0;i<n;i++)
     {
        for(char ch='A';ch<='A'+i;ch++)
        {
            cout<<ch;
        
        }
        cout<<"\n";
     }
}



void pat15(int n)
{
    for(int i=n;i>=1;i--)
    {
        for(char ch='A';ch<'A'+i;ch++)
        {
             cout <<ch;
        }
        cout<<"\n";
    }
}


void pat16(int n)

{
    for(int i=0;i<n;i++)
    {
        char ch='A'+i;;
        for(int j=0;j<=i;j++)
        {
            cout<<ch;
        }
        cout<<"\n";
    }

    }

 
 void pat17(int n)
 {
    for(int i=0;i<n;i++)
    {
        for(int j=0;j<n-i-1;j++)
        {
            cout<< " ";
        }

        char ch='A';
        int breakpoint=(2*i+1)/2;
        for(int j=1;j<=2*i+1;j++)
        {
            cout<< ch;
            if(j<=breakpoint)
            ch++;
            else
            ch--;
        }



         for(int j=0;j<n-i-1;j++)
        {
            cout<< " ";
        
        }
        cout<<"\n";

    }

 }


 void pat18(int n)
 {
    for(int i=0;i<n;i++)
    {
        for(char ch='E'-i;ch<='E';ch++)
        {
            cout <<ch;
        }
        cout<<"\n";
    }
 }


 void pat19(int n)
 {

    int inils=0;
    for(int i=0;i<n;i++)
    {
        for(int j=1;j<=n-i;j++)
        {
            cout<<"*";
        }
        for(int j=0;j<inils;j++)
        {
            cout <<" ";
             }


        for(int j=1;j<=n-i;j++)
        {
            cout<<"*";
        }
        inils+=2;
        cout<<"\n";
    }

   inils=2*n-1;
    for(int i=1;i<=n;i++)
    {
      for(int j=1;j<=i;j++)
        {
            cout<<"*";
        }
        for(int j=0;j<inils;j++)
        {
            cout <<" ";
             }


        for(int j=1;j<=i;j++)
        {
            cout<<"*";
        }
        inils-=2;
        cout<<"\n";  

    }
 }
  void pat20(int n)
  {

    int spaces=2*n-2;
    for(int i=1;i<=2*n-1;i++)
    {
        int stars=i;
        if(i>n)
        stars=2*n-i;
        for(int j=1;j<=stars;j++)
        {
            cout<<"*";
        }

        for(int j=1;j<=spaces;j++ )
        {
             cout<<" ";
        }

         for(int j=1;j<=stars;j++)
        {
            cout<<"*";
        }
        cout<<endl;

        if(i<n)
        {
            spaces-=2;

        }
        else
        {
            spaces+=2;
        }
    }
  }



  void pat21(int n)
  {
    for(int i=0;i<n;i++)
    {
        for(int j=0;j<n;j++)
        {
            if(i==0||j==0||i==n-1||j==n-1)
            {
                cout<<"*";

            }
            else
            {
            cout<< " ";
            }
        }
        cout<<endl;
    }
  }

  void pat22(int n)
  {
     for(int i=0;i<2*n-1;i++)
     {
        for(int j=0;j<2*n-1;j++)
        {
            int top=i;
            int left=j;
            int right=(2*n-2)-j;
            int down=(2*n-2)-i;
            cout<<(n-min(min(top,down),min(left,right)));
        }
        cout<<endl;
     }
  }




int main()
{
    pat4(3);

}
