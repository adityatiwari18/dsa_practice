import java.util.*;
import java.io.*;

/* Q. You don't need to read input or print anything. Your task is to complete the function rowWithMax1s() which takes the array of booleans arr[][], n and m as input parameters and returns the 0-based index of the first row that has the most number of 1s. If no such row exists, return -1. */


public class MatrixOnes {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            inputLine = br.readLine().trim().split(" ");
            int n = Integer.parseInt(inputLine[0]);
            int m = Integer.parseInt(inputLine[1]);
            int[][] arr = new int[n][m];
            inputLine = br.readLine().trim().split(" ");
        
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    arr[i][j] = Integer.parseInt(inputLine[i * m + j]);
                }
            }
            int ans = new Solution().rowWithMax1s(arr, n, m);
            System.out.println(ans);
        }
    }
}

class Solution {
    int rowWithMax1s(int arr[][], int n, int m) {
        int max=0,c,pos=-1;
        for(int i=0;i<n;i++){
            c=0;
            for(int j=m-1;j>=0;j--){
                if(arr[i][j]==1)
                    ++c;
                else
                    break;
            }
            if(max<c){
                max=c;
                pos=i;
            }
        }
        return pos;
    }
}
