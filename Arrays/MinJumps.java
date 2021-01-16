import java.lang.*;
import java.io.*;
import java.util.*;
class MinJumps
 {
	public static void main (String[] args) throws IOException
	 {
	 
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
        int t = Integer.parseInt(br.readLine()); 

        while(t-- > 0){
            int size = Integer.parseInt(br.readLine());
            String[] arrStr = ((String)br.readLine()).split("\\s+");
            int[] arr= new int[size];
            for(int i = 0;i<size;i++){
                arr[i] = Integer.parseInt(arrStr[i]);
            }
            System.out.println(new solve().minJumps(arr));
        }
	 }
	 
}
class solve{
    static int minJumps(int[] arr){
        if(arr[0]==0){
            return -1;
        }
        int jumps[] = new int[arr.length];
        for(int i=0;i<arr.length;i++){
            jumps[i] = Integer.MAX_VALUE;
        }
        jumps[0] = 0;
        for(int i=1;i<arr.length;i++){
            int c=0;
            for(int j=0;j<i;j++){
                if(arr[j]+j >= i){
                    ++c;
                    if(jumps[i]>(jumps[j]+1)){
                        jumps[i] = jumps[j]+1;
                    }
                }
            }
            if(c==0)
                    return -1;
        }
        return jumps[arr.length-1];
    }
}
