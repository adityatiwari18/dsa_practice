import java.io.*;
import java.util.*;
import java.lang.*;

class WaterTrap {

	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim());
		while(t-->0){

		    int n = Integer.parseInt(br.readLine().trim());
		    int arr[] = new int[n];
		    String inputLine[] = br.readLine().trim().split(" ");
		    for(int i=0; i<n; i++){
		        arr[i] = Integer.parseInt(inputLine[i]);
		    }
		    
		    Trap obj = new Trap();
		    System.out.println(obj.trappingWater(arr, n));
		}
	}
}
class Trap{
    static int trappingWater(int arr[], int n) { 
        int lHigh[] = new int[n];
        lHigh[0] = arr[0];
        for(int i=1;i<n;i++){
            lHigh[i] = Math.max(lHigh[i-1], arr[i]);
        }
        int rHigh[] = new int[n];
        rHigh[n-1] = arr[n-1];
        for(int i=n-2;i>=0;i--){
            rHigh[i] = Math.max(rHigh[i+1], arr[i]);
        }
        
        int vol = 0;
        for(int i=1;i<n-1;i++){
            int fill = Math.min(lHigh[i], rHigh[i]);
            vol=vol+ (fill-arr[i]);   
        }
        return vol;
    } 
}
