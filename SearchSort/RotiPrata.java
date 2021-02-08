import java.util.*;
public class RotiPrata
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		if(sc.hasNext()){
		    int t=sc.nextInt();
		    while(t-->0){
		        int c = sc.nextInt();
		        int n = sc.nextInt();
		        int arr[] = new int[n];
		        for(int i=0;i<n;i++){
		            arr[i] = sc.nextInt();
		        }
		        Arrays.sort(arr);
		        int min=0;
		        int max=(int)Math.pow(10,8);
		        int fans=0;
		        while(min<=max){
		            int mid = (min+max)/2;
		            if(isValidConfig(arr,mid,c,n)){
		                fans=mid;
		                max=mid-1;
		            }else{
		                min=mid+1;
		            }
		        }
		        System.out.println(fans);
		    }
		}
	}
	static boolean isValidConfig(int[] arr, int mid, int c, int n){
	    int count=0;
	    for(int i=0;i<n;i++){
	        int temp=arr[i],p=1;
	        while(temp<=mid){
	            ++count;
	            p++;
	            temp = temp+(arr[i]*p);
	        }
	        if(count>=c){
	            return true;
	        }
	    }
	    return false;
	}
}
