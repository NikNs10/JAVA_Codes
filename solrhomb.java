import java.util.*;
public class solrhomb {
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        for (int i =1;i<=n;i++)
        {
            int s= n-i;
            for (int j=1;j<=s;j++)
            {
                System.out.print(" ");
            }
            for (int j=1;j<=n;j++)
            {
                System.out.print("*");
                
            }System.out.println();
        }
    }
}
