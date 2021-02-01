import java.io.*;
import java.util.*;

class AdjDupRemoval {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            
            String S = read.readLine().trim();
            
            Solution ob = new Solution();
            String ans = ob.removeConsecutiveCharacter(S);
            
            System.out.println(ans);
        }
    }
}
class Solution{
    public String removeConsecutiveCharacter(String s){
        if(s==null||s.length()==1)
            return s;
        Stack<Character> st = new Stack<>();
        int l = s.length();
        while(--l >=0){
            if(st.size()==0){
                st.push(s.charAt(l));
                continue;
            }
            else if(st.peek().equals(s.charAt(l))){
                continue;
            }else{
                st.push(s.charAt(l));
            }
        }
        Iterator value = st.iterator(); 
        String res="";
        while (value.hasNext()) { 
            res= value.next()+res; 
        } 
        
        return res;
    }
}
