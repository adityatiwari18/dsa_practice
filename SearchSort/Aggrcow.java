import java.util.*;
public class Aggrcow
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		if(sc.hasNext()){
		    int t=sc.nextInt();
		    while(t-->0){
		        int n = sc.nextInt();
		        int c = sc.nextInt();
		        int arr[] = new int[n];
		        for(int i=0;i<n;i++){
		            arr[i] = sc.nextInt();
		        }
		        Arrays.sort(arr);
		        int min=arr[0];
		        int max=arr[n-1];
		        int fans=0;
		        while(min<=max){
		            int mid = (min+max)/2;
		            if(isValidConfig(arr,mid,c,n)){
		                fans=mid;
		                min=mid+1;
		            }else{
		                max=mid-1;
		            }
		        }
		        System.out.println(fans);
		    }
		}
	}
	static boolean isValidConfig(int arr[], int mid, int c, int n){
	    int cow=1,pos=arr[0];
	    for(int i=1;i<n;i++){
	        if(arr[i]-pos>=mid){
	            cow++;
	            pos=arr[i];
	            if(cow==c)
	                return true;
	        }
	        
	    }
	    return false;
	}
}
