// MULTIPLICATION Function
import java.util.Scanner;
public class multifunc {
    public static int CalMul(int a,int b){
        System.out.println(a*b);
        return 1;

    }
    public static void main(String args [])
    {
        Scanner sc = new Scanner (System.in);
        int a =sc.nextInt();
        int b= sc.nextInt();
        CalMul(a, b);

    }

    
}
