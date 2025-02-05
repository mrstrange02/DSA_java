public class easy_array {

    static int largest(int a[],int n)
    {
        int large=a[0];
        for(int i=0;i<n;i++)
        {
            if(a[i]>large)
            {
                large=a[i];
            }
        }
        return large;

    }

    static int slargest(int a[],int n)
    {
        int largest=a[0];
        int slargest=-1;
        for(int i=0;i<n;i++)
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

    static int ssmallest(int a[],int n)
    {
        int smallest=a[0];
        int ssmallest=Integer.MAX_VALUE;
        for(int i=0;i<n;i++)
        {
            if(a[i]<smallest)
            {
                ssmallest=smallest;
                smallest=a[i];
            }

            else if(a[i]>smallest && a[i]<ssmallest)
            {
                ssmallest=a[i];
            }
        }
        return ssmallest;
    }

    //Check if array is Sorted or Not
    //TC--O(n);

    static int checkArraySort(int a[])
    {
        for(int i=1;i<a.length;i++)
        {
             if(a[i]>a[i-1])
             {

             }
             else{
                return 0;
             }
        }
        return 1;
    }


    //left Rotate the array by one place
    //SC--O(1)  1 2 3 4 5 -->2 3 4 5 1

    static void rotateArray(int a[])
    {
        int temp=a[0];
        for(int i=1;i<a.length;i++)
        {
            a[i-1]=a[i];
        }
        a[a.length-1]=temp;
    }


    //left rotate the array  by D places
    //TC--O(n+d)
    //SC--O(d)

    static void leftrotate(int a[],int d)
    {
        int n=a.length;
        int temp[]= new int[n];
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

    //Move all zeroes to the end of the array

    //Brute Force

     static void movezeroes(int a[])
     {
        int n=a.length;
        int temp[]=new int[n];
        int index=0;
        for(int i=0;i<n;i++)
        {
            if(a[i]!=0)
            {
                temp[index++]=a[i];
            }
        }

        int nz=temp.length;

        for(int i=0;i<temp.length;i++)
        {
            a[i]=temp[i];
        }

        for(int i=nz;i<n;i++)
        {
            a[i]=0;
        }

    }

    //Optimal Solution
    //Tc O(n)

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void moveZeroes(int a[])
    {
        int j=-1;
        int n=a.length;
        for(int i=0;i<n;i++)
        {
            if(a[i]==0)
            {
                j=i;
                break;
            }
        }

        if(j==-1) return ;

        for(int i=j+1;i<n;i++)
        {
            if(a[i]!=0)
            {
                swap(a,i,j);
                j++;
            }
        }
    }





    public static void main(String []args)
    {
        int a[]={1,2,0,5,0,5,7,8};

        //System.out.println((a));
        //rotateArray(a);
        //leftrotate(a,3);

        moveZeroes(a);
        for(int i=0;i<a.length;i++)
        {
             System.out.print(a[i]+" ");
        }
    }
    
}
