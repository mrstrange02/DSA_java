//moves all zeroes to ends

public class move_Zeroes {
    public static void moveZero(int a[],int n)
    {
        int count=0;
              int temp[]=new int[n];
              for(int i=0;i<n;i++)
              {
                if(a[i]!=0)
                {
                    temp[count]=a[i];
                    count++;
                }
              }


              for(int i=0;i<temp.length;i++)
              {
                a[i]=temp[i];
              }
    
    for(int i=count;i<n;i++)
    {
        a[i]=0;
    }
    
}
public static void main(String []args)
{
    int a[]={1,0,2,3,2,0,0,4,5,1};
    int n=a.length;
    System.out.println(n);

    moveZero(a,n);
    for(int i=0;i<n;i++)
    {
        System.out.println(a[i]+" ");
    }
}
}
