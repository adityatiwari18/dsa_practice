import java.util.*;
import java.lang.*;
import java.io.*;
class UnionCount
 {
	public static void main (String[] args)
	 {
	    Scanner sc = new Scanner(System.in);
	    if(sc.hasNext()){
	        int T = sc.nextInt();
	        while(T-->0){
	            int N = sc.nextInt();
	            int M = sc.nextInt();
	            int a1[] = new int[N+M];
	            
	            
	            for(int i=0;i<(M+N);i++){
	                a1[i] = sc.nextInt();
	            }
	            
	            Set<Integer> s = new HashSet<Integer>();
	            for(int i : a1){
	                s.add(i);
	            }
	            System.out.println(s.size());
	        }
	    }
	 }
}
