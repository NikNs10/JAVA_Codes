
//INVERTED  HALF PYRAMID 
import java.util.*;
public class invhalpyr {
    public static void main(String args [])
    {
        int i,j;
        Scanner sc=new Scanner (System.in);
        int rows=sc.nextInt();
        


        for(i=rows;i>=1;i--)
        {
            for (j=1;j<=i;j++)
            {
            System.out.print("*");
            }
            System.out.println();
         }
     }
}




