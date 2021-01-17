import java.util.*;
class MatrixSearch
{
    public static void main(String args[])
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
            int target = sc.nextInt();
            Solution ob = new Solution();

            System.out.println(ob.searchMatrix(matrix, target));
        }
    }
}
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int pos=0;
        for(int i=0;i<matrix.length;i++){
            if(target<=matrix[i][matrix[0].length-1]){
                pos = i;
                break;
            }
            
        }
        
        int min =0;
        int max =matrix[0].length-1;
        
        while(min<=max){
            int mid = (min+max)/2;
            if(matrix[pos][mid]==target){
                return true;
            }else if(matrix[pos][mid]>target){
                max = mid-1;
            }else{
                min = mid+1;
            }
        }
        return false;
    }
}
