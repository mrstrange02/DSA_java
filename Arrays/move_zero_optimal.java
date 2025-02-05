public class move_zero_optimal {

    static void moveZero(int a[],int n)
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
        for(int i=j+1;i<n;i++)
        {
            if(a[i]!=0)
            {
                int temp=a[i];
                a[i]=a[j];
                a[j]=temp;
                j++;
            }
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
