import java.util.*;

class StringPermutation
 {
	public static void main (String[] args)
	 {
	    Scanner sc = new Scanner(System.in);
	    if(sc.hasNext()){
	        int t=sc.nextInt();
	        while(t-->0){
	            String s = sc.next();
	            
	            int l = s.length();
	            new StringPermutation().findpermutation(s, 0, l-1);
	            System.out.println();
	        }
	    }
	 }
	    
	    void findpermutation(String s, int st, int l){
	        if(st==l){
	            System.out.print(s+" ");
	        }
	        else{
    	        for(int i=st;i<=l;i++){
    	            s = swap(s, st, i);
    	            findpermutation(s, st+1, l);
    	            s = swap(s, st, i);
    	        }
	        }
	    }
	    
	    String swap(String a, int i, int j){
	        char ch; 
            char[] arr = a.toCharArray(); 
            ch = arr[i] ; 
            arr[i] = arr[j]; 
            arr[j] = ch; 
            return String.valueOf(arr);
	    }
}
