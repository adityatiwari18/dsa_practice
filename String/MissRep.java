import java.io.*;
import java.util.*;

class MissRep {
    public static void main(String[] args) throws Exception {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            String[] str = br.readLine().split(" ");

            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(str[i]);
            }

            int[] ans = new Solve().findTwoElement(a, n);
            System.out.println(ans[0] + " " + ans[1]);
        }
    }
}
class Solve {
    int[] findTwoElement(int arr[], int n) {
        boolean[] flag = new boolean[n+1];
        int arr1[] = new int[2];
        for(int i=0;i<n;i++){
            if(flag[arr[i]]==true){
                arr1[0]=arr[i];
            }
            flag[arr[i]]=true;
        }
        for(int i=1;i<=n;i++){
            if(flag[i]==false){
               arr1[1] = i;
               break;
            }
        }
        return arr1;
    }
}
