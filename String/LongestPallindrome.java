import java.util.*;
import java.lang.*;
import java.io.*;
class LongestPallindrome
 {
	public static void main (String[] args)
	 {
	    Scanner sc = new Scanner(System.in);
	    if(sc.hasNext()){
	        int T = sc.nextInt();
	        while(T-->0){
	            String res="";
	            int max=0;
	            String s = sc.next();
	            for(int i=0;i<s.length();i++){
	                for(int j=i;j<s.length();j++){
	                    String str = s.substring(i,j+1);
	                    if(isPallindrome(str)&&max<str.length()){
	                        res=str;
	                        max=str.length();
	                    }
	                }
	            }
	            System.out.println(res);
	        }
	    }
	 }
	 
	 static boolean isPallindrome(String s){
	     String w="";
	     for(int i=0;i<s.length();i++){
	         char ch = s.charAt(i);
	         w = ch+w;
	     }
	     if(w.equals(s))
	        return true;
	     else
	        return false;
	 }
}
