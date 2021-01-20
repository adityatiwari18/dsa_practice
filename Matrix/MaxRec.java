import java.util.*;
import java.lang.*;
class MaxRect {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int m = sc.nextInt();
            int n = sc.nextInt();
            int[][] a = new int[1000][1000];
            for (int i = 0; i < m; i++)
                for (int j = 0; j < n; j++) a[i][j] = sc.nextInt();
            GfG g = new GfG();

            System.out.println(g.maxArea(a, m, n));
        }
    }
}

class GfG {
    public int maxArea(int M[][], int m, int n) {
        
        int h[] = new int[n];
        int max=-1;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(M[i][j]!=0){
                    h[j]+=M[i][j];
                }else{
                    h[j] = 0;
                }
            }
            max = Math.max(max, area(h,n));
        }
        return max;
    }
    static int area(int[] h, int n){
        int max = 0;
        Stack<Integer> st = new Stack<>();
        st.push(0);
        for(int i=1;i<n;i++){
            if(h[i]>=h[st.peek()]){
                st.add(i);
            }else{
                while(!st.isEmpty() && h[st.peek()]>h[i]){
                    int temp = h[st.pop()];
                    if(st.isEmpty())
                        max = Math.max(max, temp*i);
                    else
                        max = Math.max(max, temp*(i-st.peek()-1));
                }
                st.add(i);
            }
        }
        if(!st.isEmpty()){
            int i = h.length;
            
            while(!st.isEmpty()){
                int temp = h[st.pop()];
                if(st.isEmpty())
                    max = Math.max(max, temp*i);
                else
                    max = Math.max(max, temp*(i-st.peek()-1));
            }
        }
        return max;
    }
}
