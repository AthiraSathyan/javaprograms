import java.util.*;
 public class program1{
     public static void main(String args[])
    {
        int n=545;
        System.out.println(digitsum(n));
    }
    static int digitsum(int n)
    {
        int sum=0;
        while(n>0 || sum>9)
        {
            if (n==0)
            {
                n=sum;
                sum=0;
            }
            sum+=n%10;
            n/=10;
        }
        return sum;
    

    }
}
