public class easy_array2 {
    
    static void union_of_sortedArray(int arr1[],int arr2[],int m,int n)
    {
        int i=0,j=0;
        while(i<m && j<n)
        {
            while(i>0 && i<m && arr1[i]==arr1[i-1])
            {
                i++;
            }

            while(j>0 && j<n && arr2[j]==arr2[j-1])
            {
                j++;
            }
            if(i<m && j<n)
            {
            if(arr1[i]<arr2[j])
            {
                System.out.println(arr1[i++]+" ");
            }
            else if(arr2[j]<arr1[i])
            {
                System.out.println(arr2[j++]+" ");
            
            }
            else
            {
                System.out.println(arr1[i++]+" ");
                 j++;
            }
        }
    }

        while(i<m)

        {
            if(i>0 && arr1[i]!=arr1[i-1])
            {
            System.out.println(arr1[i++]+" ");
        }
        i++;
    }
        while(j<n)
        {
            if(j>0 && arr2[j]!=arr2[j-1])
            {

            
            System.out.println(arr2[j++]+" ");
        }
         j++;

        }
    }

    //Maximum Consecutive Ones 110111011  answer 3
    //TC- O(n)
    

    static int max_consecutive_ones(int a[])
    {
        int maxi=0;
        int count=0;
        for(int i=0;i<a.length;i++)
        {
            if(a[i]==1)
            {
                count++;
                maxi=Math.max(maxi,count);
            }
            else
            {
                count=0;
            }
        }
        return maxi;

    }

    //Find the number that appears once,and the other twice
    
        public int singleNumber(int[] nums) 
        {
            int m=0;
            for(int i=0;i<nums.length;i++)
            {
                int n=nums[i];
                int count=0;
                for(int j=0;j<nums.length;j++)
                {
                    if(nums[j]==n)
                    {
                        count++;
                    }
                
                }

                if(count==1)
                {
                     m=n;
                     break;
                }
            
        }
        
        return m;
    }
    
    

    public static void main(String []args)
    {
        int arr1[]={1,2,2,3,4,4,5};
        int arr2[]={1,2,2,2,3,4,5};
        int m=arr1.length;
        int n=arr2.length;
        union_of_sortedArray(arr1,arr2,m,n);
    

    }
}
