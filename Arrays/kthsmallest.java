import java.io.*;
import java.util.*;
class Main {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int t=sc.nextInt();
		
		while(t-->0)
		{
		    int n=sc.nextInt();
		    
		    int arr[]=new int[n];
		    
		    for(int i=0;i<n;i++)
		    arr[i]=sc.nextInt();
		    
		    int k=sc.nextInt();
		    
		    System.out.println(kthSmallest(arr, 0, n-1, k));
		}
	}
 public static int partition(int[] arr, int l, int r){
       int pivot = arr[r];
       int i=l;
       int temp;
       for(int j=l;j<r;j++){
           if(arr[j]<=pivot){
               temp=arr[i];
               arr[i]=arr[j];
               arr[j]=temp;
               i++;
           }
       }
       temp = arr[i];
       arr[i]=pivot;
       arr[r]=temp;
       
       return i;
   }    
   public static int kthSmallest(int[] arr, int l, int r, int k) 
   { 
       if(k>0 &&  k <= r - l + 1){
           int pos = partition(arr, l, r);
           if(pos-l == k-1)
               return arr[pos];
           if(pos-l>k-1)
               return kthSmallest(arr, l, pos-1, k);
           return kthSmallest(arr, pos + 1, r, k - pos + l - 1);
       }
       return -1;
   } 
}
