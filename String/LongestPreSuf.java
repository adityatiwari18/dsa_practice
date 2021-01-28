import java.io.*;
import java.util.*;

class LongestPreSuf {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            
            String s = read.readLine();
            Solution ob = new Solution();
            System.out.println(ob.lps(s));
        }
    }
}

class Solution {
    int lps(String s) {
        int len=0;
        for(int i=0;i<s.length()-1;i++){
            String w1 = s.substring(0,i+1);
            String w2 = s.substring(s.length()-1-i,s.length());
            
            if(w1.equals(w2))
                len=i+1;
        }
        return len;
    }
}





