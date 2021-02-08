import java.util.*;
public class TrailingZeroes
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        
        while (t-- > 0)
        {
            int n = sc.nextInt();
            
            System.out.println(new Solution().findNum(n));
        }
    }
}
class Solution
{
    int findNum(int n)
    {
        int ans=0,i=1;
        while(true){
            int sum=0;
            int pow=5;
            
            while((i/pow)!=0){
                sum+=(i/pow);
                pow=pow*5;
            }
            if(sum==n){
                ans=i;
                break;
            }
            i++;
        }
        return ans;
    }
}
