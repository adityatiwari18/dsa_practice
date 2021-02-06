import java.util.*;
import java.io.*;
public class TreeHeightOpt
{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    String[] s = br.readLine().split(" ");
        int n = Integer.parseInt(s[0]);
        int h = Integer.parseInt(s[1]);
        String[] st = br.readLine().split(" ");
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = Integer.parseInt(st[i]);
        }
        Arrays.sort(arr);
        
        int min = arr[0];
        int max = arr[n-1];
        int fans=0;
        while(min<=max){
            int mid = (min+max)/2;
            if(isValidConfig(arr, mid, n, h)){
	        fans=mid;
	        min=mid+1;
            }else{
                max=mid-1;
            }
        }
        System.out.println(fans);
	}
	
	static boolean isValidConfig(int arr[], int mid, int n, int h){
	    int temp=0;
	    for(int i=0;i<n;i++){
	        if(arr[i]>mid){
	            temp = temp+(arr[i]-mid);
	            if(temp>=h)
	                return true;
	        }
	    }
	    return false;
	}
}
