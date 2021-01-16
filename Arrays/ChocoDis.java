import java.util.*;
import java.lang.*;
import java.io.*;
class ChocoDis
 {
	public static void main (String[] args){
	
	    Scanner sc = new Scanner(System.in);
	    int t = sc.nextInt();
	    
	    while(t-->0){
	        int n = sc.nextInt();
	        int arr[] = new int[n];
	        for(int i=0;i<n;i++){
	            arr[i] = sc.nextInt();
	        }
	        int c = sc.nextInt();
	        Arrays.sort(arr);
	        int diff[] = new int[n];
	        diff[0] = 0;
	        for(int i=1;i<n;i++){
	            diff[i] = diff[i-1]+(arr[i]-arr[i-1]); 
	        }
	        c-=1;
	        int start = 0, min=Integer.MAX_VALUE;
	        while(c<n){
	            if(min > (diff[c]-diff[start]))
	                min = diff[c]-diff[start];
	            ++start;
	            ++c;
	        }
	        System.out.println(min);
	    }
    }
}
