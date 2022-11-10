import java.util.*;
public class subarr {

    public static int getsubarr(int a[])
    {
        int count=0;
        
        for (int i=0;i<a.length;i++)
        {
            for (int j=i;j<a.length;j++) 
            // j --> i+1 -- doesn't include self pair
            // j --> i -- incl. self pair
            {     
                for (int k=i;k<=j;k++)
                {
                    System.out.print(a[k] + a[i]+a[j]" ");
                  
                }
                count++;
                System.out.println();
             
               
            } 
            System.out.println();
            
          
            
        }
        System.out.println("count is :"+count + " ");
        return 0;
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
        getsubarr(a);

    }
    
}
