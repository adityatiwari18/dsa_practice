import java.io.*;

class PallinString {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String S = read.readLine();
            
            Solution ob = new Solution();
            System.out.println(ob.isPlaindrome(S));
        }
    }
}
class Solution {
    int isPlaindrome(String S) {
        String w = "";
        for(int i=0;i<S.length();i++){
            char ch = S.charAt(i);
            w = ch+w;
        }
        if(w.equals(S))
            return 1;
        else
            return 0;
    }
}
