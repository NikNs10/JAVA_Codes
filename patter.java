// SOLID RECTANGLE
import java.util.*;
public class patter {
    public static void main(String args [])
    {
        int i,j;
        Scanner sc=new Scanner (System.in);
        int rows=sc.nextInt();
        int columns=sc.nextInt();


        for(i=1;i<=rows;i++)
        {
            for (j=1;j<columns;j++)
            {
            System.out.print("*");
            }
            System.out.println("*");
        }
      

    }
}
