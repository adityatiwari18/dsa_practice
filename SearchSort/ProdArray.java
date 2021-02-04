import java.io.*;
import java.util.*; 

class ProdArray{
    public static void main(String args[]) throws IOException { 
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t > 0){
        	int n = sc.nextInt();
        	int[] array = new int[n];
        	for (int i=0; i<n ; i++ ) {
        		array[i] = sc.nextInt();
        	}
            Solution ob = new Solution();
            long[] ans = new long[n];
            ans = ob.productExceptSelf(array, n); 

           	for (int i = 0; i < n; i++) { 
				System.out.print(ans[i]+" ");
			} 
            System.out.println();
            t--;
        }
    } 
} 
class Solution 
{ 
	public static long[] productExceptSelf(int arr[], int n) 
	{ 
        long prod=1,c=0;
        for(int i=0;i<n;i++){
            if(arr[i]!=0)
                prod*=arr[i];
            else
                ++c;
        }
        long[] pro = new long[n];
        if(c>1)
            return pro;
        for(int i=0;i<n;i++){
            if(arr[i]!=0)
                pro[i] = (c==1)?0:prod/arr[i];
            else
                pro[i] = prod;
        }
        return pro;
	}
} 
