import java.io.*;
import java.util.*;
class PageAlloc {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int t=sc.nextInt();
		
		while(t-->0)
		{
		    int n=sc.nextInt();
		    int a[]=new int[n];
		    
		    for(int i=0;i<n;i++)
		    {
		        a[i]=sc.nextInt();
		    }
		    int m=sc.nextInt();
		    System.out.println(findPages(a,n,m));
		}
	}

public static int findPages(int[]a,int n,int m)
{
    int min=0;
    int max=0;
    for(int i=0;i<n;i++){
        min=Math.max(min,a[i]);
        max+=a[i];
    }
    if(a.length<m)
        return -1;
    int fsum=0;
    int mid=0;
    while(min<=max){
        int k=1;
        int temp=0;
        mid = min+(max-min)/2;
        for(int i=0;i<n;i++){
            
            if(temp+a[i]<=mid)
                temp+=a[i];
            else{
                ++k;
                temp=a[i];
            }
        }
            if(k>m){
                min=mid+1;
            }
            else if(k<m){
                max=mid-1;
            }else{
                max=mid-1;
                fsum=mid;
            }
    }
    return fsum==0?min:fsum;
}
