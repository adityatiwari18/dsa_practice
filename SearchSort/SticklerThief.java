import java.util.*;
import java.io.*;

class SticklerThief
 {
	public static void main (String[] args)
	 {
	  Scanner sc = new Scanner(System.in);
	  int t = sc.nextInt();
	  while(t-- > 0){
	      int n = sc.nextInt();
	      int arr[] = new int[n];
	      for(int i = 0; i<n; ++i)
	           arr[i] = sc.nextInt();
             
  	      System.out.println(new solve().FindMaxSum(arr, n));
	 }
   }
}
class solve{
    public int FindMaxSum(int arr[], int n){
        if(n==1){
            return arr[0];
        }
        if(n==2){
            return arr[0]>arr[1]?arr[0]:arr[1];
        }
        int max[] = new int[n];
        max[0] = arr[0];
        max[1] = arr[0]>arr[1]?arr[0]:arr[1];
        for(int i=2;i<n;i++){
            int temp = arr[i]+max[i-2];
            if(temp>max[i-1])
                max[i] = temp;
            else
                max[i] = max[i-1];
        }
        
        return max[n-1];
    }
}
