import java.io.*;
import java.util.*;
class SpiralMatrix
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int r = sc.nextInt();
            int c = sc.nextInt();
            
            int matrix[][] = new int[r][c];
            
            for(int i = 0; i < r; i++)
            {
                for(int j = 0; j < c; j++)
                 matrix[i][j] = sc.nextInt();
            }
            Solution ob = new Solution();
            ArrayList<Integer> ans = ob.spirallyTraverse(matrix, r, c);
            for (Integer val: ans) 
                System.out.print(val+" "); 
            System.out.println();
        }
    }
}
class Solution{
    static ArrayList<Integer> spirallyTraverse(int matrix[][], int r, int c)
    {
        ArrayList<Integer> res = new ArrayList<>();
        int up=0, bottom=r-1, right=c-1, left=0;
        int dire = 0;
        while(up<=bottom&&left<=right){
            if(dire==0){
                for(int i=left;i<=right;i++){
                    res.add(matrix[up][i]);
                }
                up++;
            }else if(dire==1){
                for(int i=up;i<=bottom;i++){
                    res.add(matrix[i][right]);
                }
                right--;
            }else if(dire==2){
                for(int i=right;i>=left;i--){
                    res.add(matrix[bottom][i]);
                }
                bottom--;
            }else{
                for(int i=bottom;i>=up;i--){
                    res.add(matrix[i][left]);
                }
                left++;
            }
            dire = (dire+1)%4;
        }
        return res;
    }
}

