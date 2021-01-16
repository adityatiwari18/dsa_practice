import java.io.*;

class Kadanes {
    
	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim()); //Inputting the testcases
		while(t-->0){
		    //size of array
		    int n = Integer.parseInt(br.readLine().trim());
		    int arr[] = new int[n];
		    String inputLine[] = br.readLine().trim().split(" ");
		    
		    //adding elements
		    for(int i=0; i<n; i++){
		        arr[i] = Integer.parseInt(inputLine[i]);
		    }
		    
		    Kadane obj = new Kadane();
		    System.out.println(obj.maxSubarraySum(arr, n));
		}
	}
}

class Kadane{

    int maxSubarraySum(int arr[], int n){
        int cursum=0, maxsum=Integer.MIN_VALUE,c=0;
        for(int i=0;i<n;i++){
            cursum+=arr[i];
            if(cursum<0){
                ++c;
                cursum=0;
            }
            if(maxsum<cursum){
                maxsum=cursum;
            }
        }
        if(c==n){
            int max=Integer.MIN_VALUE;
            for(int i=0;i<n;i++){
                if(arr[i]>max)
                    max=arr[i];
            }
            return max;
        }
        return maxsum;
    }   
}

