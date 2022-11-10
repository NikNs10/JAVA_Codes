import java.util.Scanner;


public class pairarr {

    public static int getpair(int a[])
    {
        int count=0;
        for (int i=0;i<a.length;i++)
        {
            int curr=a[i];
            for(int j=i+1;j<a.length;j++) 
            //j=0 --> all pairs including itself and prior to it.
            //j=i --> all pairs including itself and next to it..
            //j=i+1 --> pairs exclu. itself and prior.

            {
                System.out.print(curr +"," + a[j] + " ");
                count++;
            }
            System.out.println();
            
        }System.out.println(count);
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

        getpair(a);


    }
}
