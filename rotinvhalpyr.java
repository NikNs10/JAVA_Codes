
//INVERTED  HALF PYRAMID ROTATED BY 180 DEGREES 
import java.util.*;
public class rotinvhalpyr {

    public static void main(String args [])
    {
        int i,j;
        Scanner sc=new Scanner (System.in);
        int rows=sc.nextInt();
        


        for(i=1;i<=rows;i++)
        {
            for (j=1;j<=rows-i;j++)
            {
                
                System.out.print(" ");
            }
            for (j=1;j<=i;j++)
                {
                System.out.print("*");
                }
        
            System.out.println();
        } 
        
     }
}





    

