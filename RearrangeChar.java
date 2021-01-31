import java.util.*;
import java.lang.*;
import java.io.*;
class RearrangeChar
 {
	public static void main (String[] args)
	 {
	    Scanner sc = new Scanner(System.in);
	    if(sc.hasNext()){
	        int t = sc.nextInt();
	        
	        while(t-->0){
	            String s = sc.next();
	            HashMap<Character, Integer> hm = new HashMap<>();
	            for(char ch:s.toCharArray()){
	                hm.put(ch, (hm.get(ch)==null)?1:hm.get(ch)+1);
	            }
	            boolean flag=true;
	            for(Map.Entry<Character, Integer> m : hm.entrySet()){
	                if(m.getValue()> (s.length()/2 + s.length()%2)){
	                    flag=false;
	                }
	            }
	            if(flag)
	                System.out.println(1);
	            else
	                System.out.println(0);
	        }
	    }
	 }
}
