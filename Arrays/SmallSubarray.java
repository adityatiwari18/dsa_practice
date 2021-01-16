import java.util.*;
import java.lang.*;
import java.io.*;

class SmallSubarray {
	public static void main(String[] args) throws IOException
	{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while(t-->0)
        {
            StringTokenizer stt = new StringTokenizer(br.readLine());
            
            long n = Long.parseLong(stt.nextToken());
            long m = Long.parseLong(stt.nextToken());
            long a[] = new long[(int)(n)];
            String inputLine[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                a[i] = Long.parseLong(inputLine[i]);
            }
            
            Compute obj = new Compute();
            System.out.println(obj.sb(a, n, m));
        }
	}
}
class Compute {

    public static long sb(long a[], long n, long x) {
        
        int min = Integer.MAX_VALUE;
        
        int i=0, j=0;
        long sum=0;
        while(j<n){
            while(sum<=x&&j<n){
                sum+=a[j++];
            }
            while(sum>x&&i<=j){
                min = Math.min(min, j-i);
                sum-=a[i];
                i++;
            }
        }
        return (long)min;
    }
}
