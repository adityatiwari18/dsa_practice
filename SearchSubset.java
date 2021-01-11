import java.util.*;
import java.lang.*;
import java.io.*;
class SearchSubset
 {
	public static void main (String[] args){
	    
	    Scanner sc = new Scanner(System.in);
	    int t = sc.nextInt();
	    
	    while(t!=0){
	        
	        int n = sc.nextInt();
	        int m = sc.nextInt();
	        
	        int a1[] = new int[n];
	        int a2[] = new int[m];
	        
	        for(int i=0;i<n;i++){
	            a1[i] = sc.nextInt();
	        }
	        for(int i=0;i<m;i++){
	            a2[i] = sc.nextInt();
	        }
	        Arrays.sort(a1);
	        Arrays.sort(a2);
	        
	        new SearchSubset().search(a1,a2,n,m);
	        t--;
	    }
	}
	
	void search(int[] a1, int[] a2, int n, int m){
	    int c=0;
	    for(int i=0;i<m;i++){
	        
	        int min=0;
	        int max=n-1;
	        
	        while(min<=max){
	            int mid=(max+min)/2;
    	        if(a1[mid]==a2[i]){
    	            ++c;
    	            break;
    	        }if(a1[mid]>a2[i]){
    	            max=mid-1;
    	        }else{
    	            min=mid+1;
    	        }
	        }
	    }
	    if(c==a2.length)
	        System.out.println("YES");
	    else
	        System.out.println("NO");
	}
}
