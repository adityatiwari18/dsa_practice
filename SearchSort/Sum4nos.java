import java.io.*;
import java.util.*;

class Sum4nos {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());

        while (tc-- > 0) {
            String[] nk = br.readLine().trim().split(" ");
            int n = Integer.parseInt(nk[0]);
            int k = Integer.parseInt(nk[1]);

            String[] str = br.readLine().trim().split(" ");
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(str[i]);
            }

            Solution sln = new Solution();
            ArrayList<ArrayList<Integer>> ans = sln.fourSum(a, k);
            for (ArrayList<Integer> v : ans) {
                for (int u : v) {
                    System.out.print(u + " ");
                }
                System.out.print("$");
            }
            if (ans.isEmpty()) {
                System.out.print(-1);
            }
            System.out.println();
        }
    }
}
class Solution {
    public ArrayList<ArrayList<Integer>> fourSum(int[] arr, int k) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
        if(arr==null||arr.length==0)
            return res;
            
        Arrays.sort(arr);
        
            
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                int sum = arr[i]+arr[j];
                int left = j+1;
                int right = arr.length-1;
                while(left<right){
                    ArrayList<Integer> temp = new ArrayList<>();
                    if((arr[left]+arr[right])< (k-sum)){
                        left++;
                    }else if((arr[left]+arr[right])> (k-sum)){
                        right--;
                    }else{
                        temp.add(arr[i]);
                        temp.add(arr[j]);
                        temp.add(arr[left]);
                        temp.add(arr[right]);
                        res.add(temp);
                        left++;
                        right--;
                        
                        while(left<right&&arr[left]==temp.get(2))
                            left++;
                        while(left<right&&arr[right]==temp.get(3))
                            right--;
                    }
                }
                while(j<arr.length-1 && arr[j+1]==arr[j])
                    j++;
            }
            while(i<arr.length-1-1 && arr[i+1]==arr[i])
                    i++;
        }
        return res;
    }
}
