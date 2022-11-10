import java.util.Scanner;

public class revarr {
    public static int getrev(int a[])
    {
        int first=0;int last=a.length-1;
        while(first < last)
        {
             int temp = a[last];
             a[last] = a[first];
             a[first]=  temp;
             first++;
             last--;

        }
        return 0;
    }


    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for (int i=0;i<a.length;i++)
        {
            a[i]=sc.nextInt();
        }
        getrev(a);
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }
    
}
