import java.io.*;
class LongestSubseq
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            String str = br.readLine().trim();
            Solution ob = new Solution();
            int ans = ob.LongestRepeatingSubsequence(str);
            System.out.println(ans);
        }
    }
}

class Solution
{
    public int LongestRepeatingSubsequence(String str)
    {
        String res="";
        for(int i=0;i<str.length();i++){
            String temp="";
            for(int j=i+1;j<str.length();j++){
                if(str.charAt(i)==str.charAt(j)){
                    temp = temp + str.charAt(j);
                }
            }
            if(temp.length()>res.length())
                res=temp;
        }
        
        return res.length();
    }
}
