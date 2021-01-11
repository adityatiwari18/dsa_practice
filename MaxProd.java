import java.io.*;
import java.util.*;

  class MaxProd {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        while (tc-- > 0) {
            int n = Integer.parseInt(br.readLine());
            int[] arr = new int[n];
            String[] inputLine = br.readLine().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            System.out.println(new Solution().maxProduct(arr, n));
        }
    }
}
class Solution {
    long maxProduct(int[] arr, int n) {
        long max=1, min=1,res=Long.MIN_VALUE;
        for(int i=0;i<n;i++){
            long temp = arr[i]; 
            if(temp<0){
                long t = max;
                max = min;
                min = t;
            }
            max = Math.max(temp, temp*max);
            min = Math.min(temp, temp*min);
            res = Math.max(res, max);
        }
        
        return res;
    }
}
