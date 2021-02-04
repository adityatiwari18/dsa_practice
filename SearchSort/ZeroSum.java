import java.io.*;
import java.util.*;
class ZeroSum {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		sc.nextLine();
		while(t-->0)
		{
		    int n;
		    n=sc.nextInt();
		    
		    int arr[]=new int[n];
	
		    
		    for(int i=0;i<n;i++)
		    {
		        arr[i]=sc.nextInt();
		    }

		    System.out.println(findSubarray(arr,n));
		}
		
	}
  
  public static int findSubarray(int[] arr ,int n) 
  {
      int sum=0;
      int count=0;
      HashMap<Integer, Integer> hs = new HashMap<>();
      for(int i=0;i<n;i++){
          sum+=arr[i];
          if(sum==0)
              ++count;
          if(hs.get(sum)!=null)
              count+=hs.get(sum);
          hs.put(sum, hs.get(sum)!=null?hs.get(sum)+1:1);
      }
      return count;
  }
}
