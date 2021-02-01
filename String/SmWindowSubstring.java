import java.util.*;
import java.io.*;

class SmWindowSubstring {
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		int test = scan.nextInt();
		
		while(test > 0){
		    String s = scan.next();
		    String t = scan.next();
		    
		    System.out.println(new solve().smallestWindow(s, t));
		    test--;
		}
	}
}
class solve
{
    public static String smallestWindow(String S, String P){
        
        if(S==null||P==null||S.length()<P.length()){
            return Integer.toString(-1);
        }
        int len1 = P.length();
        int len2 = S.length();
        int count=0;
        int ch[] = new int[256];
        String sub = "";
        int min = Integer.MAX_VALUE;
        int i=0,j=0;
        for(char c : P.toCharArray()){
            ch[(int)c]++;
        }
        
        char sArray[] = S.toCharArray();
        while(i<=j&&j<len2){
            
            if(count<len1){
                if(--ch[(int)sArray[j]]>=0){
                    count++;
                }
                j++;
            }else{
                if(min> j-i){
                    min = j-i;
                    sub = S.substring(i,j);
                }
                if(++ch[(int)sArray[i]]>0){
                    count--;
                }
                i++;
            }
        }
        while(count==len1){
            if(min> j-i){
                min = j-i;
                sub = S.substring(i,j);
            }
            if(++ch[(int)sArray[i]]>0){
                count--;
            }
            i++;
        }
        return (sub.length()==0)?"-1":sub;
    }
}
