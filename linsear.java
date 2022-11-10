import java.util.*;
public class linsear {
    public static int Linesear(int a[],int key)
    {
        for (int i=0;  i<a.length ;i++)
        {
            if (a[i]==key)
            {
                return i;
            }

        }
        return -1;
    }
    
    public static void main(String args [])
    {
       // int a[]= {2,4,6,8,9,7};
       Scanner sc = new Scanner (System.in);
       int n=sc.nextInt();
       int a[]=new int[n];
       for (int i=0;i<a.length;i++)
       {
        a[i]=sc.nextInt();
       }
       System.out.println("insert key to find");

       
        int key = sc.nextInt();
        


        int index = Linesear(a, key);
        if (index==-1)
        {
            System.out.println("NOT");
        }
        else{
            System.out.println("index is :"+index);
        }
    }
}
