import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;

public class Isomorphic {
    
    public static void main(String[] args)throws IOException {
       
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        while(tc-->0)
        {
            String s1 = br.readLine();
            String s2 = br.readLine();
            
            Iso obj = new Iso();
            
            boolean a = obj.areIsomorphic(s1,s2);
            if(a)
            System.out.println(1);
            else
            System.out.println(0);
        }
    }
    
}
class Iso{
    public static boolean areIsomorphic(String str1,String str2)
    {
        if(str1.length()!=str2.length()){
            return false;
        }
        int[] ch1 = new int[128];
        int[] ch2 = new int[128];
        for(int i=0;i<str1.length();i++){
            if(ch1[(int)str1.charAt(i)]!=ch2[(int)str2.charAt(i)]){
                return false;
            }else{
                ch1[(int)str1.charAt(i)]++;
                ch2[(int)str2.charAt(i)]++;
            }
        }
        
        return true;
    }
}
