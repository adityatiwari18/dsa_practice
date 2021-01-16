import java.util.*;
import java.math.*;
class BigFact
 {
	public static void main (String[] args)
	 {
	     Scanner sc=new Scanner(System.in);
         int t=sc.nextInt();

         while(t-->0)
         {
            int n=sc.nextInt();
            BigInteger fact= BigInteger.ONE;
            for(int i=n;i>0;i--)
            fact=fact.multiply(BigInteger.valueOf(i));
            System.out.println(fact);
         }
	 }
}
