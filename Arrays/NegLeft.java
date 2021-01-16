import java.io.*;
import java.util.*;
class NegLeft {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length");
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<n;i++){
		    arr[i] = sc.nextInt();
		}
		
		int p1=0,p2=arr.length-1;
		while(p1<=p2){
		    if(arr[p1]<0&&arr[p2]>=0){
		        p1++;
		        p2--;
		    }
		    else if(arr[p1]>=0&&arr[p2]>=0){
		        p2--;
		    }
		    else if(arr[p1]>=0&&arr[p2]<0){
		        int temp = arr[p1];
		        arr[p1] = arr[p2];
		        arr[p2] = temp;
		        p1++;
		        p2--;
		    }else if(arr[p1]<0&&arr[p2]<0){
		        p1++;
		    }
		}
		for(int i=0;i<n;i++){
		    System.out.print(arr[i]+" ");
		}
	}
}
