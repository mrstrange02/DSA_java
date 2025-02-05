import java.util.Arrays;
import java.util.HashMap;

public class medium_array {

    //two sum problem
    //Brute  TC -O(N2)

    //a[]={2,6,5,8,11} target=14    a+b=14 what is that a and b

  static int twosum(int a[],int target)
    {
        //int a,b;
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a.length;j++)
            {
                if(i==j) continue;

                else if(a[i]+a[j]==target)
                {
                   return 1;
                }
                
            }
        }
        return 0;
    }

    //using hashmap
    static int[] twosum2(int a[],int target)
    {
        int ans[]=new int[2];

        ans[0]=ans[1]=-1;
        HashMap<Integer,Integer> mpp=new HashMap<>();
        for(int i=0;i<a.length;i++)
        {
            int n=a[i];
            int more=target-n;
            if(mpp.containsKey(more))
            {
                ans[0]=mpp.get(more);
                ans[1]=i;
                
            }

             mpp.put(a[i],i);
        }
        return ans;
        

    }

    //better solution

    static String twosum3(int a[],int target)
    {
        Arrays.sort(a);
        int left=0;
        int right=a.length-1;
        while(left<right)
        {
          int sum=a[left]+a[right];
            if(sum==target)
            {
                return "yes";
            }
            else if(sum<target) left++;
            

            else right--;
        }
        
        return "NO";
    }


    //Sort array of 0s,1s,2s
    //better solution  
    //Tc-O(2N)

    static void sortarray(int a[])
    {
        
        int c0=0,c1=0,c2=0;
        for(int i=0;i<a.length;i++)
        {
            if(a[i]==0) c0++;
            else if(a[i]==1) c1++;
            else
            c2++;
              
        }

        for(int i=0;i<c0;i++) a[i]=0;
        for(int i=c0;i<c0+c1;i++) a[i]=1;
        for(int i=c0+c1;i<a.length;i++) a[i]=2;
    
        
    }

    //optimal solution using Dutch national flag Algorithm
    //TC O(N)  there are 3 pointers

    static void sortarray3(int a[]) 
    {
        int low=0;
        int high=a.length-1;
        int  mid=0;
        while(mid<=high)
        {
            if(a[mid]==0) 
            {
                int temp=a[mid];
                a[mid]=a[low];
                a[low]=temp;
                low++;
                mid++;
            }
            else if(a[mid]==1) mid++;
            else 
            {
             int temp=a[mid];
             a[mid]=a[high];
             a[high]=temp;
             high--;
            }

        }
    }


    //Major ELement (ans>N/2 times)
    //a[]={1,2,3,2,1,2,2,2} 8/2=4  ans>4 that is 5 
    //returning element is 
    //TC O(n2)


    public static int majorelement(int a[])
    {
        int n=a.length;
        for(int i=0;i<n;i++)
        {
            int count=0;
            for(int j=0;j<n;j++)
            {
                if(a[j]==a[i])
                {
                    
                    count++;
                }
        }
        if(count>(n/2))
            return a[i];
           
        
    }
    return -1;
}


//optimal soulution 
//by using Moore's Voting Algorithm
//TC O(N)

static int majorelement2(int a[])
{
    int n=a.length;
    int count=0;
    int element=0;
    for(int i=0;i<n;i++)
    {
        if(count==0)
        {
            count=1;
            element=a[i];
        }
        else if(element==a[i]) count++;
        else count--;
    }

    int count1=0;
    for(int i=0;i<n;i++)
    {
        if(a[i]==element) count1++;
    }
    if(count1>(n/2))
    {
        return element;
    }
    else
    {
        return -1;
    }
}
    


//maximum subArray Sum;
//optimal
static int maximumsum(int a[])
{
    int sum=0;
    int maxi=a[0];
    for(int i=0;i<a.length;i++)
    {
        sum+=a[i];

        if(sum>maxi)
        maxi=sum;

        else if(sum<0)
        sum=0;
    }
    return maxi;
}

//better solution

static int maximumsum2(int a[])
{
    int maxi=0;
    for(int i=0;i<a.length;i++)
    {
       int sum=0;
    for(int j=i;j<a.length;j++)
    {
        sum+=a[j];
        maxi=Math.max(maxi,sum);
        
    }
    }
return maxi;
}



//Rearrange ELements by Sign
//a[]={3,1,-2,-5,2,-4}
//ans =3,-2,1,-5,2,-4   +,-,+,-,+,-

//bruteForce
//TC O(N)

static void rearrange(int a[])
{
    int n=a.length;
    int k=0,l=0;
    int pos[]=new int[n/2];
    int neg[]=new int[n/2];
    for(int i=0;i<n;i++)
    {
        if(a[i]<0)
        {
          neg[k]=a[i];
          k++;
        }
        else if(a[i]>0)
        {
          pos[l]=a[i];
          l++;

        }
    }

    for(int i=0;i<n/2;i++)
    {
        a[2*i]=pos[i];
        a[2*i+1]=neg[i];
    }

}


//optimal solution

static int[] rearrange1(int a[])
{
    int ans[]=new int[a.length];
    int neg=1;
    int pos=0;
    for(int i=0;i<a.length;i++)
    {
        if(a[i]<0)
        {
            ans[neg]=a[i];
            neg+=2;
        }
        else
        {
            ans[pos]=a[i];
            pos+=2;
        }
    }
    return ans;

}
public static void main(String []args)

{
    /*int t=14;
    int a[]={2,6,5,8,11};
    int j[]=twosum2(a,t);
        System.out.println(j[0]+" "+j[1]);*/


       /*  int a[]={2,6,5,11,8};
        int t=14;
        String s=twosum3(a,t);
        System.out.println(s);*/



       /*  int a[]={0,2,1,2,2,1,1,0};
        sortarray3(a);
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
            */

           /*  int a[]={1,2,0,-1};
            int b=maximumsum2(a);
            System.out.println(b);*/

            int a[]={-2,-3,4,-1,-2,1,5,-3};
            int m=maximumsum2(a);

            System.out.println(m);
            // for(int i=0;i<a.length;i++)
            // {
            //     System.out.print(a[i]+" ");
            // }


        
    
}
    


}
