import java.util.*;
public class medium_array2 {

    //brute force 
    //by linear searching
    //O(N2)


    static int largestSequence(int a[])
    {

        int largest=1;
        for(int i=0;i<a.length;i++)
        {
            int x=a[i];
            int count=1;
            while(linearsearch(a,x+1)==true)
            {
                x=x+1;
                count++;
            }
            largest=Math.max(largest,count);
        }
        return largest;
        
    }

    static boolean linearsearch(int a[],int num)
    {
        for(int i=0;i<a.length;i++)
        {
            if(a[i]==num)
            {
                return true;
            }

        }
        return false;
    }



    //better Solution

    static int largestSequence2(int a[])
    {
        Arrays.sort(a);
        int count=0;
        int lastSmaller=Integer.MIN_VALUE;
        int largest=0;

        for(int i=0;i<a.length;i++)
        {
            if(a[i]-1==lastSmaller)
            {
                count++;
                lastSmaller=a[i];
            }

            else if(a[i]!=lastSmaller) // for new squence
            {
                count=1;
                lastSmaller=a[i];

            }
            largest=Math.max(largest,count);
        }
        return largest;


    }

    //optimal solution

    //set unique numbers added to set and checks availble in set or not
    //Tc O(3N)

    static int largestSequence3(int a[])
    {
        int n=a.length;
        if(n==0) return 0;
        int longest=1;

        Set<Integer> set=new HashSet<>();
        for(int i=0;i<n;i++)
        {
            set.add(a[i]);
        }

        for(int it:set)
        {
            if(!set.contains(it-1))
            {
                int count=1;
                int x=it;

                while(set.contains(x+1))
                {
                   x=x+1;
                   count++;
                }
                longest=Math.max(longest,count);
            }
        }
        return longest;



    }


    //Rotate Matrix by right 90 degrees
    //Brute Force
    //TC O(n2) SC O(n2)

    static int[][] rotate(int a[][])
    {
        int n=a.length;
        int rotated[][]= new int[n][n];
        for(int i=0;i<n;i++)
        {
           for(int j=0;j<n;j++)
           {
                  rotated[j][n-i-1]=a[i][j];
           }
        }
        return rotated;
    }

    //Optimal Solution
    //SC O(1)
    //TC O(N2)

    static void rotate2(int m[][])
    {
        for(int i=0;i<m.length;i++)
        {
            for(int j=1;j<m[0].length;j++)  //transpose the matrix
            {
                int temp=0;
                temp=m[i][j];
                m[i][j]=m[j][i];
                m[j][i]=temp;

            }
        }


        for(int i=0;i<m.length;i++)
        {
            for(int j=0;j<m.length/2;j++) // reverse it 
            {
               int temp=0;
               temp=m[i][j];
               m[i][j]=m[i][m.length-j-1];
               m[i][m.length-j-1]=temp;

            }
        }
    }


    //Spiral Matrix
    //Only 1 Solution

    static List<Integer> print(int [][] mat)
    {

        List<Integer> ans=new ArrayList<>();
        int n=mat.length;
        int m=mat[0].length;
        
        int top=0, left=0,right=n-1, bottom=m-1;

        while(left<=right && left<=right)
        {
            for(int i=left;i<=right;i++)
            {
                ans.add(mat[top][i]);
            }
            top++;

            for(int i=top;i<=bottom;i++)
            {
                ans.add(mat[i][right]);
            }
            right--;

            if(top<=bottom)
            {
              for(int i=right;i>=left;i--)
              {
                ans.add(mat[bottom][i]);
              }
              bottom--;
            }

            if(left<=right)
            {
                for(int i=bottom;i>=top;i--)
                {
                    ans.add(mat[i][left]);
                }
                left++;
            }
        }

        return ans;

        

    }

    


    public static void main(String []args)
    {

        // int a[]={2,1,4,3,60,22,5,8};
        // System.out.println(largestSequence3(a));
        

        int arr[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        // for(int i=0;i<arr.length;i++)
        // {
        //     for(int j=0;j<arr.length;j++)
        //     
        //         System.out.print(arr[i][j]+" ");
        //     }
        //     System.out.println();
        // }


        List <Integer> ans=print(arr);
        for(int i=0;i<ans.size();i++)
        {
            System.out.print(ans.get(i)+" ");
        }
        System.out.println();



    }
    
}
