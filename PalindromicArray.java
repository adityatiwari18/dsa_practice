import java.util.*;

class PalindromicArray{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0)
		{
			int n = sc.nextInt();
			int[] a = new int[n];
			for(int i = 0 ;i < n; i++)
				a[i]=sc.nextInt();
			Check g = new Check();
			System.out.println(g.palinArray(a , n));
		}
	}
}

class Check
{
	public static int palinArray(int[] a, int n){
        for(int i=0;i<n;i++){
            boolean res = pallindrome(a[i]);
            if(res==false)
                return 0;
                
        }
        return 1;
    }
    
    static boolean pallindrome(int num){
        int n = num, rev = 0;
        while(num!=0){
            int r = num%10;
            rev = rev*10+r;
            num/=10;
        }
        
        if(rev==n)
            return true;
        else
            return false;
    }
}
