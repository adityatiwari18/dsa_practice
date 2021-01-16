import java.util.*;
import java.lang.*;
import java.io.*;

class ZeroSum {
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
    
		int t = scan.nextInt();
		while(t>0)
		{
		    int n = scan.nextInt() ;
		    
		    //Declaring and Initializing an array of size n
		    int arr[] = new int[n];
		    
		    //adding elements to the array
		    for(int i = 0; i<n;i++)
		    {
		        arr[i] = scan.nextInt();
		    }
		    
		    t--;
		    System.out.println(findsum(arr,n)==true?"Yes":"No");
		}
	}

  static boolean findsum(int arr[],int n){
      Set<Integer> set = new HashSet<Integer>();
      int sum=0;
      for(int i=0;i<n;i++){
        set.add(sum);
        sum+=arr[i];
        if(set.contains(sum))
            return true;
        }
        return false;
   }
}
