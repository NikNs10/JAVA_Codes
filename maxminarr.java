import java.util.*;

public class maxminarr {
    public static int getmaxnum(int a[])   //array [] 
    {
        int largest= Integer.MIN_VALUE;
        for (int i=0;i<a.length;i++)
        {

            if(largest<a[i])
            {
                largest=a[i];
            }
            
        }
    
        return largest;
    }


    public static int minnum(int a[])
    {
        int smallest=Integer.MAX_VALUE;
        for (int i=0;i<a.length;i++)
        {
            if (smallest>a[i])
            {
                smallest=a[i];
            }
        }
        return smallest;
    }


    public static void main(String args[])
    {
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for (int i=0;i<a.length;i++)
        {
            a[i]=sc.nextInt();
        }
         //int largest=maxnum();
        System.out.println("large num:"+getmaxnum(a));
        System.out.println("SMALL num:"+minnum(a));

    }
}
