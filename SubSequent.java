import java.util.Scanner;
import java.util.*;
import java.util.HashSet;

class SubSequent
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		while(t>0)
		{
			int n = sc.nextInt();
			int a[] = new int[n];
			
			for(int i=0; i<n; i++)
			a[i] = sc.nextInt();
			Subseq g = new Subseq();
			
			System.out.println(g.findLongestConseqSubseq(a, n));
		  t--;
		}
	}
}
class Subseq
{  
	static int findLongestConseqSubseq(int arr[], int N)
	{
	   Set<Integer> s = new TreeSet<Integer>();
	   for(int a : arr){
	       s.add(a);
	   }
	   int c=0;
	   Object[] array = s.toArray();
       int max=0;
       for(int i=0; i<array.length-1; i++){
           int n1 = (int)array[i];
           int n2 = (int)array[i+1];
           if(n2-n1==1){
	           ++c;
	           if(max<c)
	             max=c;
	       }else{
	           c=0;
	       }
       }
	   return max+1;
	}
}
