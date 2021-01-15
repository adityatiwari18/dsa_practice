import java.io.*;
import java.util.*;

class MinSwap {
    
	public static void main (String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int testcases = Integer.parseInt(br.readLine());
		while(testcases-- > 0){
		    String line = br.readLine();
		    String[] element = line.trim().split("\\s+");
		    int sizeOfArray = Integer.parseInt(element[0]);
		     
		    int arr [] = new int[sizeOfArray];
		    
		    line = br.readLine();
		    String[] elements = line.trim().split("\\s+");
		    for(int i = 0;i<sizeOfArray;i++){
		        arr[i] = Integer.parseInt(elements[i]);
		    }
		    int K = Integer.parseInt(br.readLine());
		    
		    Complete obj = new Complete();
		    int ans = obj.minSwap(arr, sizeOfArray, K);
		    System.out.println(ans);
		}
	}
}

class Complete{
    
    public static int minSwap (int arr[], int n, int k) {
        
        int c=0;
        for(int i=0;i<n;i++){
            if(arr[i]<=k)
                ++c;
        }
        int i=0,j=c;
        int count=0;
        for(int i1=0;i1<j;i1++){
            if(arr[i1]>k){
                ++count;
            }
        }
        int res = count;
        
        while(j<n){
            if(arr[i]>k)
                --count;
            if(arr[j]>k){
                ++count;
            }
            res = Math.min(res, count);
            i++;
            j++;
        }
        return res;
    }
}
