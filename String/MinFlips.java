/*  Given a binary string, that is it contains only 0s and 1s.
    We need to make this string a sequence of alternate characters 
    by flipping some of the bits, our goal is to minimize the number
    of bits to be flipped.  */

import java.util.*;
class MinFlips
 {
	public static void main (String[] args)
	 {
	    Scanner sc = new Scanner(System.in);
	    if(sc.hasNext()){
	        int t = sc.nextInt();
	        while(t-->0){
	            String s = sc.next();
	            int n = check(s.toCharArray());
	            System.out.println(n);
	        }
	    }
	 }
	 
	 static int check(char[] ch){
	     
	     int c1=0,c2=0;
	     for(int i=0;i<ch.length;i++){
	         if(i%2==0){
	             if(ch[i]!='0')
	                ++c1;
	             if(ch[i]!='1')
	                ++c2;
	         }else{
	             if(ch[i]!='1')
	                ++c1;
	             if(ch[i]!='0')
	                ++c2;
	         }
	     }
	     return (c1<c2)?c1:c2;
	 }
}
