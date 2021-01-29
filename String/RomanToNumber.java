// { Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class RomanToNumber {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));

        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String roman = br.readLine().trim();
            Solution rn = new Solution();
            System.out.println(rn.romanToDecimal(roman));
        }
    }
}
class Solution {
    public int romanToDecimal(String str) {
        HashMap<Character, Integer> hm = new HashMap<>();
        
        hm.put('I', 1);
        hm.put('V', 5);
        hm.put('X', 10);
        hm.put('L', 50);
        hm.put('C', 100);
        hm.put('D', 500);
        hm.put('M', 1000);
        int res=0;
        if(str.length()==1){
            return hm.get(str.charAt(0));
        }
        for(int i=0;i<str.length()-1;i++){
            if(hm.get(str.charAt(i))>=hm.get(str.charAt(i+1))){
                res+=hm.get(str.charAt(i));    
            }else{
                res+=(hm.get(str.charAt(i+1))-hm.get(str.charAt(i)));
                i++;
            }
        }
        return (hm.get(str.charAt(str.length()-2))>=hm.get(str.charAt(str.length()-1)))?
                res+hm.get(str.charAt(str.length()-1)):res;
    }
}
