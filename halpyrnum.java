
// HALF PYRAMID  (NUMBERS)
import java.util.*;
public class halpyrnum {

    public static void main(String args [])
    {
        int i,j;
        Scanner sc=new Scanner (System.in);
        int rows=sc.nextInt();
        


        for(i=1;i<=rows;i++)
        {
            for (j=1;j<=i;j++)
            {
            System.out.print(j);
            
            }
            System.out.println();
         }
     }
}



