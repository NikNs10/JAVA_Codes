import java.util.*;
public class binsear {
    //BINARY SEARCH iis for sorted arrays ;;

    public static int getbinsear(int a[],int key)

    {
        int start=0;int end=a.length-1;
        while(start<=end)
        {
            int mid=(start+end)/2;
            if (a[mid]==key)
            {
                return mid;
            }
            if(a[mid]>key)
            {
                end=mid-1;
               
            }
            else
            {
                start=mid+1;
               
            }
            
        }
        return -1;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner (System.in);
        int a[]={2,4,6,8,10,12,14};
        int key=1;
       /*  int n=sc.nextInt();
        int a[]=new int[n];
        for (int i=0;i<a.length;i++)
        {
            a[i]=sc.nextInt();
        }
        int key=sc.nextInt();*/
        System.out.println("index : " +getbinsear(a, key));





    }
    
}
