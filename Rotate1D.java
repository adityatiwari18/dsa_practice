import java.util.*;
import java.lang.*;
import java.io.*;
class Rotate1D
 {
	public static void main (String[] args)
	 {
	    Scanner sc = new Scanner(System.in);
	    if(sc.hasNext()){
	        int T = sc.nextInt();
	        while(T-->0){
	            int N = sc.nextInt();
	            int a1[] = new int[N];
	            for(int i=0;i<N;i++){
	                a1[i] = sc.nextInt();
	            }
	            for(int i=N-1;i<2*N-1;i++){
	                System.out.print(a1[i%N]+" ");
	            }
	            System.out.println();
	        }
	    }
	 }
}
