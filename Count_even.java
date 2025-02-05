public class Count_even
{
    //for example 2446 ,2446%2==0 count 1,then like that 2446%4 total count
    static int count_even(int n)
    {
        int first=n;
        int count=0;

        while(n>0)
        {
          int l=n%10;
          

         if(l!=0 && first%l==0)
         {
            count++;
          
         }
          
            n=n/10;
        }
        return count;
    }

    public static void  main(String [] args)
    {
        int m=count_even(2446);
        System.out.println(m);
    }
}
    

