import java.util.*;

public class optimal_quick {


    //Function to sort an array using quick sort algorithm.
    static void quickSort(int a[], int low, int high)
    {
        if(low<high)
        {
                int pi=partition(a,low,high);
            
                quickSort(a,low,pi-1);
                quickSort(a,pi+1,high);
            
        }
        // code here
    }

    static int partition(int a[], int low, int high)
    {
       
        int pivot=a[high];
        int i=low-1;
        for(int j=low;j<high;j++)
        {
            if(a[j]<=pivot)
            {
                i++;
                
                int temp=a[i];
                a[i]=a[j];
                a[j]=temp;
            }
        }
        
        int temp=a[i+1];
        a[i+1]=a[high];
        a[high]=temp;
        
        return i+1;
        // your code here
    } 

    public static void main(String []args)
    {
        int n ,i;
      System.out.println("enter the array size: ");
      Scanner sc=new Scanner(System.in);
      n=sc.nextInt();

    int a[]=new int[n];
    System.out.println("enter the elements");
    for(i=0;i<n;i++)
    {
        a[i]=sc.nextInt();
    }
    quickSort(a,0,n-1);
    for(i=0;i<n;i++)
    {
        System.out.printf("%d ",a[i]);
    }
    }
}

    

