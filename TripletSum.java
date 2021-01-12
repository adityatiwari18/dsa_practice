import java.util.*;
import java.io.*;
import java.lang.*;

class TripletSum
{
    public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim()); //Inputting the testcases
		while(t-->0){
		    String inputLine[] = br.readLine().trim().split(" ");
		    int n = Integer.parseInt(inputLine[0]);
		    int x = Integer.parseInt(inputLine[1]);
		    int arr[] = new int[n];
		    inputLine = br.readLine().trim().split(" ");
		    for(int i=0; i<n; i++){
		        arr[i] = Integer.parseInt(inputLine[i]);
		    }
		    System.out.println(new Triplet().find3Numbers(arr, n, x));
		}
	}
}
class Triplet
{
    public static int find3Numbers(int arr[], int N, int X) { 
    
       for(int i=0;i<N;i++){
           int num2 = X-arr[i];
           int count = 0;
           HashMap<Integer, Integer> pair = new HashMap<>();
           for(int j=0;j<N;j++){
               if(j==i)
                continue;
                
                int num=num2-arr[j];
               
                if(pair.containsKey(num)){
                    
                    return 1;
                }
                else
                {
                    if(pair.get(arr[j])==null){
                        pair.put(arr[j],1);
                    }else
                        pair.put(arr[j],pair.get(arr[j])+1);
                }
            
           }
       } 
       return 0;
    }
}
