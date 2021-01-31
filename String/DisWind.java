import java.util.*;
import java.io.*;

class DisWind {
	public static void main(String[] args) throws IOException
	{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while(t-->0)
        {
            String str = br.readLine();
            
            Compute obj = new Compute();
            System.out.println(obj.findSubString(str).length());
            
        }
	}
}
class Compute {
    public String findSubString( String str) {
        Set<Character> s = new HashSet<>();
        for(int i=0;i<str.length();i++){
            s.add(str.charAt(i));
        }
        int len = s.size();
        int i=0,j=0,i1=0,j1=0;
        HashMap<Character, Integer> hs = new HashMap<>();
        int count=0;
        int min_win = Integer.MAX_VALUE;
        while(i<=j && j<str.length()){
            if(count<len){
                count = (hs.get(str.charAt(j))==null)?count+1:count;
                hs.put(str.charAt(j),(hs.get(str.charAt(j))==null)?1:hs.get(str.charAt(j))+1);
                j++;
            }else{
                if(min_win> (j-i)){
                    min_win = j-i;
                    i1=i;
                    j1=j;
                }
                count = (hs.get(str.charAt(i))==1)?count-1:count;
                if(hs.get(str.charAt(i))==1)
                    hs.remove(str.charAt(i));
                else
                    hs.put(str.charAt(i),hs.get(str.charAt(i))-1);
                i++;
            }
        }
        while(count==len){
            if(min_win> (j-i)){
                min_win = j-i;
                i1=i;
                j1=j;
            }
            count = (hs.get(str.charAt(i))==1)?count-1:count;
            if(hs.get(str.charAt(i))==1)
                hs.remove(str.charAt(i));
            else
                hs.put(str.charAt(i),hs.get(str.charAt(i))-1);
            i++;
        }
        return str.substring(i1,j1);
    }
}
