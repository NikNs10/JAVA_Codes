import java.util.Scanner;

public class factfunc {
    public static void FacFunc(int n)
    {
        if (n<=0)
        {
            System.out.println("Invalid");
            return;
        }
        int fact=1;
        for (int i=n;i>=1;i--){
            fact=fact*i;
        }
        System.out.print(fact);
        return;
    }
    public static void main (String args [])
    {
        Scanner  sc=new Scanner (System.in);
        int n= sc.nextInt();
        FacFunc(n);
    }
}

