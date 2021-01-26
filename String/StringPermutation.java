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
	            ArrayList<String> arr = new ArrayList<>();
	            new StringPermutation().findpermutation(s, 0, l-1, arr);
	            Collections.sort(arr);
	            for(String i : arr){
	                System.out.print(i+" ");
	            }
	            System.out.println();
	        }
	    }
	 }
	    
	    void findpermutation(String s, int st, int l, ArrayList<String>arr){
	        if(st==l){
	            arr.add(s);
	        }
	        else{
    	        for(int i=st;i<=l;i++){
    	            s = swap(s, st, i);
    	            findpermutation(s, st+1, l, arr);
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
